package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Cookie{

	@SerializedName("volume")
	private double volume;

	@SerializedName("scaling")
	private int scaling;

	@SerializedName("hd")
	private int hd;

	@SerializedName("captions")
	private Object captions;

	@SerializedName("quality")
	private Object quality;

	public void setVolume(double volume){
		this.volume = volume;
	}

	public double getVolume(){
		return volume;
	}

	public void setScaling(int scaling){
		this.scaling = scaling;
	}

	public int getScaling(){
		return scaling;
	}

	public void setHd(int hd){
		this.hd = hd;
	}

	public int getHd(){
		return hd;
	}

	public void setCaptions(Object captions){
		this.captions = captions;
	}

	public Object getCaptions(){
		return captions;
	}

	public void setQuality(Object quality){
		this.quality = quality;
	}

	public Object getQuality(){
		return quality;
	}
}