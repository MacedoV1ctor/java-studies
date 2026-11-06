package Entities;

public abstract class Person {
	
	private String name;
	private double anualBalance;
	
	
	public Person() {};
	
	public Person(String name, double anualBalance) {
		this.name = name;
		this.anualBalance = anualBalance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAnualBalance() {
		return anualBalance;
	}
	public void setAnualBalance(double anualBalance) {
		this.anualBalance = anualBalance;
	}
	public abstract  double calcBalance();
	
	
	

}
