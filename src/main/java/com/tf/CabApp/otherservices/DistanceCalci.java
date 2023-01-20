package com.tf.CabApp.otherservices;

import org.springframework.stereotype.Component;

import com.tf.CabApp.entities.Location;


@Component
public class DistanceCalci {
	
	
	
	public int distanceFinder(Location l1,Location l2)
	{
		int x=l2.getX()-l1.getX();
		int y=l2.getY()-l1.getY();
		int dis=(x*x)+(y*y);
		
		
		return (int) Math.sqrt(dis);
	}

}
