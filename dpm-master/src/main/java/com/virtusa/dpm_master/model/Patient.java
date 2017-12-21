package com.virtusa.dpm_master.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="tbl_Patient")
public class Patient {

	@Id
	@Column(name="patient_id")
	private int id;
	@Column(name="patient_name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="address")
	private String address;
	@Column(name="mobile_no")
	private String mobileNumber;
	@Column(name="nic_no")
	private String nicNo;
	@Column(name="description")
	private String Description;
	@OneToMany(mappedBy="patient")
	private Appoinment appoinment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getNicNo() {
		return nicNo;
	}

	public void setNicNo(String nicNo) {
		this.nicNo = nicNo;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Appoinment getAppoinment() {
		return appoinment;
	}

	public void setAppoinment(Appoinment appoinment) {
		this.appoinment = appoinment;
	}

}
