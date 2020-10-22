package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class GcDebug{

	@SerializedName("bucket")
	private String bucket;

	public void setBucket(String bucket){
		this.bucket = bucket;
	}

	public String getBucket(){
		return bucket;
	}
}