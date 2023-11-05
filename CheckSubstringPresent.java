package programs;
import java.util.Scanner;
public class CheckSubstringPresent {
	static void checkSubstring(String s,String t) {
		int i=0;
		int j=0;
		while( i<s.length()&& j<t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				j++; i++;
			}else {
				i++;
			}
		}
		if(j==t.length()) {
			System.out.println("substring is present");
		}else {
			System.out.println("substring is not present");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		System.out.println("Enter the String");
		String s=scan.nextLine();//input string
		System.out.println("Enter the Substring");
		String t=scan.nextLine();//substring
		checkSubstring(s,t);
	}

}
