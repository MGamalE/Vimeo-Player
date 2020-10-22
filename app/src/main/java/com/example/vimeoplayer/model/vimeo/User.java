package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("owner")
	private int owner;

	@SerializedName("watch_later")
	private int watchLater;

	@SerializedName("account_type")
	private String accountType;

	@SerializedName("mod")
	private boolean mod;

	@SerializedName("team_origin_user_id")
	private int teamOriginUserId;

	@SerializedName("logged_in")
	private int loggedIn;

	@SerializedName("vimeo_api_interaction_tokens")
	private Object vimeoApiInteractionTokens;

	@SerializedName("team_id")
	private int teamId;

	@SerializedName("id")
	private int id;

	@SerializedName("liked")
	private int liked;

	@SerializedName("vimeo_api_client_token")
	private String vimeoApiClientToken;

	public void setOwner(int owner){
		this.owner = owner;
	}

	public int getOwner(){
		return owner;
	}

	public void setWatchLater(int watchLater){
		this.watchLater = watchLater;
	}

	public int getWatchLater(){
		return watchLater;
	}

	public void setAccountType(String accountType){
		this.accountType = accountType;
	}

	public String getAccountType(){
		return accountType;
	}

	public void setMod(boolean mod){
		this.mod = mod;
	}

	public boolean isMod(){
		return mod;
	}

	public void setTeamOriginUserId(int teamOriginUserId){
		this.teamOriginUserId = teamOriginUserId;
	}

	public int getTeamOriginUserId(){
		return teamOriginUserId;
	}

	public void setLoggedIn(int loggedIn){
		this.loggedIn = loggedIn;
	}

	public int getLoggedIn(){
		return loggedIn;
	}

	public void setVimeoApiInteractionTokens(Object vimeoApiInteractionTokens){
		this.vimeoApiInteractionTokens = vimeoApiInteractionTokens;
	}

	public Object getVimeoApiInteractionTokens(){
		return vimeoApiInteractionTokens;
	}

	public void setTeamId(int teamId){
		this.teamId = teamId;
	}

	public int getTeamId(){
		return teamId;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLiked(int liked){
		this.liked = liked;
	}

	public int getLiked(){
		return liked;
	}

	public void setVimeoApiClientToken(String vimeoApiClientToken){
		this.vimeoApiClientToken = vimeoApiClientToken;
	}

	public String getVimeoApiClientToken(){
		return vimeoApiClientToken;
	}
}