package model;

public class Appliance {
	private String itemNumber;    
    private String brand;         
    private int quantity;         
    private int wattage;          
    private String color;         
    private double price;         
    
   
    public Appliance(String itemNumber, String brand, int quantity, 
                    int wattage, String color, double price) {
        this.itemNumber = itemNumber;
        this.brand = brand;
        this.quantity = quantity;
        this.wattage = wattage;
        this.color = color;
        this.price = price;
    }
    
    
    public String getItemNumber() {
        return itemNumber;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public int getWattage() {
        return wattage;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Setter methods (only for attributes that need to be updated, e.g., quantity)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
   
    public boolean isAvailable() {
        return quantity > 0;
    }
    

    public void decreaseQuantity() {
        if (quantity > 0) {
            quantity--;
        }
    }
    
    
    @Override
    public String toString() {
        return "ItemNumber: " + itemNumber + "\n" +
               "Brand: " + brand + "\n" +
               "Quantity: " + quantity + "\n" +
               "Wattage: " + wattage + "\n" +
               "Color: " + color + "\n" +
               "Price: " + price;
    }
    
    public String formatForFile() {
        return itemNumber + ";" + brand + ";" + quantity + ";" +
               wattage + ";" + color + ";" + price;
    }

	
}
