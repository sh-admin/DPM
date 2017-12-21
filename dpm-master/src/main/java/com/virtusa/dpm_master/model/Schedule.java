package com.virtusa.dpm_master.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Schedule")
public class Schedule {
	@Id
	@Column(name = "Schedule_Id")
	private int id;
	@Column(name = "Schedule_Date")
	private LocalDate schedDate;
	@Column(name = "From_Time")
	private LocalDateTime fromTime;
	@Column(name = "To_Time")
	private LocalDateTime toTime;
	@Column(name = "Location")
	private String location;
	@OneToMany(mappedBy = "schedule")
	private Appoinment appoinment;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Doc_Id")
	private Doctor doctor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getSchedDate() {
		return schedDate;
	}

	public void setSchedDate(LocalDate schedDate) {
		this.schedDate = schedDate;
	}

	public LocalDateTime getFromTime() {
		return fromTime;
	}

	public void setFromTime(LocalDateTime fromTime) {
		this.fromTime = fromTime;
	}

	public LocalDateTime getToTime() {
		return toTime;
	}

	public void setToTime(LocalDateTime toTime) {
		this.toTime = toTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Appoinment getAppoinment() {
		return appoinment;
	}

	public void setAppoinment(Appoinment appoinment) {
		this.appoinment = appoinment;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
