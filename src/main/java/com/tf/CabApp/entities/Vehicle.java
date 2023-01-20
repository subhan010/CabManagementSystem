package com.tf.CabApp.entities;

public class Vehicle {
	
	private String vname;
	private String regnum;
	private String vclass;
	
	
	
	public Vehicle(String vname, String regnum, String vclass) {
		super();
		this.vname = vname;
		this.regnum = regnum;
		this.vclass = vclass;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getRegnum() {
		return regnum;
	}
	public void setRegnum(String regnum) {
		this.regnum = regnum;
	}
	public String getVclass() {
		return vclass;
	}
	public void setVclass(String vclass) {
		this.vclass = vclass;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vname=" + vname + ", regnum=" + regnum + ", vclass=" + vclass + "]";
	}
	
	

}
