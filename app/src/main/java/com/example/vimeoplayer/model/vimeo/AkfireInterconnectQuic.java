package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class AkfireInterconnectQuic{

	@SerializedName("avc_url")
	private String avcUrl;

	@SerializedName("origin")
	private String origin;

	@SerializedName("url")
	private String url;

	public void setAvcUrl(String avcUrl){
		this.avcUrl = avcUrl;
	}

	public String getAvcUrl(){
		return avcUrl;
	}

	public void setOrigin(String origin){
		this.origin = origin;
	}

	public String getOrigin(){
		return origin;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}
}