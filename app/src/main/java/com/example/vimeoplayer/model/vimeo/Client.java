package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Client{

	@SerializedName("ip")
	private String ip;

	public void setIp(String ip){
		this.ip = ip;
	}

	public String getIp(){
		return ip;
	}
}