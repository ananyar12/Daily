package com.tapacademy.package1;
import java.util.Scanner;

public class Hallowtriangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		 for (int i = 1; i <= n; i++) {
	            
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            
	            
	            if (i == 1 || i == n) {
	                for (int j = 1; j <= i; j++) {
	                    System.out.print("*"+" ");
	                }
	            } else {
	                
	                System.out.print("*");
	                for (int j = 1; j <= 2 * i - 3; j++) {
	                    System.out.print(" ");
	                }
	                System.out.print("*");
	            }
	            
	            System.out.println(); 
	        }

	}

}
