package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Badge{

	@SerializedName("img")
	private String img;

	@SerializedName("margin")
	private String margin;

	@SerializedName("svg")
	private String svg;

	@SerializedName("name")
	private String name;

	@SerializedName("width")
	private int width;

	@SerializedName("link")
	private String link;

	@SerializedName("id")
	private int id;

	@SerializedName("height")
	private int height;

	@SerializedName("img_2x")
	private String img2x;

	public void setImg(String img){
		this.img = img;
	}

	public String getImg(){
		return img;
	}

	public void setMargin(String margin){
		this.margin = margin;
	}

	public String getMargin(){
		return margin;
	}

	public void setSvg(String svg){
		this.svg = svg;
	}

	public String getSvg(){
		return svg;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setLink(String link){
		this.link = link;
	}

	public String getLink(){
		return link;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	public void setImg2x(String img2x){
		this.img2x = img2x;
	}

	public String getImg2x(){
		return img2x;
	}
}