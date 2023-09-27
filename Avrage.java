package com.tapacademy.package1;
import java.util.Scanner;
public class Avrage {
	 static int arsum(int[] ar){
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
			
		}
		return sum;
	}
	 
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar=new int [n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
			
		}
		 float totalsum= arsum(ar);
		 float result=(totalsum/n);
		 System.out.println(result);
		 
		
		
		
	}

}
