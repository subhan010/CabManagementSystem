package com.tf.CabApp.repositories;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.tf.CabApp.entities.CabDriver;

@Repository
public class CabDriverRepo {
	
	public HashMap<Long,CabDriver> cabDriverRepo= new HashMap<>();
	
   
	
	public String addcabDriver(long cell,CabDriver cd)
	{
		if(cabDriverRepo.containsKey(cell))
		{
			return "Driver already present";
		}
		
		
		cabDriverRepo.put(cell,cd);
		
		System.out.println(cd.getPd().getName()+" "+ "Registered Successfully");
		return "Driver registerd successfully";
	}
	
	public String updateCabDriver(long cell,CabDriver cd)
	{
		
		
		
		cabDriverRepo.put(cell,cd);
		
		System.out.println(cd.getPd().getName()+" "+ "Updated Successfully");
		return "Driver Updated successfully";
	}
	
	public CabDriver getcabDriver(long cell)
	{
		return this.cabDriverRepo.get(cell);
	}
	
	
	public HashMap<Long,CabDriver> allCabDriver()
	{
		return this.cabDriverRepo;
	}
	
	
	
	

}
