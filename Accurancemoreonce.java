package programs;
import java.util.Scanner;

public class Accurancemoreonce {
static void moreThanOnes(int[] ar){
	int count=1;
	for(int i=0;i<ar.length-1;i++) {
      if(ar[i]==ar[i+1]) {
    	  count++;
    }
      else {
    	  
      if(count>1)
      {
    	  System.out.println(ar[i]);
    	  
      }
      count=1;
	}
    	
    
if(count>1) {
 	  System.out.println(ar[ar.length-1]);  	  
 	  }
	}
}

	
		
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] ar=new int[n];
        for(int i=0;i<ar.length;i++) {
        	ar[i]=scan.nextInt();
        	
        }
        moreThanOnes(ar);

	}

}

