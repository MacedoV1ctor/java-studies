package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.Products;
import Entities.Rectangle;
import Entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner  = new Scanner(System.in);
		
		/* Exercise 1 Product
		
		Products product = new Products();
		System.out.println(product.toStirng());
		
		System.out.println("Enter the quantity to add to stock");
		product.addProducts(scanner.nextInt());
		System.out.println(product.toStirng());
		
		System.out.println("Enter the quantity to remove from stock");
		product.removeProducts(scanner.nextInt());
		System.out.println(product.toStirng());
		*/
		
		/*Exercise 2 Rectangle 
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter a rectangle width and height");
		rec.width = scanner.nextDouble();
		rec.height =  scanner.nextDouble();
		
		System.out.println(rec);
		
		*/
		
		/* Exercise 3 Employee
		 * 
		Employee emp = new Employee();
		
		System.out.println("Enter the employee's name");
			emp.name = scanner.nextLine();
		System.out.println("Enter the gross salary");
			emp.grossSalary = scanner.nextDouble();
		System.out.println("Enter the tax");
			emp.tax = scanner.nextDouble();
			
		System.out.println(emp);	
		
		System.out.println("What the porcentage would you like to increase the salary by?");
		emp.increaseSalary(scanner.nextDouble());
		
		System.out.println(emp);
		
		*/
		
		Student stu = new Student();
		
		System.out.println("Enter 1 trimester score");
			stu.note1 = scanner.nextDouble();
		System.out.println("Enter 2 trimester score");
			stu.note2 = scanner.nextDouble();
		System.out.println("Enter 3 trimester score");
			stu.note3 = scanner.nextDouble();	
			
		double[] finalScore = stu.calcFinalScore();	
		
		System.out.println(finalScore[0] + " " + finalScore[1]);
		
		if(finalScore[1] != 0) {
			System.out.println("FINAL GRADE = " + finalScore[0] + "\n" +
							   "FAILED" + "\n" + 
							   "MISSING " + finalScore[1] + " POINTS");
			
		}else {
			System.out.println("FINAL GRADE = " + finalScore[0] + "\n" +
							   "PASS");
		}
		
	
	
	
		
		
		
	
	}

}
