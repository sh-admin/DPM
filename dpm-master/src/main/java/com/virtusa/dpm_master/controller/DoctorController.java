package com.virtusa.dpm_master.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.dpm_master.model.Doctor;
import com.virtusa.dpm_master.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addDoctor(@RequestBody Doctor doctor){
		doctorService.addDoctor(doctor);
	}
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	public Doctor getDoctorById(@PathParam(value = "id") int docId){
		return doctorService.getDoctorById(docId);
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public List<Doctor> getAllDoctors(){
		return doctorService.getAllDoctors();
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateDoctor(@RequestBody Doctor doctor){
		doctorService.updateDoctor(doctor);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public void deleteDoctor(@RequestBody Doctor doctor){
		doctorService.deleteDoctor(doctor);;
	}
	
}
