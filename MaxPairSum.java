package com.tapacademy.package1;

import java.util.Scanner;

public class MaxPairSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
        int N = input.nextInt();

        int[] arr = new int[N];
       
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        int maxsum = Integer.MIN_VALUE;
      

        for (int i = 0; i < arr.length; i++) 
        	
        { 
        	for(int j=i+1;j<arr.length-1;j++)
        	{
        		int sum=arr[i]+arr[j];
        	if(sum>maxsum) 
        	{
        		maxsum=sum;
        		
        	}
            } 
            
          
        }
        System.out.println(maxsum);
	}
}
      
    

       
    

    
        

       

	


