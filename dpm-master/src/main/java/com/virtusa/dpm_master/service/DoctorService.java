package com.virtusa.dpm_master.service;

import java.util.List;

import com.virtusa.dpm_master.model.Doctor;

public interface DoctorService {
	public void addDoctor(Doctor doctor);
	public Doctor getDoctorById(int docId);
	public List<Doctor> getAllDoctors();
	public void updateDoctor(Doctor doctor);
	public void deleteDoctor(Doctor doctor);
	
}