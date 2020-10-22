package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class StreamsAvcItem{

	@SerializedName("profile")
	private int profile;

	@SerializedName("fps")
	private int fps;

	@SerializedName("id")
	private String id;

	@SerializedName("quality")
	private String quality;

	public void setProfile(int profile){
		this.profile = profile;
	}

	public int getProfile(){
		return profile;
	}

	public void setFps(int fps){
		this.fps = fps;
	}

	public int getFps(){
		return fps;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setQuality(String quality){
		this.quality = quality;
	}

	public String getQuality(){
		return quality;
	}
}