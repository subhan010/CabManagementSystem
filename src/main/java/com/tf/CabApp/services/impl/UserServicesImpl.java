package com.tf.CabApp.services.impl;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.tf.CabApp.entities.Location;
import com.tf.CabApp.entities.Users;
import com.tf.CabApp.repositories.UserRepo;
import com.tf.CabApp.services.UserServices;


@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	UserRepo ur;
	
	@Autowired
	public Users us;
	
	
	@Override
	public Users getUser(long cell) {
		
		
		return ur.getUser(cell);
		
	}

	@Override
	public String addUser(long cell ,Users us) throws NullPointerException {
		

		return ur.addUser(cell, us);
		
		
	}
	
	@Override
	public String updateLocaiton(long cell,Location lc) 
	{
   try {
		us=getUser(cell);
		us.setLc(lc);
		System.out.println(us.getLc());
		return ur.updateUser(cell, us);
	   
   }
   catch(NullPointerException e)
   {
	   return "Data not found";
   }
	
		
	}

	
	

}
