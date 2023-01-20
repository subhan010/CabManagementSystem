package com.tf.CabApp.entities;

import org.springframework.stereotype.Component;

@Component
public class CabDriver {
	private PersonalData pd;
    private Vehicle vc;
    private Location lc;
    private boolean active;
	public PersonalData getPd() {
		return pd;
	}
	public void setPd(PersonalData pd) {
		this.pd = pd;
	}
	public Vehicle getVc() {
		return vc;
	}
	public void setVc(Vehicle vc) {
		this.vc = vc;
	}
	public Location getLc() {
		return lc;
	}
	public void setLc(Location lc) {
		this.lc = lc;
	}
	
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "CabDriver [pd=" + pd + ", vc=" + vc + ", lc=" + lc + ", active=" + active + "]";
	}
    
	
    
    
    
	

}
