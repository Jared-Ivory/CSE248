package models;

import java.sql.Timestamp;
import java.util.Date;

public class Vehicle {
	private Timestamp TIMEIN;
	private String licenseplate;
	private CarType cartype;
	
	public Vehicle(String licenseplate, CarType cartype) {
		Date today = new Date();
		this.licenseplate = licenseplate;
		this.cartype = cartype;
		this.TIMEIN = new Timestamp(today.getTime());
	}
	
	
	public String getTimeIn() {
		return TIMEIN.toString();
	}


	public Timestamp getTIMEIN() {
		return TIMEIN;
	}


	public String getLicenseplate() {
		return licenseplate;
	}


	public CarType getCartype() {
		return cartype;
	}
	
	
}
