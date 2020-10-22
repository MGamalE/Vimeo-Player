package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class AbTests{

	@SerializedName("chromecast")
	private Chromecast chromecast;

	@SerializedName("stats_fresnel")
	private StatsFresnel statsFresnel;

	@SerializedName("webvr")
	private Webvr webvr;

	public void setChromecast(Chromecast chromecast){
		this.chromecast = chromecast;
	}

	public Chromecast getChromecast(){
		return chromecast;
	}

	public void setStatsFresnel(StatsFresnel statsFresnel){
		this.statsFresnel = statsFresnel;
	}

	public StatsFresnel getStatsFresnel(){
		return statsFresnel;
	}

	public void setWebvr(Webvr webvr){
		this.webvr = webvr;
	}

	public Webvr getWebvr(){
		return webvr;
	}
}