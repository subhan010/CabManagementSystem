package com.tf.CabApp.repositories;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;


import com.tf.CabApp.entities.RideBooking;

@Repository
public class RideBookingRepo {
	
	
	

	List<RideBooking> rideBookingrepo= new ArrayList<>();
	
	
	
	public void setBookingOrder(RideBooking rb)
	{
	   
	   this.rideBookingrepo.add(rb);
		
	}
	
	public List<RideBooking> rbooking(long cell)
	{
		List<RideBooking> rserv=new ArrayList<>();	
		
		for(int i=0;i<rideBookingrepo.size();i++)
		{
			if(rideBookingrepo.get(i).getUs().getPd().getCell()==cell)
			{
				rserv.add(rideBookingrepo.get(i));
			}
		}
		
		return rserv;
	}
	
	
	
}
