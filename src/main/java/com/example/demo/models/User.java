package com.example.demo.models;

import java.util.concurrent.atomic.AtomicInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class User {
	
	public static int counter = 1;
	
    private int id;
	private String Name;
	private String Gender;
	private int age;
	
	public User (String name, String gender, int age) {
		this.Name = name;
		this.Gender = gender;
		this.age = age;
		this.id = counter++;
	}
	
	
	public User() {
		// TODO Auto-generated constructor 
		this.Name = null;
		this.Gender = null;
		this.age = 0;
		this.id = counter++;
	}


	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		this.Gender =  gender;
	}
	public int getId() {
		return id;
	}

}
