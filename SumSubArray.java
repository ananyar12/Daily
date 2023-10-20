package programs;
import java.util.Scanner;
public class SumSubArray {
static void SumOfSubArray(int[]ar,int k){
		for(int i=0;i<=ar.length-k;i++) 
		{   
			int res=0;
			int sum=0;
			for(int j=i;j<k+i;j++) 
			{
				sum=sum+ar[j];
			}
			
			for(int j=i;j<k+i;j++) 
			{ 
				
			   res=(ar[j]);
			   System.out.print(ar[j]+" ");
			}
			
			System.out.println();
			System.out.println("Subarray");
		    for(int j=i;j<k+i;j++) 
            { }
			
			System.out.println("sum of the subArray is: "+sum);
			System.out.println("---------------------------------------");
		}
	}
	    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=scan.nextInt();
		System.out.println("Enter the size of an SubArray");
		int k=scan.nextInt();
		System.out.println("Enter the Array Elements ");
		int []ar=new int[n];
		for(int i=0;i<ar.length;i++) {
		ar[i]=scan.nextInt();
		}
		System.out.println("Array Elements inserted ");
	    SumOfSubArray(ar,k);
		}

}
