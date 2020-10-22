package com.example.vimeoplayer.model.vimeo;

import com.google.gson.annotations.SerializedName;

public class Cdns{

	@SerializedName("akfire_interconnect_quic")
	private AkfireInterconnectQuic akfireInterconnectQuic;

	public void setAkfireInterconnectQuic(AkfireInterconnectQuic akfireInterconnectQuic){
		this.akfireInterconnectQuic = akfireInterconnectQuic;
	}

	public AkfireInterconnectQuic getAkfireInterconnectQuic(){
		return akfireInterconnectQuic;
	}
}