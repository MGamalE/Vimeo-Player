package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Embed{

	@SerializedName("settings")
	private Settings settings;

	@SerializedName("editor")
	private boolean editor;

	@SerializedName("color")
	private String color;

	@SerializedName("autopause")
	private int autopause;

	@SerializedName("dnt")
	private int dnt;

	@SerializedName("transparent")
	private int transparent;

	@SerializedName("autoplay")
	private int autoplay;

	@SerializedName("quality")
	private Object quality;

	@SerializedName("texttrack")
	private String texttrack;

	@SerializedName("player_id")
	private String playerId;

	@SerializedName("loop")
	private int loop;

	@SerializedName("playsinline")
	private int playsinline;

	@SerializedName("context")
	private String context;

	@SerializedName("outro")
	private String outro;

	@SerializedName("log_plays")
	private int logPlays;

	@SerializedName("api")
	private Object api;

	@SerializedName("time")
	private int time;

	@SerializedName("app_id")
	private String appId;

	@SerializedName("muted")
	private int muted;

	@SerializedName("on_site")
	private int onSite;

	public void setSettings(Settings settings){
		this.settings = settings;
	}

	public Settings getSettings(){
		return settings;
	}

	public void setEditor(boolean editor){
		this.editor = editor;
	}

	public boolean isEditor(){
		return editor;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setAutopause(int autopause){
		this.autopause = autopause;
	}

	public int getAutopause(){
		return autopause;
	}

	public void setDnt(int dnt){
		this.dnt = dnt;
	}

	public int getDnt(){
		return dnt;
	}

	public void setTransparent(int transparent){
		this.transparent = transparent;
	}

	public int getTransparent(){
		return transparent;
	}

	public void setAutoplay(int autoplay){
		this.autoplay = autoplay;
	}

	public int getAutoplay(){
		return autoplay;
	}

	public void setQuality(Object quality){
		this.quality = quality;
	}

	public Object getQuality(){
		return quality;
	}

	public void setTexttrack(String texttrack){
		this.texttrack = texttrack;
	}

	public String getTexttrack(){
		return texttrack;
	}

	public void setPlayerId(String playerId){
		this.playerId = playerId;
	}

	public String getPlayerId(){
		return playerId;
	}

	public void setLoop(int loop){
		this.loop = loop;
	}

	public int getLoop(){
		return loop;
	}

	public void setPlaysinline(int playsinline){
		this.playsinline = playsinline;
	}

	public int getPlaysinline(){
		return playsinline;
	}

	public void setContext(String context){
		this.context = context;
	}

	public String getContext(){
		return context;
	}

	public void setOutro(String outro){
		this.outro = outro;
	}

	public String getOutro(){
		return outro;
	}

	public void setLogPlays(int logPlays){
		this.logPlays = logPlays;
	}

	public int getLogPlays(){
		return logPlays;
	}

	public void setApi(Object api){
		this.api = api;
	}

	public Object getApi(){
		return api;
	}

	public void setTime(int time){
		this.time = time;
	}

	public int getTime(){
		return time;
	}

	public void setAppId(String appId){
		this.appId = appId;
	}

	public String getAppId(){
		return appId;
	}

	public void setMuted(int muted){
		this.muted = muted;
	}

	public int getMuted(){
		return muted;
	}

	public void setOnSite(int onSite){
		this.onSite = onSite;
	}

	public int getOnSite(){
		return onSite;
	}
}