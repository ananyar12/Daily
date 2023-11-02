package programs;

import java.util.Scanner;

public class ConvertUpperToLowerAndLowerToUpper {
	static String convertUpperToLowerAndLowerToUpper(String s){
		String t="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				t=t+(char)(ch-32);
			}else if(ch>='A'&&ch<='Z'){
				t=t+(char)(ch+32);
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
		String  res =convertUpperToLowerAndLowerToUpper (s);
		System.out.println("Coverting lowecase To UpperCase and UpperCase To lowecase");
		System.out.println(res);

	}

}
