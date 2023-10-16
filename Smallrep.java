package programs;
import java.util.Scanner;

public class Smallrep {
	 static int smallestRepeatingElement(int[] ar){
		 for(int i=ar.length-2;i>=0;i--) {
				if(ar[i]==ar[i+1])
				{
					return ar[i];
				}
			
			}
		 return -1;
}
	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int[] ar=new int [n];
	for(int i=0;i<ar.length-1;i++) {
		ar[i]=scan.nextInt();
		
	}
	int result =smallestRepeatingElement(ar);
	System.out.println(result);
		
	

	}

}
