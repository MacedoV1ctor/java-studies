package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Bank_account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//program variables
		int option = 0;
		int accountNumber;
		String titular;
		double deposit;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bank_account acc = null;
		
		option = 0;
		System.out.println("teste");
		while(option != 5) {
			
			System.out.println("1 - create a Bank account with deposit" + "\n" +
					   "2 - Create a Bank account without deposit " + "\n" +
					   "3 - deposit " + "\n" +
					   "4 - Withdraw" + "\n" +
					   "5 - close" + "\n");
			
			option = sc.nextInt();
			
			switch (option) {
			case 1: {
				System.out.println("For create your account with deposit, please enter de informations bellow:" + "\n" +
									"----------------------------------------------------------------------------------" + "\n" +
									"Please digit your Account number:");
				accountNumber = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Please enter the titular name's");
				titular = sc.nextLine();
				
				System.out.println("Enter the value of tour first deposit please:");
				deposit = sc.nextDouble();
				sc.nextLine();
				
				 acc = new Bank_account(accountNumber, titular, deposit);
				
				break;
			}case 2:
				
				System.out.println("For create your account without deposit, please enter de informations bellow:" + "\n" +
						  "----------------------------------------------------------------------------------" + "\n" +
						  "Please digit your Account number:");
					accountNumber = sc.nextInt();
				System.out.println("Please enter the titular name's:");
					titular = sc.nextLine(); sc.nextLine();
					
				acc = new Bank_account(accountNumber, titular);	
				break;
				
			case 3:
				System.out.println("please enter the deposit value:");
				double value = sc.nextDouble();
				acc.makeDeposit(value);
				
				System.out.println(acc);
				
				break;
				
			
			case 4:
				System.out.println("please enter a value to withdraw");
				double withdraw = sc.nextDouble();
				
				acc.withdrawal(withdraw);
				System.out.println(acc);
				
			case 5:
				System.out.println("Bye");
				break;
				
			default:
				break;
			}
			
		
		}	
		
		

	}
	


}
