package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Hls{

	@SerializedName("default_cdn")
	private String defaultCdn;

	@SerializedName("separate_av")
	private boolean separateAv;

	@SerializedName("cdns")
	private Cdns cdns;

	public void setDefaultCdn(String defaultCdn){
		this.defaultCdn = defaultCdn;
	}

	public String getDefaultCdn(){
		return defaultCdn;
	}

	public void setSeparateAv(boolean separateAv){
		this.separateAv = separateAv;
	}

	public boolean isSeparateAv(){
		return separateAv;
	}

	public void setCdns(Cdns cdns){
		this.cdns = cdns;
	}

	public Cdns getCdns(){
		return cdns;
	}
}