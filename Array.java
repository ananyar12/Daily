package com.tapacademy.package1;
import java.util.Scanner;

public class Array {
	
	
	static int arrayPosition( int[] ar,int k)
	  {
		for(int i=0;i<ar.length;i++) {
			 if(ar[i]==k) {
				 return i;
			 }
			 
		 }
		return -1;
		
		
		
	}

	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n =scan.nextInt();
	
	
	 int[] ar=new int[n];
	 for(int i=0;i<ar.length;i++) {
		 ar[i]=scan.nextInt();
		 
	 }
	 int k=scan.nextInt();
	 int result=arrayPosition(ar,k);
			 System.out.println(result);

	}

	

}
