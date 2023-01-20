package com.tf.CabApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tf.CabApp.driver.Driver;
import com.tf.CabApp.entities.Booking;
import com.tf.CabApp.entities.CabDriver;
import com.tf.CabApp.entities.Location;

import com.tf.CabApp.entities.RideBooking;
import com.tf.CabApp.entities.Users;

import com.tf.CabApp.services.CabDriverServices;
import com.tf.CabApp.services.RideServices;
import com.tf.CabApp.services.UserServices;



@RestController
public class CabBookingAppController {
	
	
	
	
	@Autowired 
	public UserServices usi;
	
	@Autowired 
	public CabDriverServices cds;
	
	@Autowired 
	public RideServices rs;
	
	@Autowired
	public Users uss;
	
	@Autowired 
	public CabDriver cd;
	
	
	@Autowired
	public Booking b;
	
	@Autowired
	public Driver dr;
	
	
   @GetMapping("/driver")	
   public void test()
   {
	  dr.runner();
		
   }

	
	
	@GetMapping("/user/{cellNum}")
	public Users getUsers(@PathVariable String cellNum)
	{
 
		return  usi.getUser(Long.parseLong(cellNum));
	}
	
	
	@PutMapping("/user/updatelocation/{cellNum}")
	public String updateLocation(@RequestBody Location lc, @PathVariable String cellNum)
	{
		
		return usi.updateLocaiton(Long.parseLong(cellNum), lc);
		
	
	}
	
	@PostMapping("/user")
	public String addUser(@RequestBody Users us)
	{
		
	
		return usi.addUser(us.getPd().getCell(), us);
	}
	
	@GetMapping("/user/history/{cellNum}")
	public List<RideBooking> getHistory(@PathVariable String cellNum)
	{
	
		return rs.getbookinghistory(Long.parseLong(cellNum));
	}
	
	
	@GetMapping("/cabdriver/{cellNum}")
	public CabDriver getcabDriver(@PathVariable String cellNum)
	{
	
		 
		return  cds.getCabDriver(Long.parseLong(cellNum)); 
	}
	
	
	@PostMapping("/cabdriver")
	public String addCabDriver(@RequestBody CabDriver cd)
	{
		
	
		return cds.addCabDriver(cd.getPd().getCell(), cd) ;
	}
	
	@PutMapping("/cabdriver/upadtestatus/{cellNum}")
	public String updatestatus(@RequestBody CabDriver cd, @PathVariable String cellNum)
	{
		return cds.updateStatus(Long.parseLong(cellNum), cd.getActive());
	
		
	}
	
	@PutMapping("/cabdriver/updatelocation/{cellNum}")
	public String updatecLocation(@RequestBody Location lc, @PathVariable String cellNum)
	{
		return usi.updateLocaiton(Long.parseLong(cellNum), lc);
		
	
	}
	 
	@GetMapping("/findride/{cellNum}")
	public List<String> findRide(@PathVariable String cellNum)
	{
		
		return rs.getNearbyCabDriver(Long.parseLong(cellNum)) ; 
	}
	
	@PostMapping("/bookride")
	public String chooseRide(@RequestBody Booking b )
	{
	     	
		return rs.chooseRide(b)  ; 
	}
	
	
	
	
	
	
	
	
}
