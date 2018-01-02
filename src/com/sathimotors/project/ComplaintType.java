package com.sathimotors.project;

public class ComplaintType {
	private String complaientNumber;
	private String complaientName;

	public ComplaintType(String complaientNumber, String complaientName) {
		super();
		this.complaientNumber = complaientNumber;
		this.complaientName = complaientName;
	}

	public String getComplaientNumber() {
		return complaientNumber;
	}

	public void setComplaientNumber(String complaientNumber) {
		this.complaientNumber = complaientNumber;
	}

	public String getComplaientName() {
		return complaientName;
	}

	public void setComplaientName(String complaientName) {
		this.complaientName = complaientName;
	}

}
