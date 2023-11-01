package programs;
import java.util.Scanner;

public class CountAllDiffCharecters {
	 static void countAllDiffCharecters (String s){
		int vc=0;
		int cc=0;
		int nc=0;
		int sc=0;
		for(int i=0;i<s.length();i++) 
		{
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z' ))
			{
			   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'
					||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vc++;
			}
			else
			{
				cc++;
			}
		    }
			else if(ch>='0'&&ch<='9') 
			{
				nc++;
			}
			else 
			{
				sc++;
			}
	}
	
		System.out.println("Vowels count in he given string is: "+vc);
		System.out.println("Consonents count in he given string is: "+cc);
		System.out.println("Numericals count in he given string is: "+nc);
		System.out.println("Special Charcters count in he given string is: "+sc);
	}

	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		System.out.println("Enter the input string");
		String s=scan.next();	
		countAllDiffCharecters (s);
		
	}

}
