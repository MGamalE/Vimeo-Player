package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Dash{

	@SerializedName("streams_avc")
	private List<StreamsAvcItem> streamsAvc;

	@SerializedName("default_cdn")
	private String defaultCdn;

	@SerializedName("separate_av")
	private boolean separateAv;

	@SerializedName("streams")
	private List<StreamsItem> streams;

	@SerializedName("cdns")
	private Cdns cdns;

	public void setStreamsAvc(List<StreamsAvcItem> streamsAvc){
		this.streamsAvc = streamsAvc;
	}

	public List<StreamsAvcItem> getStreamsAvc(){
		return streamsAvc;
	}

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

	public void setStreams(List<StreamsItem> streams){
		this.streams = streams;
	}

	public List<StreamsItem> getStreams(){
		return streams;
	}

	public void setCdns(Cdns cdns){
		this.cdns = cdns;
	}

	public Cdns getCdns(){
		return cdns;
	}
}