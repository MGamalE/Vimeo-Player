package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Video{

	@SerializedName("owner")
	private Owner owner;

	@SerializedName("embed_code")
	private String embedCode;

	@SerializedName("allow_hd")
	private int allowHd;

	@SerializedName("default_to_hd")
	private int defaultToHd;

	@SerializedName("rating")
	private Rating rating;

	@SerializedName("fps")
	private double fps;

	@SerializedName("privacy")
	private String privacy;

	@SerializedName("unlisted_hash")
	private Object unlistedHash;

	@SerializedName("title")
	private String title;

	@SerializedName("version")
	private Version version;

	@SerializedName("url")
	private String url;

	@SerializedName("embed_permission")
	private String embedPermission;

	@SerializedName("duration")
	private int duration;

	@SerializedName("bypass_token")
	private String bypassToken;

	@SerializedName("share_url")
	private String shareUrl;

	@SerializedName("live_event")
	private Object liveEvent;

	@SerializedName("width")
	private int width;

	@SerializedName("id")
	private int id;

	@SerializedName("spatial")
	private int spatial;

	@SerializedName("hd")
	private int hd;

	@SerializedName("lang")
	private Object lang;

	@SerializedName("height")
	private int height;

	@SerializedName("thumbs")
	private Thumbs thumbs;

	public void setOwner(Owner owner){
		this.owner = owner;
	}

	public Owner getOwner(){
		return owner;
	}

	public void setEmbedCode(String embedCode){
		this.embedCode = embedCode;
	}

	public String getEmbedCode(){
		return embedCode;
	}

	public void setAllowHd(int allowHd){
		this.allowHd = allowHd;
	}

	public int getAllowHd(){
		return allowHd;
	}

	public void setDefaultToHd(int defaultToHd){
		this.defaultToHd = defaultToHd;
	}

	public int getDefaultToHd(){
		return defaultToHd;
	}

	public void setRating(Rating rating){
		this.rating = rating;
	}

	public Rating getRating(){
		return rating;
	}

	public void setFps(double fps){
		this.fps = fps;
	}

	public double getFps(){
		return fps;
	}

	public void setPrivacy(String privacy){
		this.privacy = privacy;
	}

	public String getPrivacy(){
		return privacy;
	}

	public void setUnlistedHash(Object unlistedHash){
		this.unlistedHash = unlistedHash;
	}

	public Object getUnlistedHash(){
		return unlistedHash;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setVersion(Version version){
		this.version = version;
	}

	public Version getVersion(){
		return version;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setEmbedPermission(String embedPermission){
		this.embedPermission = embedPermission;
	}

	public String getEmbedPermission(){
		return embedPermission;
	}

	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getDuration(){
		return duration;
	}

	public void setBypassToken(String bypassToken){
		this.bypassToken = bypassToken;
	}

	public String getBypassToken(){
		return bypassToken;
	}

	public void setShareUrl(String shareUrl){
		this.shareUrl = shareUrl;
	}

	public String getShareUrl(){
		return shareUrl;
	}

	public void setLiveEvent(Object liveEvent){
		this.liveEvent = liveEvent;
	}

	public Object getLiveEvent(){
		return liveEvent;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSpatial(int spatial){
		this.spatial = spatial;
	}

	public int getSpatial(){
		return spatial;
	}

	public void setHd(int hd){
		this.hd = hd;
	}

	public int getHd(){
		return hd;
	}

	public void setLang(Object lang){
		this.lang = lang;
	}

	public Object getLang(){
		return lang;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	public void setThumbs(Thumbs thumbs){
		this.thumbs = thumbs;
	}

	public Thumbs getThumbs(){
		return thumbs;
	}
}