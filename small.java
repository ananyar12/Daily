package com.tapacademy.package1;

import java.util.Scanner;

public class small {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	     int[] arr = new int[n];
	    for (int i = 0; i <arr.length; i++) 
	    {
	        arr[i] = input.nextInt();
	    }
	    int result=findsml(arr);
		  System.out.println(result);

	}
	   

	
	static int findsml(int [] arr){
		int small=arr[0];
		for (int i = 0; i <arr.length; i++) {
			if (arr[i]<small) {
			small=arr[i];
				
			}
	       
	    }
		return small;


	}
}
	
	 

	


