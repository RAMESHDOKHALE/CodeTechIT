package StudentDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudent 
{
	public static void UpdateStudent() throws SQLException, ClassNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student roll_number to update records.");
		int roll_number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name");
	    String Name = sc.nextLine();
	    
  	    System.out.println("Enter subject marks one by one \nEnglish \nMaths \nChemistry "
		   		+ "\nPhysics \nBiology ");
	    double English = sc.nextDouble();
     	double Maths = sc.nextDouble();
	    double Chemistry = sc.nextDouble();
 	    double Physics = sc.nextDouble();
		double Biology = sc.nextDouble();
		double Percentage = English + Maths + Chemistry + Physics + Biology/5;
		   
		String Grade;
		if(Percentage>=70)
		{
		   System.out.println("Grade : A");
		   Grade = "A";
		}		   
		else if(Percentage>=60 && Percentage<70)
	    {
		   System.out.println("Grade : B");
		   Grade = "B";
    	}
	    else if(Percentage>=50 && Percentage<60)
		{
		   System.out.println("Grade : C");
		   Grade="C";
		}
		else if(Percentage>35 && Percentage<50)
		{
		   System.out.println("Grade : D");
    	   Grade = "D";
		}
		else
		{
		    System.out.println("Grade : F");
			Grade = "F";
		}   
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/StudentGradeSystem", "root","ramesh");		
		PreparedStatement stmt = con.prepareStatement("update Student_Data set Name=?, English=?, Maths=?,"
				+ " Chemistry=?, Physics=?, Biology=?, Grade=?, Percentage=? where roll_number=?");
		stmt.setString(1, Name);
		stmt.setDouble(2, English);
	    stmt.setDouble(3, Maths);
	    stmt.setDouble(4, Chemistry);
     	stmt.setDouble(5, Physics);
		stmt.setDouble(6, Biology);
		stmt.setString(7, Grade);  
		stmt.setDouble(8, Percentage);
		stmt.setInt(9, roll_number);
		int result = stmt.executeUpdate();
		if(result>0)
		{
		   System.out.println("updated data succefully!");
	    }	   	
	}
}
