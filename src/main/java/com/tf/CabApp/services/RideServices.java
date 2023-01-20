package com.tf.CabApp.services;

import java.util.List;

import com.tf.CabApp.entities.Booking;
import com.tf.CabApp.entities.RideBooking;


public interface RideServices  {


	public List<String> getNearbyCabDriver(long cell);
	public String chooseRide(Booking b);
	
	public List<RideBooking> getbookinghistory(long cell);
	
	
}
