package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Driver;
import com.example.demo.service.RideService;

@RestController
public class RideController {
	private RideService rideservice;
	
	@Autowired
	public RideController(RideService rideservice) {
		this.rideservice = rideservice;
	}

	public RideService getRideservice() {
		return rideservice;
	}

	public void setRideservice(RideService rideservice) {
		this.rideservice = rideservice;
	}
}
