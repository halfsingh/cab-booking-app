package com.example.demo.models;

//TODO: Make buses class

//Whenever a ride is not found
//we redirect him/her to a bus that is less than 5 units away

public class Bus {
	
	public Bus(int busNumber, int dest_x, int dest_y) {
		super();
		BusNumber = busNumber;
		this.dest_x = dest_x;
		this.dest_y = dest_y;
	}
	private int BusNumber;
	private int dest_x;
	private int dest_y;
	public int getBusNumber() {
		return BusNumber;
	}
	public void setBusNumber(int busNumber) {
		BusNumber = busNumber;
	}
	public int getDest_x() {
		return dest_x;
	}
	public void setDest_x(int dest_x) {
		this.dest_x = dest_x;
	}
	public int getDest_y() {
		return dest_y;
	}
	public void setDest_y(int dest_y) {
		this.dest_y = dest_y;
	}
	
}
