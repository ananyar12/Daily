package programs;
import java.util.Scanner;
public class CountConsonents {
	 static int CountConsonents(String inputstr){
		
		int cc=0;
		for(int i=0;i<inputstr.length();i++) 
		{
			char ch= inputstr.charAt(i);
			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'
					||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
			{
				cc++;
			}
		}
		return cc;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
		System.out.println("Enter The InputString");
           String inputstr=scan.next();
           int res=CountConsonents(inputstr);
           System.out.println("Count of Consonents in the given String is "+"=>"+res+".");
	}

}
