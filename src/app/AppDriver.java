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
		 do {
			 System.out.println("\nWelcome to Modern Appliances!");
			 System
		 }
	 }

}
