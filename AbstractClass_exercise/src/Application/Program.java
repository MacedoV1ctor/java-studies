package Application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import Entities.Fisic_Personal;
import Entities.JuridicPerson;
import Entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ArrayList<Person> list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		Double aux = 0.0;
		
		System.out.print("Enter the number of tax payers: ");
			int x  = sc.nextInt();
		
		for(int i = 0; i<x; i++) {
			System.out.print("Individual or company? (i/c)?" );
				char type = sc.next().charAt(0);
				sc.nextLine();
			System.out.print("Name: ");
				String name = sc.nextLine();
			System.out.print("Anual income: ");	
				Double income = sc.nextDouble();
			if(type == 'i') {
				System.out.print("Health expenditures: ");
					Double he = sc.nextDouble();
				list.add(new Fisic_Personal(he,name,income));
			} else if(type == 'c') {
				System.out.print("Number of employees: ");
					int emp = sc.nextInt();
				list.add( new JuridicPerson(emp,name,income));
			}	
		}		
	
		for(Person p : list) {
			System.out.println(p.getName() + " $ " + String.format("%.2f", p.calcBalance()));
			aux += p.calcBalance();
		}
		
		System.out.println( "TOTAL TAXES $ " + String.format("%.2f", aux));
		
	}

}
