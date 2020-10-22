package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Webvr{

	@SerializedName("data")
	private Data data;

	@SerializedName("track")
	private boolean track;

	@SerializedName("group")
	private boolean group;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setTrack(boolean track){
		this.track = track;
	}

	public boolean isTrack(){
		return track;
	}

	public void setGroup(boolean group){
		this.group = group;
	}

	public boolean isGroup(){
		return group;
	}
}