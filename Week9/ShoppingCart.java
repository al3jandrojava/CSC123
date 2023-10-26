package Week9;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart{

	private List<Item> items;

	public ShoppingCart() {
		items = new ArrayList<>();
	}
	public ShoppingCart(List<Item> items) {
		this.items = items;
	}
	
    public void addItem(Item item) {
        items.add(item);
    }

    public int getNumItems() {
        return items.size();
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (Item item : items) {
            totalCost += item.getTotalCost();
        }
        return totalCost;
    }

    public void printCart() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
	
}
