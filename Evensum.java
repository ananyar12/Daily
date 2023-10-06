package com.tapacademy.package1;
import java.util.Scanner;
public class Evensum {
    static int	sum(int[] ar){
	int sum=0;
	for(int i=0;i<ar.length;i++) 
		if(ar[i]%3==0&&ar[i]%5==0) {
			sum=sum+ar[i];
			
		}
	return sum;
	
		
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) 
		{
			ar[i]=scan.nextInt();
		}
			int result=sum(ar);
			System.out.print(result);
			
		
		}
	}


