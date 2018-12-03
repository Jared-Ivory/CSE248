package models;

public class Wine implements IItem {
	
	private String producer;
	private int abv;
	private double price;
	public Wine(String producer, int abv, double price) {
		super();
		this.producer = producer;
		this.abv = abv;
		this.price = price;
	}
	
	@Override
	public void print() {
		System.out.println("Wine: " + producer + ", " + abv + ", " + price + "\n");
	}

}
