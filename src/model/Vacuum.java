package model;

public class Vacuum extends Appliance{
	
	
	private String grade;
	private int batteryVoltage;
	public Vacuum(String itemNumber, String brand, int quantity, int wattage, String color, double price,
			String grade, int batteryVoltage) {
			super(itemNumber, brand, quantity, wattage, color, price);
			
			this.grade = grade;
			this.batteryVoltage = batteryVoltage;
			
		}
	
	public String getGrade() {
		return grade;
	}
	
	public int getBatteryVoltage() {
		return batteryVoltage;
	}
	
	private String getBatteryVoltageType() {
		return (batteryVoltage == 18) ? "Low" : "High";
	}
	
	public String toString() {
		return super.toString() + "\n" +
				"Grade: " + grade + "\n" +
				"Battery voltage: " + getBatteryVoltageType();
	}

	
}


