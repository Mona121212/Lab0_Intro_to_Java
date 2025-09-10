package app;
import model.*;

public class AppDriver {
	public static void main(String[] args) {
		Refrigerator test = new Refrigerator("1", "test", 5, 10, "Red", 12.50, 2, 10, 15);
		System.out.println(test);
	}
}
