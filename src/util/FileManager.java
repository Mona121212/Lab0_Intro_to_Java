package util;

import java.io.*;
import java.util.*;
import model.*;

public class FileManager {
	
	public List<Appliance> loadAppliances(String filename) throws IOException{
		List<Appliance> appliances = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			while((line = br.readLine()) != null) {
				line = line.trim();
				if(!line.isEmpty()) {
					Appliance appliance = parseAppliance(line);
					if(appliance != null) {
						appliances.add(appliance);
					}
					
				}
				
			}
		}
		return appliances;
	}
	
	private Appliance parseAppliance(String line) {
		String[] parts = line.split(";");
		if(parts.length < 6) return null;
		
		String itemNumber = parts[0];
		String brand = parts[1];
		int quantity = Integer.parseInt(parts[2]);
		int wattage = Integer.parseInt(parts[3]);
		String color = parts[4];
		double price = Double.parseDouble((parts[5]);
		
		char firstDigit = itemNumber.charAt(0);
		
		switch(firstDigit) {
		case '1':
			if(parts.length >= 9) {
				int numberOfDoors = Integer.parseInt(parts[6]);
				int height = Integer.parseInt(parts[7]);
				int width = Integer.parseInt(parts[8]);
				
				return new Refrigerator(itemNumber, brand, quantity, wattage, color, price, numberOfDoors, height, width);
			}
			break;
		case '2':
			if(parts.length >= 8) {
				String grade = parts[6];
				int batteryVoltage = Integer.parseInt(parts[7]);
				return new Vacuum(itemNumber, brand, quantity, wattage, color, price, grade, batteryVoltage);
			}
			break;
		case '3':
			if (parts.length >= 8) {
                double capacity = Double.parseDouble(parts[6]);
                String roomType = parts[7];
                return new Microwave(itemNumber, brand, quantity, wattage, color, price, capacity, roomType);
            }
            break;
		case '4':
		case '5':
			if(parts.length >= 8) {
				String feature = parts[6];
				String soundRating = parts[7];
				return new Dishwasher(itemNumber, brand, quantity, wattage, color, price, feature, soundRating);
			}
			break;
		
	}
		return null;
}
	
	private String formatApplianceForFile(Appliance appliance) {
        StringBuilder sb = new StringBuilder();
        sb.append(appliance.getItemNumber()).append(";");
        sb.append(appliance.getBrand()).append(";");
        sb.append(appliance.getQuantity()).append(";");
        sb.append(appliance.getWattage()).append(";");
        sb.append(appliance.getColor()).append(";");
        sb.append(appliance.getPrice()).append(";");

        if (appliance instanceof Refrigerator) {
            Refrigerator ref = (Refrigerator) appliance;
            sb.append(ref.getNumberOfDoors()).append(";");
            sb.append(ref.getHeight()).append(";");
            sb.append(ref.getWidth()).append(";");
        } else if (appliance instanceof Vacuum) {
            Vacuum vacuum = (Vacuum) appliance;
            sb.append(vacuum.getGrade()).append(";");
            sb.append(vacuum.getBatteryVoltage()).append(";");
        } else if (appliance instanceof Microwave) {
            Microwave microwave = (Microwave) appliance;
            sb.append(microwave.getCapacity()).append(";");
            sb.append(microwave.getRoomType()).append(";");
        } else if (appliance instanceof Dishwasher) {
            Dishwasher dishwasher = (Dishwasher) appliance;
            sb.append(dishwasher.getFeature()).append(";");
            sb.append(dishwasher.getSoundRating()).append(";");
        }

        return sb.toString();
    }
}
