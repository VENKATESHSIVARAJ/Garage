package com.sathimotors.project;

public class InitialComplaint {
	private String initialComplaintId;
	private String carNumber;
	private String customerId;
	private int totalAmount;

	public InitialComplaint(String initialComplaintId, String carNumber, String customerId, int totalAmount) {
		super();
		this.initialComplaintId = initialComplaintId;
		this.carNumber = carNumber;
		this.customerId = customerId;
		this.totalAmount = totalAmount;
	}

	public String getInitialComplaintId() {
		return initialComplaintId;
	}

	public void setInitialComplaintId(String initialComplaintId) {
		this.initialComplaintId = initialComplaintId;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

}
