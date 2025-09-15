package model;

public class Dishwasher extends Appliance {
	private String feature;   // special feature
	private String soundRating;  // the level of sound

	public Dishwasher(String itemNumber, String brand, int quantity, int wattage, String color, double price,
			String feature, String soundRating) {
		super(itemNumber, brand, quantity, wattage, color, price);
		this.feature = feature;
		this.soundRating = soundRating;
		
	}
	
	public String getFeature() {
		return feature;
	}
	
	public String getSoundRating() {
		return soundRating;
	}
	
	public String getSoundRatingDescription() {
		switch(soundRating) {
		case "Qt": return "Quietest";
		case "Qr": return "Quieter";
		case "Qu": return "Quiet";
		case "M": return "Moderate";
		default: return "Unknown";
		
		
		}
	}
	
	public String toString() {
		return super.toString() + "\n" + 
				"Feature: " + feature + "\n" +
				"SoundRating: " + getSoundRatingDescription();
	}

}
