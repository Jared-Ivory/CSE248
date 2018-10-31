package test;

import models.Vehicle;
import models.CarType;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Vehicle("HYHAWF", CarType.SEDAN);
		System.out.println(car.getTimeIn());
	}

}
