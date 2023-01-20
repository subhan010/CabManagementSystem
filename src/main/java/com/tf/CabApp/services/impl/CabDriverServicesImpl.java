package com.tf.CabApp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tf.CabApp.entities.CabDriver;
import com.tf.CabApp.entities.Location;
import com.tf.CabApp.repositories.CabDriverRepo;
import com.tf.CabApp.services.CabDriverServices;

@Service
public class CabDriverServicesImpl implements CabDriverServices {
	
	
	@Autowired
	public CabDriverRepo cdr;
	
	@Autowired
	public CabDriver cd;
	
	
	@Override
	public CabDriver getCabDriver(long cell) {
		// TODO Auto-generated method stub
		
		
		return cdr.getcabDriver(cell);
	}

	@Override
	public String addCabDriver(long cell, CabDriver cd) {
		// TODO Auto-generated method stub
		
		
		return cdr.addcabDriver(cell, cd);
	}

	@Override
	public String updateLocation(long cell, Location lc) {
		
		try {
			cd=cdr.getcabDriver(cell);
			cd.setLc(lc);
			
			
			return cdr.updateCabDriver(cell, cd);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			return "No driver found";
		}
	}
	
	@Override
	public String updateStatus(long cell, boolean status) {
		try {
			
			cd=cdr.getcabDriver(cell);
			cd.setActive(status);
			
			
			return cdr.updateCabDriver(cell, cd);
		}
		catch (NullPointerException e)
		{
			return "Data not found";
		}
		
	}

}
