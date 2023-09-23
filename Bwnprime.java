package com.tapacademy.package1;
import java.util.Scanner;


public class Bwnprime {
	prime(int num1,int num2){
		for(int i=num1;i<=num2;i++) {
			if(Test.isprime(i)) {
				System.out.println(i);
				
			}
			
		}
		
	}
	
	
	
		
	
	
	
	
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		Prime(num1,num2);
	

	}

}
