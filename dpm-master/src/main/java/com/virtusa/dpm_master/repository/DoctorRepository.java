package com.virtusa.dpm_master.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.dpm_master.model.Doctor;
@Repository
public interface DoctorRepository extends CrudRepository<Doctor,Integer>{
}
