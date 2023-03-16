package com.example.demo.models;

import java.util.ArrayList;

public class location {
	private int x;
	private int y;
	
	public location(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	
	public int dist(location loc1, location loc2 ) {
		return (int)Math.sqrt(Math.pow(loc1.x-loc2.x,2) +Math.pow(loc1.y-loc2.y,2) );

	}
	
	public int[] getlocation() {
		int[] ar ={this.x,this.y};
		return ar;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	

	
	
}
