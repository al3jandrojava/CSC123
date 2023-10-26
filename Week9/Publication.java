package Week9;

public class Publication extends Item{
	//attributes or fields
	private String author, publicationMonth;
	private int numPages;
	//constructor
	public Publication(String name, String vendor, double price, double cost, double weight, double taxRate, String author, String publicationMonth, int numPages) {
		super(name, vendor, price, cost, weight, taxRate);
		this.author = author;
		this.publicationMonth = publicationMonth;
		this.numPages = numPages;
	}
	//setters and getters
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublicationMonth() {
		return publicationMonth;
	}
	public void setPublicationMonth(String publicationMonth) {
		this.publicationMonth = publicationMonth;
	}
	public int getNumPages() {
		return numPages;
	}
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	//toString
	@Override
	public String toString() {
		return super.toString() + "Publication [Author: " + author + ", Publication month: " + publicationMonth + ", Number of pages: " + numPages
				+ "]";
	}
	
}
