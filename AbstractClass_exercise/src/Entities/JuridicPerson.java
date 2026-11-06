package Entities;

public class JuridicPerson extends Person {

	private int numberFunc;
	
	public JuridicPerson() {
		super();
	};
	
	public JuridicPerson(int numberFunc, String name, double anualBalance) {
		super(name, anualBalance);
		this.numberFunc = numberFunc;
	}

	public int getNumberFunc() {
		return numberFunc;
	}

	public void setNumberFunc(int numberFunc) {
		this.numberFunc = numberFunc;
	}

	@Override
	public double calcBalance() {
		if(numberFunc > 10) {
			return this.getAnualBalance() * (14.0/100.0);
		} else {
			return this.getAnualBalance() * (16.0/100.0);
		}
	}
	
}
