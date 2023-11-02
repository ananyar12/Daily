package programs;

import java.util.Scanner;

public class CovertLowecaseintoUppercase {
	static String covertLowecaseintoUppercase (String s){
		String t="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				t=t+(char)(ch-32);
			}else {
				t=t+ch;
			}
	}
		return t;
}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String with mixed characters");
		String s=scan.next();
		String  res =covertLowecaseintoUppercase (s);
		System.out.println("Coverting lowecase To UpperCase: " +res);

	}

}
