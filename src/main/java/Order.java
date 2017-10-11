import java.util.ArrayList;

public class Order {
	ArrayList<Item> orders = new ArrayList<Item>();

	public void addToOrder(Item order) {
		orders.add(order);
	}

	public int getSize() {
		return orders.size();
	}

	public void removeItem(String item) {
		for (int i = 0; i < orders.size(); i++) {
			if (orders.get(i).getName().equals(item)) {
				orders.remove(i);
			}
		}
	}

	public void displayOrder() {
		for (Item order : orders) {
			System.out.println(order);
		}
	}

	public double getTotal() {
		double total = 0;
		for (Item item : orders) {
			total += item.getPrice()*item.getQuantity();
		}
		return total;
	}

}
