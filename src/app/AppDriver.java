package app;

import java.io.IOException;
import java.util.*;
import model.*;
import util.FileManager;;


public class AppDriver {
	 private List<Appliance> appliances;
	 private Scanner scanner;
	 private FileManager fileManager;
	 
	 public AppDriver() {
		 appliances = new ArrayList<> ();
		 scanner = new Scanner(System.in);
		 fileManager = new FileManager();
	 }
	 
	 /**
	  * Main entry point of the application
	  */
	 
	 public static void main(String[] args) {
		 AppDriver app = new AppDriver();
		 app.loadAppliances();
		 app.displayMenu();
	 }
	
	 private void loadAppliances() {
		 try {
			 appliances = fileManager.loadAppliances("appliances.txt");
			 System.out.println("Appliances loaded successfully");
		 } catch(IOException e) {
			 System.out.println("Erro loading appliances:" + e.getMessage());
			 appliances = new ArrayList<>();
		 }
		 
	 }
	 
	 private void displayMenu() {
		 int choice;
		 /*
		  *do - while  */
		 do {
			 System.out.println("\nWelcome to Modern Appliances!");
			 System.out.println("How may we assist you?");
			 System.out.println("1 - Check out appliance");
			 System.out.println("2 - Find appliances by brand");
			 System.out.println("3 - Display appliances by type");
			 System.out.println("4 - Produce random appliance list");
			 System.out.println("5 - Save & exit");
			 System.out.println("Enter option: ");
			 
			 choice = getIntInput();
			 
			 switch(choice) {
			 case 1:
				 checkoutAppliance();
				 break;
			 case 2:
				 findAppliancesByBrand();
				 break;
			 case 3:
				 displayAppliancesByType();
				 break;
			 case 4:
				 produceRandomApplianceList();
				 break;
			 case 5:
				 saveAndExit();
				 break;
			default:
				System.out.println("Invalid option. Please try again.");
					
			 }
			 
		 } while(choice != 5);
	 }
	 
	 private void checkoutAppliance() {
		 System.out.print("Enter the item number of an appliance: ");
		 String itemNumber = scanner.nextLine();
		 
		 Appliance appliance = findApplianceByItemNumber(itemNumber);
		 
		 if(appliance == null) {
			 System.out.println("No appliances found with that item number.");
		 } else if(appliance.getQuantity() <= 0) {
			 System.out.println("The appliance is not available to be checked out.");
		 } else {
			 appliance.setQuantity((appliance.getQuantity() - 1);
			 System.out.println("Appliance \"" + itemNumber + "\" has been checked out.");
			 System.out.println(appliance);
		 }
		 
	 }

}
