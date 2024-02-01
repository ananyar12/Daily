package programs;
import java.util.Scanner;
public class Optimisedprime {
	
	static boolean checkPrime(int n){
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
				
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num");
		int n=scan.nextInt();
		boolean result=checkPrime(n);
		System.out.println(result);

	}

}
