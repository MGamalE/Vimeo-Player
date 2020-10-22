package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Settings{

	@SerializedName("watch_later")
	private int watchLater;

	@SerializedName("scaling")
	private int scaling;

	@SerializedName("spatial_compass")
	private int spatialCompass;

	@SerializedName("color")
	private int color;

	@SerializedName("like")
	private int like;

	@SerializedName("playbar")
	private int playbar;

	@SerializedName("title")
	private int title;

	@SerializedName("portrait")
	private int portrait;

	@SerializedName("speed")
	private int speed;

	@SerializedName("volume")
	private int volume;

	@SerializedName("badge")
	private Badge badge;

	@SerializedName("fullscreen")
	private int fullscreen;

	@SerializedName("info_on_pause")
	private int infoOnPause;

	@SerializedName("collections")
	private int collections;

	@SerializedName("logo")
	private int logo;

	@SerializedName("share")
	private int share;

	@SerializedName("spatial_label")
	private int spatialLabel;

	@SerializedName("embed")
	private int embed;

	@SerializedName("byline")
	private int byline;

	public void setWatchLater(int watchLater){
		this.watchLater = watchLater;
	}

	public int getWatchLater(){
		return watchLater;
	}

	public void setScaling(int scaling){
		this.scaling = scaling;
	}

	public int getScaling(){
		return scaling;
	}

	public void setSpatialCompass(int spatialCompass){
		this.spatialCompass = spatialCompass;
	}

	public int getSpatialCompass(){
		return spatialCompass;
	}

	public void setColor(int color){
		this.color = color;
	}

	public int getColor(){
		return color;
	}

	public void setLike(int like){
		this.like = like;
	}

	public int getLike(){
		return like;
	}

	public void setPlaybar(int playbar){
		this.playbar = playbar;
	}

	public int getPlaybar(){
		return playbar;
	}

	public void setTitle(int title){
		this.title = title;
	}

	public int getTitle(){
		return title;
	}

	public void setPortrait(int portrait){
		this.portrait = portrait;
	}

	public int getPortrait(){
		return portrait;
	}

	public void setSpeed(int speed){
		this.speed = speed;
	}

	public int getSpeed(){
		return speed;
	}

	public void setVolume(int volume){
		this.volume = volume;
	}

	public int getVolume(){
		return volume;
	}

	public void setBadge(Badge badge){
		this.badge = badge;
	}

	public Badge getBadge(){
		return badge;
	}

	public void setFullscreen(int fullscreen){
		this.fullscreen = fullscreen;
	}

	public int getFullscreen(){
		return fullscreen;
	}

	public void setInfoOnPause(int infoOnPause){
		this.infoOnPause = infoOnPause;
	}

	public int getInfoOnPause(){
		return infoOnPause;
	}

	public void setCollections(int collections){
		this.collections = collections;
	}

	public int getCollections(){
		return collections;
	}

	public void setLogo(int logo){
		this.logo = logo;
	}

	public int getLogo(){
		return logo;
	}

	public void setShare(int share){
		this.share = share;
	}

	public int getShare(){
		return share;
	}

	public void setSpatialLabel(int spatialLabel){
		this.spatialLabel = spatialLabel;
	}

	public int getSpatialLabel(){
		return spatialLabel;
	}

	public void setEmbed(int embed){
		this.embed = embed;
	}

	public int getEmbed(){
		return embed;
	}

	public void setByline(int byline){
		this.byline = byline;
	}

	public int getByline(){
		return byline;
	}
}