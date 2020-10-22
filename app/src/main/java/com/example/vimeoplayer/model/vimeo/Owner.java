package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Owner{

	@SerializedName("account_type")
	private String accountType;

	@SerializedName("img")
	private String img;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("url")
	private String url;

	@SerializedName("img_2x")
	private String img2x;

	public void setAccountType(String accountType){
		this.accountType = accountType;
	}

	public String getAccountType(){
		return accountType;
	}

	public void setImg(String img){
		this.img = img;
	}

	public String getImg(){
		return img;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setImg2x(String img2x){
		this.img2x = img2x;
	}

	public String getImg2x(){
		return img2x;
	}
}