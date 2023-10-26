package Week9;

import java.util.Scanner;

public class ShoppingDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		
		boolean shopping = true;
		while (shopping) {
			System.out.println("1. Add item to cart");
			System.out.println("2. Show cart");
			System.out.println("3. Exit");
			System.out.print("Select an option: ");
			int choice = input.nextInt();

			input.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter item name: ");
				String name = input.nextLine();
				
				System.out.println("Enter vendor: ");
				String vendor = input.nextLine();
				
				System.out.println("Enter price: ");
				double price = input.nextDouble();
				
				System.out.println("Enter cost: ");
				double cost = input.nextDouble();
				
				System.out.println("Enter weight: ");
				double weight = input.nextDouble();
				
				System.out.println("Enter tax rate: ");
				double taxRate = input.nextDouble();

				//Create an Item object
				Item item = new Item(name, vendor, price, cost, weight, taxRate);

				//Add the item to the cart
				cart.addItem(item);
				System.out.println("Item added to the cart");
				break;
			case 2:
				//Show the item in the cart
				cart.printCart();
				break;
			case 3:
				//Exit the shopping program
				shopping = false;
				System.out.println("Exited the Shopping Cart");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
		input.close();
	}

}
