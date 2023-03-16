package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Driver;
import com.example.demo.models.User;
import com.example.demo.service.DriverService;

@RestController
public class DriverController {
	
	
	private static DriverService driverservice;
	
	@Autowired
	public DriverController(DriverService driverservice) {
		this.setDriverservice(driverservice);
	}
	
	@GetMapping("driver/get")
	public Driver getUser(@RequestParam Integer id ) {
		
		Optional<Driver> driver = getDriverservice().getDriver(id);
		if(driver.isPresent()) {
			return (Driver) driver.get();
		}
		return null;
		
	}
	@GetMapping("driver/get/all")
	public List<Driver> getAllDrivers() {
		
		return this.getDriverservice().getAllDrivers();
		
	}
	
	@PostMapping(path = "driver/create", consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public Driver createDriver(Driver driver) {
		Driver dest = this.getDriverservice().add_driver(driver);
		return dest;
	}	
	
	@PostMapping(path = "driver/create", consumes= {"application/json"})
	public Driver createDriverJSON(@RequestBody Driver driver) {
		Driver dest = this.getDriverservice().add_driver(driver);
		return dest;
	}

	public static DriverService getDriverservice() {
		return driverservice;
	}

	public void setDriverservice(DriverService driverservice) {
		this.driverservice = driverservice;
	}
}
