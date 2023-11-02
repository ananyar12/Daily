package programs;
import java.util.Scanner;
public class ReplaceCustomCharacter {
	static String replaceCustomCharacter(String s){
		String t="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='A')
			{
				t=t+"*"+ch;
			}else {
				t=t+ch;
			}
	    }
		return t;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=scan.next();
		String res=replaceCustomCharacter(s);
		System.out.println("String after cancatinating '*' before 'a' or 'A':");
		System.out.println(res);
	}

}
