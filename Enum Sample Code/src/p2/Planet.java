package p2;

public enum Planet {
	MERCURY(3.2e23, 2.4e6), 
	VENUS(4.8e24, 6.9e6), 
	EARTH(5.9e24, 6.3e6), 
	MARS(6.423, 3.4e6), 
	JUPITOR(1.9e27,7.1e7), 
	SATURN(5.7e6, 6.0e6), 
	NEPTUNE(1.0e26,6.0e7), 
	URANUS(8.7e25, 2.5e7);
	
	private final double mass;
	private final double radius;
	
	private static final double G =6.673e-11;
	
	private Planet(double mass, double radius){
		this.mass = mass;
		this.radius = radius;
	}
	
	public double getSurfaceGravity() {
		return G * mass / (radius * radius);
	}
	
	public double getSurfaceWeight(double massArg0) {
		return massArg0 * getSurfaceGravity();
	}

	public double getMass() {
		return mass;
	}


	public double getRadius() {
		return radius;
	}
	
	
}
