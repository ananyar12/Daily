package programs;

import java.util.Scanner;

public class Mergearray2 {
	 static int[] mergeArray(int[] ar1,int[] ar2,int[]ar3){
		int[] res=new int [ar1.length+ar2.length+ar3.length];
		int i=0,j=0,k=0;
		while(k<res.length) 
		{
			if(i<ar1.length) 
			{
				res[k++]=ar1[i];
			}
			if(i<ar2.length) 
			{
				res[k++]=ar2[i];
			}
			if(i<ar3.length) 
			{
				res[k++]=ar3[i];
			}
			i++;


		}
		return res;
	 }

	   public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first Array size");
		int x=scan.nextInt();
		int[] ar1=new int [x];
		System.out.println("Enter the first Array Elements");
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=scan.nextInt();
		}
		System.out.println("Enter the Second Array size");
		int y=scan.nextInt();
		int[] ar2=new int [y];
		System.out.println("Enter the Second Array Elements");
		for(int j=0;j<ar2.length;j++)
		{
			ar2[j]=scan.nextInt();
			
		}
		System.out.println("Enter the Third Array size");
		int z =scan.nextInt();
		int[] ar3=new int [z];
		System.out.println("Enter the Third Array Elements");
		for(int k=0;k<ar3.length;k++)
		{
			ar3[k]=scan.nextInt();
			
		}
        int [] result =mergeArray(ar1,ar2,ar3);
        System.out.println("Merged Array");
		 for(int i=0;i<result.length;i++) 
		 {
			 System.out.print(result[i]+" ");
		}
	}

}
