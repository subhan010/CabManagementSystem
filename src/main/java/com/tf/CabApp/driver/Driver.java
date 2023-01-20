package com.tf.CabApp.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tf.CabApp.entities.Booking;
import com.tf.CabApp.entities.CabDriver;
import com.tf.CabApp.entities.Location;
import com.tf.CabApp.entities.PersonalData;
import com.tf.CabApp.entities.Users;
import com.tf.CabApp.entities.Vehicle;
import com.tf.CabApp.services.CabDriverServices;
import com.tf.CabApp.services.RideServices;
import com.tf.CabApp.services.UserServices;

@Component
public class Driver {
	
	@Autowired 
	public UserServices usi;
	
	@Autowired 
	public CabDriverServices cds;
	
	@Autowired 
	public RideServices rs;
	
	
	public Users uss;
	
	
	public CabDriver cd;
	
	

	public Booking b;
	
	public void runner()
	{
		       uss=new Users();
			   uss.setPd(new PersonalData("Modric","M",25,999888666));
			   uss.setLc(new Location(1,2));
			   usi.addUser(uss.getPd().getCell(), uss);
			   uss=new Users();
			   uss.setPd(new PersonalData("Vardy","M",33,888777666));
			   uss.setLc(new Location(3,4));
			   usi.addUser(uss.getPd().getCell(), uss);
			   uss=new Users();
			   uss.setPd(new PersonalData("Erling","M",23,555444555));
			   uss.setLc(new Location(5,6));
			   usi.addUser(uss.getPd().getCell(), uss);
				
				cd=new  CabDriver();
				cd.setPd(new PersonalData("Driver1","M",23,222333000));
				cd.setVc(new Vehicle("Maruti Swift","KA02TT0099","MINI"));
				cd.setLc(new Location(2,3));
				cd.setActive(false);
				cds.addCabDriver(cd.getPd().getCell(), cd);
				
				cd=new  CabDriver();
				cd.setPd(new PersonalData("Driver2","M",26,88889999));
				cd.setVc(new Vehicle("Honda City","KA02TT0088","Sedan"));
				cd.setLc(new Location(8,9));
				cd.setActive(true);
				cds.addCabDriver(cd.getPd().getCell(), cd);
				
				cd=new  CabDriver();
				cd.setPd(new PersonalData("Driver3","M",28,234545454));
				cd.setVc(new Vehicle("Hyundai Creta","KA02TT0077","HatchBack"));
				cd.setLc(new Location(9,3));
				cd.setActive(true);
				cds.addCabDriver(cd.getPd().getCell(), cd);
				
				
				
				rs.getNearbyCabDriver(999888666);
				
				rs.getNearbyCabDriver(888777666);
				
				rs.getNearbyCabDriver(555444555);
				
				b=new Booking();
				b.setDestination(new Location(5,6));
				b.setUsercell(999888666);
				b.setDrivercell(88889999);
				
				rs.chooseRide(b);
				
				b=new Booking();
				b.setDestination(new Location(10,13));
				b.setUsercell(555444555);
				b.setDrivercell(234545454);
				
				rs.chooseRide(b);
				cds.updateStatus(88889999, false);
				
				cds.updateLocation(88889999, new Location(34,23));
				
				System.out.println(rs.getbookinghistory(555444555));
				
		
	}
	


}
