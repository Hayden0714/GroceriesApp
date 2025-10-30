package groceryapp;

import java.util.Scanner;

/**
 * Main method for launching the application
 * 
 * @param args
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to the Groceries Application!");

		try {
			switch (menu()) {
			case 1:
				System.out.println("Add add!");
				break;
			case 2:
				System.out.println("Edit edit!");
				break;
			case 3:
				System.out.println("Bye bye!");
				System.exit(0);
			default:
				break;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// Read in properties that are set

		// Start up the CLI and sit in a loop
	}

	public void printGreeting() {
		System.out.println("Welcome to the groceries app!");
	}

	public static int menu() {
		System.out.println("Please select one of the choices below:");
		System.out.println("1. Add a recipe");
		System.out.println("2. Edit a recipe");
		System.out.println("3. Exit application");

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		return input;
	}
}
