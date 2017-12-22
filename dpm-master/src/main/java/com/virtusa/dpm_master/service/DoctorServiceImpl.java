package com.virtusa.dpm_master.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.dpm_master.model.Doctor;
import com.virtusa.dpm_master.repository.DoctorRepository;
@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	DoctorRepository doctorRepository;

	public void addDoctor(Doctor doctor){
		doctorRepository.save(doctor);
	}

}
