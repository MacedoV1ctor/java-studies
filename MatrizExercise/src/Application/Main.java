package Application;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter two integers number of the matriz");
			int x = sc.nextInt();sc.nextLine();
			int y = sc.nextInt(); sc.nextLine();
		
			int [][] matriz = new int[x][y];
			
		System.out.println("Enter matriz values: ");
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
			
			
		}
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				 System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
			
		System.out.println("Enter the 'X' number: ");
			int xx = sc.nextInt();
			
			
			for(int i = 0; i<matriz.length; i++) {
				for(int j = 0; j<matriz[i].length; j++) {
					if(matriz[i][j] == xx) {
						System.out.println("Position: " + i + " , " + j);
						if(matriz[i][j -1] > 0) {
							System.out.println("left: " + matriz[i][j -1 ] );
						}
						
						if (j < matriz[i].length - 1) {
							System.out.println("right: " + matriz[i][j + 1] );
						}
						
						if (i > 0) {
							System.out.println("up: "  + matriz[i - 1][j] );
						}
						
						if (i < matriz.length - 1) {
							System.out.println("down: " + matriz[i + 1][j] );
						}	
					}
				}
				
				
			}	
		
	}

}
