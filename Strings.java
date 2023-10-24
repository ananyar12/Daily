package programs;
import java.util.Scanner;
public class Strings {
static String reverse(String s )
	 {
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		 {
		  t = t + s.charAt(i);
	     }
	     return t;
	
	 }
public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the string");
	  String s=scan.next();
	  String res=reverse(s);
	  
	  if(s.equals(res)) 
	  {
		  System.out.println("palindrom");
	  }
	  else {
		  System.out.println("not palindrom");
	  }
	}
}


