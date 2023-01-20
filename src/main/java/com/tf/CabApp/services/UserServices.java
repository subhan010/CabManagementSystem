package com.tf.CabApp.services;


import com.tf.CabApp.entities.Location;
import com.tf.CabApp.entities.Users;


public interface UserServices {

	
	public Users getUser(long cell);
	public String addUser(long cell,  Users us);
	public String updateLocaiton(long cell,Location lc);

	
	
	
}
