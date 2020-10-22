package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FileCodecs{

	@SerializedName("hevc")
	private Hevc hevc;

	@SerializedName("av1")
	private List<Object> av1;

	@SerializedName("avc")
	private List<String> avc;

	public void setHevc(Hevc hevc){
		this.hevc = hevc;
	}

	public Hevc getHevc(){
		return hevc;
	}

	public void setAv1(List<Object> av1){
		this.av1 = av1;
	}

	public List<Object> getAv1(){
		return av1;
	}

	public void setAvc(List<String> avc){
		this.avc = avc;
	}

	public List<String> getAvc(){
		return avc;
	}
}