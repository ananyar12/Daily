package programs;
import java.util.Scanner;

public class ReplaceConsonents {
	static String replaceConsonents(String s){
		String t="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'
					||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
			{
				t=t+"#";
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
		String res=replaceConsonents(s);
		System.out.println("String after replacement of consonents with '#': "+res);

	}

}
