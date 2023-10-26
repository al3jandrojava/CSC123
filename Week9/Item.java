package Week9;

public class Item {

	//attributes or fields
	private String name, vendor;
	private double price, cost, weight, taxRate;

	//Constructor
	public Item(String name, String vendor, double price, double cost, double weight, double taxRate) {
		this.name = name;
		this.vendor = vendor;
		this.price = price;
		this.cost = cost;
		this.weight = weight;
		this.taxRate = taxRate;
	}
	//setter and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	//methods
	public double calculateTax() {
		return (price * taxRate) / 100.0;
	}
	
	public double getTotalCost() {
		return price + calculateTax();
	}

	//toString
	@Override
	public String toString() {
		return "Item [Name: " + name + ", Vendor: " + vendor + ", Price:" + price + ", Cost: " + cost + ", Weight: "
				+ weight + ", Tax rate:" + taxRate + "]";
	}
}
