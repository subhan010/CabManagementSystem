package com.tf.CabApp.services;

import com.tf.CabApp.entities.CabDriver;
import com.tf.CabApp.entities.Location;

public interface CabDriverServices {
	
	
	public CabDriver getCabDriver(long cell);
	public String addCabDriver(long cell ,CabDriver cd);
	public String updateLocation(long cell, Location lc);
	public String updateStatus(long cell, boolean status);
	
	

}
