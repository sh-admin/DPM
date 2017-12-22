package com.virtusa.dpm_master.repository;

import org.springframework.data.repository.CrudRepository;
import com.virtusa.dpm_master.model.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor,Integer>{
}
