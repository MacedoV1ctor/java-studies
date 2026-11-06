package Entities;

public class Products {
	public String name = "TV";
	public int quantity = 1;
	public double price = 1000;
	
	public double TotalVlaueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		this.TotalVlaueInStock();
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		this.TotalVlaueInStock();
	}
	
	public String toStirng(){
		return "Name: " + this.name + "\n" +
			   "Quantity: " + this.quantity + "\n" +
			   "Price: " + this.TotalVlaueInStock() + "\n";
		
	}
	
}
