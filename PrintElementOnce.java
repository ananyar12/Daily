package com.tapacademy.package1;
import java.util.Scanner;

public class PrintElementOnce {
	 static void printOnce(int[] ar){
		for(int i=0;i<ar.length-1;i++) {
	    	   if(ar[i]!=ar[i+1]) {
	    		   System.out.print(ar[i]+" ");
	    		  
	    	   }
	    	   
	       }
		System.out.println(ar[ar.length-1]);
}
	
	public static void main(String[] args) {
       Scanner scan=	new Scanner(System.in);
       int n=scan.nextInt();
       int[] ar=new int[n];
       for(int i=0;i<ar.length;i++) {
    	   ar[i]=scan.nextInt();
       }
       
       
      printOnce(ar);


	}

}
