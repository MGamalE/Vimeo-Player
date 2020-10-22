package com.example.vimeoplayer.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.vimeoplayer.R;
import com.example.vimeoplayer.model.vimeo.VimeoResponse;
import com.example.vimeoplayer.network.VimeoClientAPI;
import com.example.vimeoplayer.network.VimeoInterface;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.util.Util;
import com.vimeo.networking.Configuration;
import com.vimeo.networking.VimeoClient;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getName();

    /**
     * You have to sign up as developer with vimeo developer dashboard <a href="https://developer.vimeo.com/">the developer console</a>
     * <p>
     * VIMEO_ACCESS_TOKEN you can it from <a href="https://developer.vimeo.com/apps/192457#generate_access_token">the developer console</a>
     */
    private static final String VIMEO_ACCESS_TOKEN = "b45cae7771a62a78b359dd059008a632";

    private static final String VIMDEO_ID = "470951878";

    private PlayerView playerView;
    private SimpleExoPlayer player;

    //Release references
    private boolean playWhenReady = false; //If true the player auto play the media
    private int currentWindow = 0;
    private long playbackPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Reference exoplayer view
        playerView = findViewById(R.id.video_view);
        Button playBtn = findViewById(R.id.button2);

        playBtn.setOnClickListener(this);

        //Build vimeo configuration
        configVimeoClient();
    }

    private void configVimeoClient() {
        Configuration.Builder configBuilder =
                new Configuration.Builder(MainActivity.VIMEO_ACCESS_TOKEN) //Pass app access token
                        .setCacheDirectory(this.getCacheDir());
        VimeoClient.initialize(configBuilder.build());
    }

    private void createMediaItem(String url) {
        MediaItem mediaItem = MediaItem.fromUri(url);
        player.setMediaItem(mediaItem);
    }

    private void initializePlayer() {
        //To play streaming media, you need an ExoPlayer object.
        //SimpleExoPlayer is a convenient, all-purpose implementation of the ExoPlayer interface.
        player = new SimpleExoPlayer.Builder(this).build();
        playerView.setPlayer(player);


        callVimeoAPIRequest();

        //Supply the state information you saved in releasePlayer to your player during initialization.
        player.setPlayWhenReady(playWhenReady);
        player.seekTo(currentWindow, playbackPosition);
        player.prepare();
    }

    private void callVimeoAPIRequest() {
        VimeoInterface vimeoInterface = VimeoClientAPI.getClient().create(VimeoInterface.class);
        vimeoInterface.getVimeoUrlResponse(VIMDEO_ID)
                .enqueue(new retrofit2.Callback<VimeoResponse>() {
                    @Override
                    public void onResponse(@NotNull Call<VimeoResponse> call, @NotNull Response<VimeoResponse> response) {
                        if (response.isSuccessful() && response.body() != null) {

                            //Create media item
                            if (response.body().getRequest().getFiles().getProgressive().size() > 0)
                                createMediaItem(response.body().getRequest().getFiles().getProgressive().get(0).getUrl());

                            Log.d(TAG, response.body().getRequest().getFiles().getProgressive().get(0).getUrl());
                        }
                    }

                    @Override
                    public void onFailure(@NotNull Call<VimeoResponse> call, @NotNull Throwable t) {
                        Log.e(TAG, Objects.requireNonNull(t.getMessage()));

                    }
                });
    }


    @SuppressLint("InlinedApi")
    private void hideSystemUi() {
        playerView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }


    @Override
    public void onStart() {
        super.onStart();
        if (Util.SDK_INT >= 24) {
            //Init exoplayer builder
            initializePlayer();
        }
    }

    /**
     * Android API level 24 and higher supports multiple windows.
     * As your app can be visible, but not active in split window mode, you need to initialize the player in onStart.
     * Android API level 24 and lower requires you to wait as long as possible until you grab resources,
     * so you wait until onResume before initializing the player.
     */
    @Override
    public void onResume() {
        super.onResume();
        //Helper method which allows you to have a full-screen experience.
        hideSystemUi();
        if ((Util.SDK_INT < 24 || player == null)) {
            //Init exoplayer builder
            initializePlayer();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (Util.SDK_INT < 24) {
            //Frees the player's resources and destroys it.
            releasePlayer();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (Util.SDK_INT >= 24) {
            //Frees the player's resources and destroys it.
            releasePlayer();
        }
    }

    private void releasePlayer() {
        if (player != null) {
            playWhenReady = player.getPlayWhenReady();
            playbackPosition = player.getCurrentPosition();
            currentWindow = player.getCurrentWindowIndex();
            player.release();
            player = null;
        }
    }

    @Override
    public void onClick(View v) {
        player.setPlayWhenReady(true);
    }
}
