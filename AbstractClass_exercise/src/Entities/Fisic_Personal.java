package Entities;

public class Fisic_Personal extends Person {
	
	
	private double helth_debt;
	
	public Fisic_Personal(double helth_debt, String name, double anual_balance) {
		super(name, anual_balance);
		this.helth_debt = helth_debt;
	}

	public Fisic_Personal() {
		super();
	};
	
	
	
	public double getHelth_debt() {
		return helth_debt;
	}

	public void setHelth_debt(double helth_debt) {
		this.helth_debt = helth_debt;
	}

	@Override
	public double calcBalance() {
		if(this.getAnualBalance() <20000 && helth_debt > 0) {
			return (this.getAnualBalance() * (15.0/100.0)) - (this.helth_debt * (50.0/100.0));
		} else if(this.getAnualBalance() <20000) {
			return this.getAnualBalance() * (15.0/100.0);
		} else if(this.getAnualBalance() > 20000 && helth_debt > 0 ) {
			return (this.getAnualBalance() * (25.0/100.0)) - (this.helth_debt * (50.0/100.0));
		}
		else {
			return this.getAnualBalance() * (25.0/100.0);
		}
	}

}
