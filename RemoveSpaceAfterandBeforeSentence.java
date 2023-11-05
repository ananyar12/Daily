package programs;
import java.util.Scanner;
public class RemoveSpaceAfterandBeforeSentence {
 static String trim(String s){
		 String t="";
		 int si=0;
		 int ei=0;
		 for(int i=0;i<s.length();i++) {
			
			 if(s.charAt(i)!=' ') {
				 si=i;
				 break;
			}
		}
		for(int i=s.length()-1;i>=0;i--) {
			
			 if(s.charAt(i)!=' ') {
				 ei=i;
				 break;
			 }
		}
	   for(int i= si;i<= ei;i++) {
			 
			 t=t+s.charAt(i);
		 }
		 return t;
		}
       public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		System.out.println("Enter the String");
		String s=scan.nextLine();
		String res=trim(s);
		System.out.println("String after removal of unwanted space");
		System.out.println(res);
	}

}
