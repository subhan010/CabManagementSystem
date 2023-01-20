package com.tf.CabApp.entities;

import org.springframework.stereotype.Component;

@Component
public class Booking {
	
	private long usercell;
	private long drivercell;
	private Location destination;
	
	
	

	public long getUsercell() {
		return usercell;
	}
	public void setUsercell(long usercell) {
		this.usercell = usercell;
	}
	public long getDrivercell() {
		return drivercell;
	}
	public void setDrivercell(long drivercell) {
		this.drivercell = drivercell;
	}
	public Location getDestination() {
		return destination;
	}
	public void setDestination(Location destination) {
		this.destination = destination;
	}
	
	
	
	
	
	
	

}
