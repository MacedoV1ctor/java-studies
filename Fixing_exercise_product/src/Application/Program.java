package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {
	public static void main (String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double totalTax = 0.0;
		
		ArrayList<Product> productList = new ArrayList();
		
		System.out.println("How many Product does you wanna register?");
			int aux = sc.nextInt();

			
		for(int i = 0; i<aux; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common,used or imported (c/u/i): ");
				char x = sc.next().charAt(0);
				sc.nextLine();
			System.out.print("Name: ");
				String name = sc.nextLine();
			System.out.print("Price: ");
				Double price = sc.nextDouble();
			if(x == 'i') {
				System.out.print("Custom fee: ");
				Double fee = sc.nextDouble();				
				ImportedProduct importedProd = new ImportedProduct(fee,name,price);				
				productList.add(importedProd);
				
			} else if (x == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();	
				Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
				UsedProduct usedProduct = new UsedProduct(date, name, price);	
				productList.add(usedProduct);
			} else {
				Product product = new Product(name,price);
				productList.add(product);
			
			}
		}
		
		for(Product prod : productList) {
			System.out.println(prod.priceTag());
			aux += prod.priceTag();
		}
		
	}
}
