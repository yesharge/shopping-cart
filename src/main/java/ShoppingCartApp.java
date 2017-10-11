import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Order orders = new Order();
		String continueShopping = "";
		String nameOfItem = "";
		double priceOfItem = 0.0;
		int quantityOfItem = 0;

		ArrayList<Order> cart = new ArrayList<Order>();
		System.out.println("Welcome to the We Can Code ITs online store");
		while (!continueShopping.equals("n")) {

			System.out.println("Enter the name of the item:");
			nameOfItem = input.nextLine();

			System.out.println("Enter the price of the item:");
			priceOfItem = input.nextDouble();
			input.nextLine();

			System.out.println("Enter the quantity:");
			quantityOfItem = input.nextInt();
			input.nextLine();
			orders.addToOrder(new Item(nameOfItem, priceOfItem, quantityOfItem));
			cart.add(orders);
			System.out.println("Would you like to continue shopping? (y/n)");
			continueShopping = input.nextLine();
		}
		System.out.println("Current cart");
		orders.displayOrder();

		System.out.println("\nWould you like to remove anything from the cart? (y/n)");
		String removeCart = input.nextLine();
		while (!removeCart.equals("n")) {
			System.out.println("Enter the name of the item you would like us to remove ");
			String removeName = input.nextLine();
			orders.removeItem(removeName);
			System.out.println("Would you like us to remove anything else? (y/n)");
			removeCart = input.nextLine();

		}
		input.close();
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("Here is your final cart: ");
		orders.displayOrder();
		System.out.println();
		System.out.println("Total price: " + df.format(orders.getTotal()));
	}

}
