package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Driver;
import com.example.demo.models.User;
import com.example.demo.service.RideService;


@Controller()
public class HomeController {
	
	@RequestMapping(value = "/home")
	public static String Home() {
		
		return "index";				
	}
	@RequestMapping("user/new")
	public String displayUserForm(User user) {
		UserController.getUserservice().add_user(user);
		return "new-user";
}
	@RequestMapping("driver/new")
	public String displayUserForm(Driver driver) {
		DriverController.getDriverservice().add_driver(driver);
		return "new-driver";		
}
	// PUBLIC MAKE A PAGE TO FIND RIDES
	
	@RequestMapping("find_ride")
	public String display_find_ride_form() {
		return "find-ride";
	}
	
	@RequestMapping(path ="available_rides", produces= {"application/json"})
	public String display_available_rides(Model model,@RequestParam String Name, @RequestParam Integer source_x, @RequestParam Integer source_y, @RequestParam Integer dest_x, @RequestParam Integer dest_y) {
		RideService rideService = new RideService();
		List<Driver> dr = rideService.find_ride(Name, source_x, source_y, dest_x, dest_y);
		model.addAttribute("dr",dr);
		return "found_rides";
	}
	
	@RequestMapping(path="ride_chosen")
	public String display_success_message(Model model ,@RequestParam String Name, @RequestParam Integer dest_x, @RequestParam Integer dest_y) {
		RideService rideService = new RideService();
		System.out.println(Name);
		String riri = rideService.choose_ride(Name,dest_x,dest_y);

		//System.out.println(riri);
		model.addAttribute("riri",riri);

		//System.out.println(riri);
		return "bookingconfirmed";
	}
}

