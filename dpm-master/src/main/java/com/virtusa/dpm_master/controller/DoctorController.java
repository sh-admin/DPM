package com.virtusa.dpm_master.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.dpm_master.model.Doctor;
import com.virtusa.dpm_master.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	DoctorService doctorService;
	
	@RequestMapping(value="/add", method=RequestMethod.PUT)
	public void addDoctor(@RequestBody Doctor doctor){
		doctorService.addDoctor(doctor);
	}
	
}
