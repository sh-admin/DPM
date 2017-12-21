package com.virtusa.dpm_master.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Appoinment")
public class Appoinment {
	@Id
	@Column(name = "Appoinment_Id")
	private int id;
	@Column(name = "Appoinment_Date")
	private LocalDateTime appnDate;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Sched_Id")
	private Schedule schedule;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Patient_Id")
	private Patient patient;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getAppnDate() {
		return appnDate;
	}

	public void setAppnDate(LocalDateTime appnDate) {
		this.appnDate = appnDate;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
