package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;



public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the Employee number that you want register");
			int aux = sc.nextInt();
			
		for(int i = 0; i<aux; i++) {
			System.out.println("Employee Id: ");
				int id = sc.nextInt(); sc.nextLine();
			System.out.println("Name: ");
				String name = sc.nextLine();
			System.out.println("Salary: ");
				double salary = sc.nextDouble();
				
			list.add(new Employee(id,name,salary));	
				
			}	
		
	System.out.println("Enter de Employee id that will have salary increase:");
		int increase = sc.nextInt();
	System.out.println("Enter the percentage");
		double percentage = sc.nextDouble();
		
		Employee result = list.stream().filter(x -> x.getId() == increase).findFirst().orElse(null);		
		
		result.increaseSalary(percentage);
		
		for(Employee x : list) {
			System.out.println(x.toString());
		}
		
		
	}

}
