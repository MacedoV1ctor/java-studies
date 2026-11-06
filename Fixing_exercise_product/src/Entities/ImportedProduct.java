package Entities;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct() {};
	
	public ImportedProduct(Double customsFee, String name, double price) {
		super(name,price);
		this.customsFee = customsFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
	    return this.getName()
	            + " $ "
	            + String.format("%.2f", this.getPrice() + this.getCustomsFee())
	            + " (Customs Fee: $ "
	            + String.format("%.2f", this.getCustomsFee())
	            + ")";
	}

}
