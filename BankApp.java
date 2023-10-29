package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Savepoint;

public class BankApp {
public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/tap_bank";
		String un="root";
		String pwd="root";
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url,un,pwd);
			 Scanner scan=new Scanner(System.in);
			 
			 // login module
			 System.out.println("<-------Wellcome to TapBank---------->");
			  System.out.println("Enter Accout Number");
			  int acc_num=scan.nextInt();
			  System.out.println("Enter pin:");
			  int pin=scan.nextInt();
			  
			  PreparedStatement pstmt1=con.prepareStatement
			("select*from account where" + " acc_num = ? and pin= ?");
			  // to set values for ?
			  pstmt1.setInt(1,acc_num);
			  pstmt1.setInt(2,pin);
			  
			 ResultSet res1= pstmt1.executeQuery();
			 
			 res1.next();
			 String name=res1.getString(2);
			 int bal=res1.getInt(4);
			 System.out.println("welcom"+" "+name);
			 System.out.println("Available balance is:"+bal);
			 
			 // Transfer Module
			 System.out.println("<-----------Transfer detailes------------->");
			 System.out.println("Enter the Benificiary Account number");
			 int bacc_num=scan.nextInt();
			 System.out.println("Enter the transfer amount");
			 int t_amount=scan.nextInt();
			 
			 
			 con.setAutoCommit(false);
			 // to mark 
			 Savepoint s=con.setSavepoint();
			 
			 
			 PreparedStatement pstmt2=con.prepareStatement
			 ("update account set balance=balance-? where acc_num= ?");
			 //to set values
			 pstmt2.setInt(1,t_amount);
			 pstmt2.setInt(2,acc_num);
			 //to update
			 pstmt2.executeUpdate();
			 
			 System.out.println("<-----------Incoming credite requset ------------>");
			 System.out.println(name+" "+"account number"+" "
			     +acc_num+" "+"wants to transfer"+" "+ t_amount);
			 System.out.println("Press Y to Receive");
			 System.out.println("Press N to Reject");
			 String choice =scan.next();
			 
			 if(choice.equals("Y")){
				 PreparedStatement pstmt3=con.prepareStatement
				("update account set balance=balance + ? where acc_num = ? ");
				 pstmt3.setInt(1,t_amount);
				 pstmt3.setInt(2,bacc_num);
				 pstmt3.executeUpdate();
				 
				 PreparedStatement pstmt4=con.prepareStatement
				("select * from account where acc_num = ? ");
				 pstmt4.setInt(1,bacc_num);
				 ResultSet res2=pstmt4.executeQuery();
				 res2.next();
				 
				 System.out.println("update balance is:"+" "+res2.getInt(4));
			 }
			 else
			 {
				 con.rollback(s);
				 PreparedStatement pstmt5=con.prepareStatement
				("select * from account"+" where acc_num = ? ");
				 pstmt5.setInt(1, bacc_num);

			     ResultSet res2=pstmt5.executeQuery();
			      res2.next();
				 System.out.println("Existing balance is:"+" "+res2.getInt(4));
				                                                                      
			}
			con.commit(); 
			 
			 
	}
		catch(Exception e){
	    e.printStackTrace();
			
		}

	}

}
