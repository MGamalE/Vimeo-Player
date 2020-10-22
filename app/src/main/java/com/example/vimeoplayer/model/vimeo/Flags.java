package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Flags{

	@SerializedName("plays")
	private int plays;

	@SerializedName("dnt")
	private int dnt;

	@SerializedName("preload_video")
	private String preloadVideo;

	@SerializedName("autohide_controls")
	private int autohideControls;

	@SerializedName("partials")
	private int partials;

	public void setPlays(int plays){
		this.plays = plays;
	}

	public int getPlays(){
		return plays;
	}

	public void setDnt(int dnt){
		this.dnt = dnt;
	}

	public int getDnt(){
		return dnt;
	}

	public void setPreloadVideo(String preloadVideo){
		this.preloadVideo = preloadVideo;
	}

	public String getPreloadVideo(){
		return preloadVideo;
	}

	public void setAutohideControls(int autohideControls){
		this.autohideControls = autohideControls;
	}

	public int getAutohideControls(){
		return autohideControls;
	}

	public void setPartials(int partials){
		this.partials = partials;
	}

	public int getPartials(){
		return partials;
	}
}