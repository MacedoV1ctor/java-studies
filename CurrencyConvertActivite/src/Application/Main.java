package Application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConvert;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what's the dollar price:");
			double price = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
			double quantity = sc.nextDouble();
		System.out.println("Amount to be paid in reais = " + CurrencyConvert.currencyConvert(price, quantity));	
	}

}
