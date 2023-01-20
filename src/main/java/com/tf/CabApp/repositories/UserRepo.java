package com.tf.CabApp.repositories;

import java.util.HashMap;


import org.springframework.stereotype.Repository;


import com.tf.CabApp.entities.Users;

@Repository
public class UserRepo {
	HashMap<Long,Users> usersRepo= new HashMap<>();
	
	
	
	
	
	
	
	public String addUser(long cell,Users us)
	{
		if(this.usersRepo.containsKey(cell))
		{
			return "User Already Registered";
		}
			
		
		
		this.usersRepo.put(cell, us);
		
		System.out.println(us.getPd().getName()+" "+"Registered Successfully");
		return "User Registered Successfully"; 
	}
	
	public String updateUser(long cell,Users us)
	{

			
		
		this.usersRepo.put(cell, us);
		System.out.println(us.getPd().getName()+" "+"updated Successfully");
		
		return "User updated Successfully"; 
	}
	
	
	
	public Users getUser(long cell)
	{

		return usersRepo.get(cell);
	}
	
	
	
	

}
