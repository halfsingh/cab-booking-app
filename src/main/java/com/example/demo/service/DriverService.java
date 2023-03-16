package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Driver;
import com.example.demo.models.location;


@Service
public class DriverService {
	private static List<Driver> Drivers;
	
	public DriverService() {
		Drivers = new ArrayList<>();
		Driver user1 = new Driver("Himanshu","M",25,"Swift Dezire","DL_40_4304",10,76);
		Driver user2 = new Driver("Prianshu","M",50,"Swift Dezire","DL_40_4304",50,1);
		Driver user3 = new Driver("Eddie","M",70,"Swift Dezire","DL_40_4304",90,34);
		Driver user4 = new Driver("Mark","M",45,"Swift Dezire","DL_40_4304",23,54);
		
		Drivers.addAll(Arrays.asList(user1,user2,user3,user4));
		
	}
	
	public List<Driver> getAllDrivers() {
		return Drivers;
	}
	
	public Optional<Driver> getDriver(Integer id) {
		Optional opt = Optional.empty();
		for(Driver driver: Drivers) {
			if(id == Driver.getId()) {
				opt = Optional.of(driver);
				return opt;
				
			}
		}
		return opt;
	}

	public Driver add_driver(Driver driver) {
		
		Drivers.add(driver);
		return driver;
		
	}

	public static List<Driver> getDrivers() {
		return Drivers;
	}

	public void setDrivers(List<Driver> drivers) {
		Drivers = drivers;
	}
}
