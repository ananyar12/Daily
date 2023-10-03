package com.tapacademy.package1;
import java.util.Scanner;
public class Sumnp {
	 static int sumpos(int[] ar){
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>0) {
				sum=sum+ar[i];
			}
			
		}
		return sum;
	}
	static int sumneg(int[] ar){
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<0) {
				sum=sum+ar[i];
			}
			
		}
		return sum;
	}
	
	
	
	
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int[] ar=new int[n];
	    for(int i=0;i<ar.length;i++)
	    {
	    	ar[i]=scan.nextInt();
	    }
	    
	    int res1=sumpos(ar);
	    int res2=sumneg(ar);
	    System.out.println(res1);
	    System.out.println(res2);
		
	}

}
