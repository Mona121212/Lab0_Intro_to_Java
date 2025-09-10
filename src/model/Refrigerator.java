package model;

public class Refrigerator extends Appliance {

	private int numberOfDoors;
	private int height;
	private int width;
	
	
	public Refrigerator(
			String itemNumber, 
			String brand, 
			int quantity, 
			int wattage, 
			String color, 
			double price, 
			int numberOfDoors, 
			int height, 
			int width
	) {
		super(itemNumber, brand, quantity, wattage, color, price);
		this.numberOfDoors = numberOfDoors;
		this.height = height;
		this.width = width;
	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}


	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}
	
	public String toFileString() {
		return getItemNumber() + ";" + getBrand() + ";" + getQuantity() + ";" + getWattage() + ";" + getColor() + ";" + getPrice() + ";" + this.numberOfDoors + ";" + this.height + ";" + this.width;
	} 
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
		           "Number of Doors: " + numberOfDoors + "\n" +
		           "Height: " + height + "\n" +
		           "Width: " + width;
	}
}
