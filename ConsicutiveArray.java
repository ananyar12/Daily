package programs;
import java.util.Scanner;

public class ConsicutiveArray {
	static void ConsicutiveArray(int[] ar1){
	
		
		int si=1,ei=0;
		int start=0,end=0;
		for(int i=0;i<ar1.length-1;i++)
		{
			if(ar1[i]==ar1[i+1]-1) 
			{
				ei++;
			
				
			}else {
				if(ei-si>end-start) 
				{ 
					end=ei;
					start=si;
				}
				ei=i+1;
				si=i+1;
			}
					
	}
		if(ei-si>end-start) 
		{ 
			end=ei;
			start=si;
		}
					
	for(int i=start;i<=end;i++) {
		System.out.print(ar1[i]+" ");
		
	}
		
		
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int n=scan.nextInt();
	
		int[] ar1=new int [n];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<ar1.length;i++) {
			ar1[i]=scan.nextInt();
			
		}
		ConsicutiveArray(ar1);


	}

}
