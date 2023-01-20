package com.tf.CabApp.services.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tf.CabApp.entities.Location;
import com.tf.CabApp.entities.Booking;
import com.tf.CabApp.entities.CabDriver;
import com.tf.CabApp.entities.RideBooking;
import com.tf.CabApp.otherservices.DistanceCalci;
import com.tf.CabApp.repositories.CabDriverRepo;
import com.tf.CabApp.repositories.RideBookingRepo;
import com.tf.CabApp.repositories.UserRepo;
import com.tf.CabApp.services.RideServices;
import com.tf.CabApp.services.UserServices;


@Service
public class RideServicesImpl implements RideServices {

	@Autowired
	public RideBooking rb;
	
	@Autowired
	public CabDriverRepo cdr;
	
	@Autowired
	public UserRepo ur;
	
	@Autowired
	public RideBookingRepo rbr;
	
	@Autowired
	public DistanceCalci dc;
	
	@Autowired
	public UserServices us;
	
	
	
	@Override
	public List<String> getNearbyCabDriver(long cell) {
		List<String> driverlist= new ArrayList<>();
		
		try {
			
			
			HashMap<Long,CabDriver> hm=cdr.allCabDriver();
			Location l1=ur.getUser(cell).getLc();
			
			
			for(Map.Entry<Long, CabDriver> map:hm.entrySet())
			{
				System.out.println(dc.distanceFinder(l1, map.getValue().getLc()));
				if(dc.distanceFinder(l1, map.getValue().getLc())<=5 && map.getValue().getActive())
				{ 
					String temp=map.getValue().getPd().getName()+" "+dc.distanceFinder(l1, map.getValue().getLc())+"units away";
					driverlist.add(temp);
				}
			}
			
			if(driverlist.isEmpty())
			{
				System.out.println("No Drivers Available");
			}
			else
			{
				System.out.println("List of nearby cabDriver user"+" "+cell);
				System.out.println(driverlist);
			}
			
			return driverlist;
			
		}
		
		catch(NullPointerException e)
		{
			
			System.out.println("User not found");
			return driverlist;
		}
		
	}

	@Override
	public String chooseRide(Booking b) {
		
		try {
			Location l1=ur.getUser(b.getUsercell()).getLc();
			Location l2=cdr.getcabDriver(b.getDrivercell()).getLc();
			
			if(dc.distanceFinder(l1, l2)<=5 && cdr.getcabDriver(b.getDrivercell()).getActive())
			{
				System.out.println("Ride booked at the point "+l1);


				rb.setUs(ur.getUser(b.getUsercell()));
				rb.setCd(cdr.getcabDriver(b.getDrivercell()));
				rb.setDestination(b.getDestination());
				 
				rbr.setBookingOrder(rb);
				
				
				//updating user location with current destination point
				
				us.updateLocaiton(b.getUsercell(), b.getDestination());
				
				System.out.println("Reached at the point "+ b.getDestination());
				System.out.println("Ride Completed successfully with cost of "+dc.distanceFinder(l1, b.getDestination())+" "+"units" );
				
				return "Ride Booked Successfully";
			}
			System.out.println("Can't book ride right now as drivers unavailable");
			
			return "Driver is Unavailable";
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			return "No user found to book the ride"; 
		}
	}

	@Override
	public List<RideBooking> getbookinghistory(long cell) {
		
		System.out.println("Booking History of "+cell);
		
		return rbr.rbooking(cell);
	}
	
	

}
