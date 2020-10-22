package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Files{

	@SerializedName("progressive")
	private List<ProgressiveItem> progressive;

//	@SerializedName("dash")
//	private Dash dash;
//
//	@SerializedName("hls")
//	private Hls hls;

	public void setProgressive(List<ProgressiveItem> progressive){
		this.progressive = progressive;
	}

	public List<ProgressiveItem> getProgressive(){
		return progressive;
	}

//	public void setDash(Dash dash){
//		this.dash = dash;
//	}
//
//	public Dash getDash(){
//		return dash;
//	}
//
//	public void setHls(Hls hls){
//		this.hls = hls;
//	}
//
//	public Hls getHls(){
//		return hls;
//	}
}