package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Bus;
import com.example.demo.models.Driver;

@Service
public class RideService {
		
	public List<Driver> Drivers = DriverService.getDrivers();

	public List<Bus> Buses = BusService.getBuses();
	
	
	public List<Driver> find_ride(String Name, Integer source_x,Integer source_y,Integer dest_x,Integer dest_y) {
		List<Driver> res = new ArrayList<>();
		for(Driver driver : Drivers) {
			if (this.dist(driver.getLocation_x(),driver.getLocation_y(),source_x,source_y)<5) {
				res.add(driver);
			}
		}
		
		return res;
	}
	
	public String choose_ride(String drivername,int dest_x, int dest_y) {
		String booked_driver_name= drivername;
		if(drivername==" ")return find_bus(dest_x, dest_y);
		
		
		
		for(Driver driver : Drivers) {
			if (drivername == driver.getName()) {
				booked_driver_name = drivername;
			}
			
		}
		
		
		return booked_driver_name;
		
	}
	public String find_bus(Integer dest_x,Integer dest_y) {
		int busno = 0;
		int busdist = Integer.MAX_VALUE;
		for(Bus bus : Buses) {
			busdist=Math.min(this.dist(dest_x,dest_y,bus.getDest_x(),bus.getDest_y()),busdist);
			if(busdist<5) {
				busno = bus.getBusNumber();
			}
		}
		if (busno==0) return "No buses nearby either";
		return Integer.toString(busno);
	}
	
	public int dist(int x1,int y1,int x2,int y2) {
		return (int) Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	}
}
