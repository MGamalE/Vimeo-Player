package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Sentry{

	@SerializedName("debug_intent")
	private int debugIntent;

	@SerializedName("debug_enabled")
	private boolean debugEnabled;

	@SerializedName("url")
	private String url;

	@SerializedName("enabled")
	private boolean enabled;

	public void setDebugIntent(int debugIntent){
		this.debugIntent = debugIntent;
	}

	public int getDebugIntent(){
		return debugIntent;
	}

	public void setDebugEnabled(boolean debugEnabled){
		this.debugEnabled = debugEnabled;
	}

	public boolean isDebugEnabled(){
		return debugEnabled;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setEnabled(boolean enabled){
		this.enabled = enabled;
	}

	public boolean isEnabled(){
		return enabled;
	}
}