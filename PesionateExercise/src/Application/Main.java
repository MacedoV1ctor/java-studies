package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student[] pensionato = new Student[10];
		
		Student std;
		
		System.out.println("Choose a number from Menu:");
		
		int choice = 0;
		
		while(choice != 9) {
			
		    System.out.println("1 - Rent a room");
		    System.out.println("2 - List rooms");
		    System.out.println("9 - Exit");

		    choice = sc.nextInt();
		    sc.nextLine();
			
			switch (choice) {
			case 1: 
				
				System.out.println("Enter the Student name;");
					String name = sc.nextLine();
				System.out.println("Enter the Student e-mail");
				    String email = sc.nextLine();
				System.out.println("Select a room from 0 to 9");
					int room = sc.nextInt();sc.nextLine();
					
				std = new Student(name, email, room);
				
				pensionato[room] = std;
				    
				break;
				
				case 2:
					for(int i = 0; i<pensionato.length; i++) {
						if(pensionato[i] != null) {
							System.out.println(pensionato[i]);
						}	
						
					}
					
		
			
			}
			
		}
		
		
		
		
		
		 

	}

}
