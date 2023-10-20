package programs;
import java.util.Scanner;

public class SubArray {
	
	static void SubArrayOfGivenLength(int[]ar,int k){
		
		System.out.print("calling method");
		System.out.println();
		
		for(int i=0;i<=ar.length-k;i++) 
		{
			for(int j=i;j<k+i;j++) 
			{
				System.out.print(ar[j]+" ");
			}
			
			System.out.println();
				
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
	
		SubArrayOfGivenLength(ar,k);
		

	}

}
