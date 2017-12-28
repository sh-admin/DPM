package com.virtusa.dpm_master.service;

import java.util.List;

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
	
	public List<Doctor> getAllDoctors(){
		return (List<Doctor>) doctorRepository.findAll();
	}
	
	public Doctor getDoctorById(int docId){
		return (Doctor) doctorRepository.findOne(docId);
	}

	public void updateDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
		
	}

	public void deleteDoctor(Doctor doctor) {
		doctorRepository.delete(doctor);
	}

}
