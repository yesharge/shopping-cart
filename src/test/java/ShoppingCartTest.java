import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCartTest {
	@Test
	public void shouldBeAbleToCreateAShoppingOrder() {
		Item underTest = new Item(" ", 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToGetName() {
		Item underTest = new Item("Bob", 0, 0);
		String check = underTest.getName();
		assertEquals("Bob", check);
	}

	@Test
	public void shouldBeAbleToGetPrice() {
		Item underTest = new Item("Bob", 5, 0);
		double check = underTest.getPrice();
		assertEquals(5, 5.1, check);
	}

	@Test
	public void shouldBeAbleToAddToOrder() {
		Order underTest = new Order();
		underTest.addToOrder(new Item("Bob", 5, 0));
		int check = underTest.getSize();
		assertEquals(1, check);
	}

	@Test
	public void shouldBeAbleToAddToTwoOrders() {
		Order underTest = new Order();
		underTest.addToOrder(new Item("Bob", 5, 0));
		underTest.addToOrder(new Item("Brock", 5, 0));
		int check = underTest.getSize();
		assertEquals(2, check);
	}

	@Test
	public void shouldBeAbleToAddToRemoveAnOrder() {
		Order underTest = new Order();
		underTest.addToOrder(new Item("Bob", 5, 0));
		underTest.addToOrder(new Item("Brock", 5, 0));
		underTest.removeItem("Brock");
		int check = underTest.getSize();
		assertEquals(1, check);
	}

	@Test
	public void shouldBeAbleToTotalOrder() {
		Order underTest = new Order();
		underTest.addToOrder(new Item("Bob", 5, 1));
		underTest.addToOrder(new Item("Brock", 5, 1));
		double check = underTest.getTotal();
		assertEquals(10, 10.1, check);
	}

	@Test
	public void shouldBeAbleToTotalOrderAfterRemoving() {
		Order underTest = new Order();
		underTest.addToOrder(new Item("Bob", 5, 1));
		underTest.addToOrder(new Item("Brock", 5, 1));
		underTest.removeItem("Brock");
		double check = underTest.getTotal();
		assertEquals(5, 5.1, check);
	}
}
