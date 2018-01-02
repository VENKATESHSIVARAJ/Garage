package com.sathimotors.project;

import java.util.Date;

public class EveryComplaints {
	private String initialComplaintId;
	private String complaintNumber;
	private Boolean verification;
	private int amount;
	private Date date_in;
	private Date date_out;

	public EveryComplaints(String initialComplaintId, String complaintNumber, Boolean verification, int amount,
			Date date_in, Date date_out) {
		super();
		this.initialComplaintId = initialComplaintId;
		this.complaintNumber = complaintNumber;
		this.verification = verification;
		this.amount = amount;
		this.date_in = date_in;
		this.date_out = date_out;
	}

	public String getInitialComplaintId() {
		return initialComplaintId;
	}

	public void setInitialComplaintId(String initialComplaintId) {
		this.initialComplaintId = initialComplaintId;
	}

	public String getComplaintNumber() {
		return complaintNumber;
	}

	public void setComplaintNumber(String complaintNumber) {
		this.complaintNumber = complaintNumber;
	}

	public Boolean getVerification() {
		return verification;
	}

	public void setVerification(Boolean verification) {
		this.verification = verification;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDate_in() {
		return date_in;
	}

	public void setDate_in(Date date_in) {
		this.date_in = date_in;
	}

	public Date getDate_out() {
		return date_out;
	}

	public void setDate_out(Date date_out) {
		this.date_out = date_out;
	}

}
