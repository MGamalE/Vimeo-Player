package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class VimeoResponse{



	@SerializedName("request")
	private Request request;


	public void setRequest(Request request){
		this.request = request;
	}

	public Request getRequest(){
		return request;
	}


}