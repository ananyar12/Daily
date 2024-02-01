package programs;
import java.util.Scanner;
import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		System.out.println(al1);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(1);
		al2.add(6);
		al2.add(2);
		al2.add(3);
		System.out.println(al2);
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println("Remove All");
		al2.removeAll(al1);
		System.out.println(al2);
		al2.retainAll(al1);
		System.out.println(al2);
	al1.set(0, 0);
	System.out.println(al1);
	al1.add(1,1);
	System.out.println(al1);
	System.out.println("by get method");
	ArrayList<Integer> al3=new ArrayList<Integer>();
	al3.add(1);
	al3.add(6);
	al3.add(2);
	al3.add(3);
	


		for(int i =0;i<=al3.size()-1;i++) {
			
			System.out.println(al3.get(i));
	
		
	}
	
	
		

	}

}
