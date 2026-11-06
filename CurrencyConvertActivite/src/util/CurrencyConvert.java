package util;

public class CurrencyConvert {
	
	static double IOF = 0.06;
	
	public static double currencyConvert (double price, double quantity) {
		return price * quantity + (IOF * price * quantity);
	}
}
