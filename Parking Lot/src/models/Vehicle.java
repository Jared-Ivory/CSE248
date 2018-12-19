package models;

import java.sql.Timestamp;
import java.util.Date;

public class Vehicle {
	private Timestamp TimeIn;
	private String licenseplate;
	private CarType cartype;
	
	public Vehicle(String licenseplate, CarType cartype) {
		this.licenseplate = licenseplate;
		this.cartype = cartype;
		setTimein();
	}
	
	public Vehicle(String licenseplate) {
		this.cartype = CarType.UNASSIGNED;
		this.licenseplate = licenseplate;
	}
	
	
	public String getTimeIn() {
		return TimeIn.toString();
	}
	
	public void setTimein () {
		this.TimeIn = new Timestamp(new Date().getTime());
	}


	public Timestamp getTIMEIN() {
		return TimeIn;
	}


	public String getLicenseplate() {
		return licenseplate;
	}


	public CarType getCartype() {
		return cartype;
	}
	
	
}
