package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Bus;
import com.example.demo.models.Driver;


@Service
public class BusService {
	private static List<Bus> Buses;
	
	public BusService() {
		Buses = new ArrayList<>();
		Bus bus1 = new Bus(1234,10,76);
		Bus bus2 = new Bus(972,50,1);
		Bus bus3 = new Bus(1244,90,34);
		Bus bus4 = new Bus(5466,23,54);
		
		Buses.addAll(Arrays.asList(bus1,bus2,bus3,bus4));
		
	}
	
	public List<Bus> getAllBuses() {
		return Buses;
	}
	
	public Optional<Bus> getBus(Integer id) {
		Optional opt = Optional.empty();
		for(Bus bus: Buses) {
			if(id == bus.getBusNumber()) {
				opt = Optional.of(bus);
				return opt;
				
			}
		}
		return opt;
	}

	public Bus add_bus(Bus bus) {
		
		Buses.add(bus);
		return bus;
		
	}

	public static List<Bus> getBuses() {
		return Buses;
	}

	public void setBuses(List<Bus> buses) {
		Buses = buses;
	}
}
