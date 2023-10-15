package com.tapacademy.package1;
import java.util.Scanner;

public class Absolute {
	static int absum(int[] ar){
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			
				sum+=Math.abs(ar[i]);
				
			}
			
		
		return sum;
		
	}
	
public static void main(String [] args) {
		Scanner scan=new  Scanner(System.in);
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) 
		{
			ar[i]=scan.nextInt();
		}
		
		int result =absum(ar);
		System.out.println(result);
		
	}

}
