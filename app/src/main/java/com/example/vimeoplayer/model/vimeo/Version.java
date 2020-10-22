package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Version{

	@SerializedName("current")
	private Object current;

	@SerializedName("available")
	private Object available;

	public void setCurrent(Object current){
		this.current = current;
	}

	public Object getCurrent(){
		return current;
	}

	public void setAvailable(Object available){
		this.available = available;
	}

	public Object getAvailable(){
		return available;
	}
}