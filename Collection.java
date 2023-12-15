package programs;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashMap;

public class Collection {
	static void countChar(String s){
		LinkedHashMap <Character,Integer>map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				int c=map.get(ch);
				map.put(ch,c+1);
				
			}else {
				map.put(ch, 1);
			}
			
		}
		Set<Character> keys=map.keySet();
		for(char key:keys) {
			int value=map.get(key);
			System.out.print(key+""+value);
			
		}
	}
	
	public static void main(String[] args) {
	 Scanner scan= new Scanner(System.in);
	 System.out.println("Enter the string ");
	 String s=scan.nextLine();
	 countChar(s);


	}

}
