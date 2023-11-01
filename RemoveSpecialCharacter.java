package programs;
import java.util.Scanner;
public class RemoveSpecialCharacter {
	 static String removeSpecialCharacter(String s){
		String t="";
		for(int i=0;i<s.length();i++) 
		{
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z' )||(ch>='0'&&ch<='9'))
			{
				t=t+ch;
			}
	    }
		return t;
	}
	    public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		System.out.println("Enter the input string");
		String s=scan.next();	
		String res=removeSpecialCharacter(s);
		System.out.println("Newstring after removal of special Charecters from input string"+" "+ res);
		
	}

}
