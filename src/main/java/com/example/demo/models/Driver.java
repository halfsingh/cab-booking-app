package com.example.demo.models;

import javax.persistence.Entity;

@Entity
public class Driver {
		
	private static int counter = 1;


    private static int id;
	private String name;
	private String gender;
	private int age;
	private String vehicle_model;
	private String vehicle_number;
	//private Pair<Integer,Integer> location;
	private  int location_x;
	private  int location_y;
	
	public Driver(String name, String gender, int age, String vehicle_model, String vehicle_number,int loc_x,int loc_y) {
		
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
		this.setVehicle_model(vehicle_model);
		this.setVehicle_number(vehicle_number);
		this.setLocation_x(loc_x);
		this.setLocation_y(loc_y);
		this.id = counter++;
	}
	public Driver() {
		
		this.setName(null);
		this.setGender(null);
		this.setAge(0);
		this.setVehicle_model(null);
		this.setVehicle_number(null);
		this.setLocation_x(0);
		this.setLocation_y(0);
		this.id = counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getVehicle_model() {
		return vehicle_model;
	}

	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	
	public int getLocation_x() {
		return location_x;
	}
	public void setLocation_x(int location_x) {
		this.location_x = location_x;
	}
	public int getLocation_y() {
		return location_y;
	}
	public void setLocation_y(int location_y) {
		this.location_y = location_y;
	}
	public static Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
}
