package com.tf.CabApp.entities;

import org.springframework.stereotype.Component;

@Component
public class Users {
	
	private Location lc;
	private PersonalData pd;
	
	
	public Location getLc() {
		return lc;
	}
	public void setLc(Location lc) {
		this.lc = lc;
	}
	public PersonalData getPd() {
		return pd;
	}
	public void setPd(PersonalData pd) {
		this.pd = pd;
	}
	@Override
	public String toString() {
		return "Users [lc=" + lc + ", pd=" + pd + "]";
	}
	
	
	
	
	
	

}
