package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Urls{

	@SerializedName("css")
	private String css;

	@SerializedName("barebone_js")
	private String bareboneJs;

	@SerializedName("js")
	private String js;

	@SerializedName("chromeless_css")
	private String chromelessCss;

	@SerializedName("fresnel_manifest_url")
	private String fresnelManifestUrl;

	@SerializedName("player_telemetry_url")
	private String playerTelemetryUrl;

	@SerializedName("chromeless_js")
	private String chromelessJs;

	@SerializedName("proxy")
	private String proxy;

	@SerializedName("fresnel")
	private String fresnel;

	@SerializedName("vuid_js")
	private String vuidJs;

	@SerializedName("test_imp")
	private String testImp;

	@SerializedName("mux_url")
	private String muxUrl;

	@SerializedName("fresnel_chunk_url")
	private String fresnelChunkUrl;

	@SerializedName("js_base")
	private String jsBase;

	@SerializedName("three_js")
	private String threeJs;

	@SerializedName("fresnel_mimir_inputs_url")
	private String fresnelMimirInputsUrl;

	public void setCss(String css){
		this.css = css;
	}

	public String getCss(){
		return css;
	}

	public void setBareboneJs(String bareboneJs){
		this.bareboneJs = bareboneJs;
	}

	public String getBareboneJs(){
		return bareboneJs;
	}

	public void setJs(String js){
		this.js = js;
	}

	public String getJs(){
		return js;
	}

	public void setChromelessCss(String chromelessCss){
		this.chromelessCss = chromelessCss;
	}

	public String getChromelessCss(){
		return chromelessCss;
	}

	public void setFresnelManifestUrl(String fresnelManifestUrl){
		this.fresnelManifestUrl = fresnelManifestUrl;
	}

	public String getFresnelManifestUrl(){
		return fresnelManifestUrl;
	}

	public void setPlayerTelemetryUrl(String playerTelemetryUrl){
		this.playerTelemetryUrl = playerTelemetryUrl;
	}

	public String getPlayerTelemetryUrl(){
		return playerTelemetryUrl;
	}

	public void setChromelessJs(String chromelessJs){
		this.chromelessJs = chromelessJs;
	}

	public String getChromelessJs(){
		return chromelessJs;
	}

	public void setProxy(String proxy){
		this.proxy = proxy;
	}

	public String getProxy(){
		return proxy;
	}

	public void setFresnel(String fresnel){
		this.fresnel = fresnel;
	}

	public String getFresnel(){
		return fresnel;
	}

	public void setVuidJs(String vuidJs){
		this.vuidJs = vuidJs;
	}

	public String getVuidJs(){
		return vuidJs;
	}

	public void setTestImp(String testImp){
		this.testImp = testImp;
	}

	public String getTestImp(){
		return testImp;
	}

	public void setMuxUrl(String muxUrl){
		this.muxUrl = muxUrl;
	}

	public String getMuxUrl(){
		return muxUrl;
	}

	public void setFresnelChunkUrl(String fresnelChunkUrl){
		this.fresnelChunkUrl = fresnelChunkUrl;
	}

	public String getFresnelChunkUrl(){
		return fresnelChunkUrl;
	}

	public void setJsBase(String jsBase){
		this.jsBase = jsBase;
	}

	public String getJsBase(){
		return jsBase;
	}

	public void setThreeJs(String threeJs){
		this.threeJs = threeJs;
	}

	public String getThreeJs(){
		return threeJs;
	}

	public void setFresnelMimirInputsUrl(String fresnelMimirInputsUrl){
		this.fresnelMimirInputsUrl = fresnelMimirInputsUrl;
	}

	public String getFresnelMimirInputsUrl(){
		return fresnelMimirInputsUrl;
	}
}