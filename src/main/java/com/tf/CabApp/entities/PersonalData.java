package com.tf.CabApp.entities;

public class PersonalData {
	
	private String name;
	private String sex;
	private int age;
	private long cell;
	
	
	public PersonalData(String name, String sex, int age, long cell) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.cell = cell;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public long getCell() {
		return cell;
	}
	public void setCell(long cell) {
		this.cell = cell;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonalData [name=" + name + ", sex=" + sex + ", cell=" + cell + "]";
	}
	
	
	
	
	

}
