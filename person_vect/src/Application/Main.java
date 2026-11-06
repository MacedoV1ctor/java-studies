package Application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hoe many persons will be digit?");
			int n = sc.nextInt();
			
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];
		
		for(int i = 0; i<name.length; i++) {
			System.out.print("name: ");sc.nextLine();
				name[i] = sc.nextLine(); 
			System.out.print("Age: ");
				age[i] = sc.nextInt(); sc.nextLine();
			System.out.print("height: ");
				height[i] = sc.nextDouble(); 
			
		}
		
		
		double avarage = 0.0;
		int aux = 0;
		
		for(int i = 0; i<name.length; i++) {
			avarage += height[i];
			
			if(age[i] < 16) {
				aux ++;
			}
			
		}
		
		int percentage = (aux * 100) / age.length;
		avarage = avarage / height.length;
		
		System.out.println("People percentage less than 16 years old: " + percentage + "%");
		System.out.printf("height avarage: %.2f%n", avarage);
		
		System.out.println("person's name under 16 years old: ");
		
		
		for(int i = 0; i<name.length; i++) {
			if(age[i] < 16) {
				System.out.println(name[i]);
			}
			
		}
		
		
		
		
		
	}

}
