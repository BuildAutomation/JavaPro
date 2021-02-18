package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping(value = "/vehicles", method = RequestMethod.GET)
	public List<String> getWish() {
		return getVehicles();
	}

	private List<String> getVehicles() {
		List<String> vehicles = new ArrayList<String>();
		vehicles.add("Maruthi Suzuki Swift");
		vehicles.add("Maruthi Suzuki Celerio");
		vehicles.add("Maruthi Suzuki Alto-800");
		vehicles.add("Maruthi Suzuki Swift Dezire");
		vehicles.add("Maruthi Suzuki Beleno");
		return vehicles;
	}

}
