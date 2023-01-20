package com.tf.CabApp.entities;

import org.springframework.stereotype.Component;

@Component
public class RideBooking {
	
	
	private Users us;
	private CabDriver cd;
	private Location destination;
	
	
	
	public Users getUs() {
		return us;
	}
	public void setUs(Users us) {
		this.us = us;
	}
	public CabDriver getCd() {
		return cd;
	}
	public void setCd(CabDriver cd) {
		this.cd = cd;
	}
	
	
	public Location getDestination() {
		return destination;
	}
	public void setDestination(Location destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "RideBooking [rideid="  + ", us=" + us + ", cd=" + cd + ", destination=" + destination + "]";
	}
	
	
	
	
	

}
