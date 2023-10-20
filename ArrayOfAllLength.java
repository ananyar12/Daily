package programs;

import java.util.Scanner;

public class ArrayOfAllLength {
	
	static void AllPossibleLength(int[]ar,int n){
		
		for(int i=0;i<=ar.length-n;i++) 
		{   
			
			for(int j=i;j<n+i;j++) 
			{
				System.out.print(ar[j]);
			}
			System.out.println();
		
		
	}
		}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=scan.nextInt();
	    System.out.println("Enter the Array Elements ");
		int []ar=new int[n];
		for(int i=0;i<ar.length;i++) {
		ar[i]=scan.nextInt();
		}
		System.out.println("Array Elements inserted ");
	    for(n=1;n<=ar.length;n++) {
	    	AllPossibleLength(ar,n);
	    }
		}

	

}
