package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Hevc{

	@SerializedName("sdr")
	private List<Object> sdr;

	@SerializedName("hdr")
	private List<Object> hdr;

	public void setSdr(List<Object> sdr){
		this.sdr = sdr;
	}

	public List<Object> getSdr(){
		return sdr;
	}

	public void setHdr(List<Object> hdr){
		this.hdr = hdr;
	}

	public List<Object> getHdr(){
		return hdr;
	}
}