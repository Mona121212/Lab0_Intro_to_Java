package model;

public class Microwave extends Appliance{
	
	
	private double capacity;
	// char only use single character
	private char roomType;
	public Microwave(String itemNumber, String brand, int quantity, int wattage, String color, double price,
			double capacity, String roomType2) {
			super(itemNumber, brand, quantity, wattage, color, price);
			this.capacity = capacity;
			this.roomType = roomType2.charAt(0);
			
		}
	
	public double getCapacity() {
		return capacity;
	}
	
	public char getRoomType() {
		return roomType;
	}
	
	public String getRoomTypeDescription() {
		return (roomType == 'K')? "Kitchen" : "Work Site";
	}
	
	public String toString() {
		return super.toString() + "\n" +
				"Capacity: " + capacity + "\n" +
				"Room Type: " + getRoomTypeDescription();
	}
}
