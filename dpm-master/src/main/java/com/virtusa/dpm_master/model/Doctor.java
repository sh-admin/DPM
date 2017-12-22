package com.virtusa.dpm_master.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Doctor")
public class Doctor {
	@Id
	@Column(name="Doc_Id")
	private int docId;
	@Column(name="Doc_Name")
	private String docName;
	@Column(name="Doc_Specialisation")
	private String docSpecArea;
	@Column(name="Mobile_No")
	private String mobileNumber;
	@Column(name="Address")
	private String address;
	@OneToMany(mappedBy="doctor")
	private List<Schedule> schedule;

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocSpecArea() {
		return docSpecArea;
	}

	public void setDocSpecArea(String docSpecArea) {
		this.docSpecArea = docSpecArea;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}

}
