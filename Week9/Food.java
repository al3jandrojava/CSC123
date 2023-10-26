package Week9;

public class Food extends Item{
	//attributes or fields
	private String sellByDate, useByDate;
	//constructor
	public Food(String name, String vendor, double price, double cost, double weight, double taxRate, String sellByDate, String useByDate) {
		super(name, vendor, price, cost, weight, taxRate);
		this.sellByDate = sellByDate;
		this.useByDate = useByDate;
	}
	//getter and setters
	public String getSellByDate() {
		return sellByDate;
	}

	public void setSellByDate(String sellByDate) {
		this.sellByDate = sellByDate;
	}

	public String getUseByDate() {
		return useByDate;
	}

	public void setUseByDate(String useByDate) {
		this.useByDate = useByDate;
	}
	//toString
	@Override
	public String toString() {
		return super.toString() + "Food [Sell by date: " + sellByDate + ", Use by date: " + useByDate + "]";
	}
	
}
