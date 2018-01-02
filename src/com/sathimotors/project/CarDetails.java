package com.sathimotors.project;

public class CarDetails {

	private String carNumber;
	private String companyName;
	private String model;
	private int mfgYear;

	public CarDetails(String carNumber, String companyName, String model, int mfgYear) {
		super();
		this.carNumber = carNumber;
		this.companyName = companyName;
		this.model = model;
		this.mfgYear = mfgYear;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMfgYear() {
		return mfgYear;
	}

	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}

}
