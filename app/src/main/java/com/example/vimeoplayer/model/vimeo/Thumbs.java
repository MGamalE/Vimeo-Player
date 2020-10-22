package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Thumbs{

	@SerializedName("640")
	private String jsonMember640;

	@SerializedName("960")
	private String jsonMember960;

	@SerializedName("1280")
	private String jsonMember1280;

	@SerializedName("base")
	private String base;

	public void setJsonMember640(String jsonMember640){
		this.jsonMember640 = jsonMember640;
	}

	public String getJsonMember640(){
		return jsonMember640;
	}

	public void setJsonMember960(String jsonMember960){
		this.jsonMember960 = jsonMember960;
	}

	public String getJsonMember960(){
		return jsonMember960;
	}

	public void setJsonMember1280(String jsonMember1280){
		this.jsonMember1280 = jsonMember1280;
	}

	public String getJsonMember1280(){
		return jsonMember1280;
	}

	public void setBase(String base){
		this.base = base;
	}

	public String getBase(){
		return base;
	}
}