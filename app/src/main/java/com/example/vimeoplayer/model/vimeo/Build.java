package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Build{

	@SerializedName("js")
	private String js;

	@SerializedName("backend")
	private String backend;

	public void setJs(String js){
		this.js = js;
	}

	public String getJs(){
		return js;
	}

	public void setBackend(String backend){
		this.backend = backend;
	}

	public String getBackend(){
		return backend;
	}
}