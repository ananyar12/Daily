package com.tapacademy.package1;
import java.util.Scanner;




class test1{
	  static Boolean checkprime(int n)
	  
	 { 
		  for(int i=2;i<=n/2;i++) 
		{
			if(n%i==0)
			{
				return true;
			}
			
		 }
		 return false;
		  
			
			
}
}
class Isprime {
	 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
	 for(int i=2;i<=n/2;i++) 
	 {
	  if(test1.checkprime(i)) 
	 {
		 System.out.println(i);
	 }
	 
	 }
	 }
}
	 
	 
	 
	 
	 
	
	


	 


	 
		
			
			
		
		
	

		
	

	