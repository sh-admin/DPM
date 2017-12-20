package com.virtusa.dpm_master.model;

public class Doctor {

	private int docId;
	private String docName;
	private String docSpecArea;
	private String mobileNumber;
	private String address;
	private Schedule schedule;

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

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

}
