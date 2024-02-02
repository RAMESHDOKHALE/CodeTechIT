package StudentDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddStudent 
{
	 
	 public static void AddStudent() throws ClassNotFoundException, SQLException
	   {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Student datails !");
		   
		   System.out.println("Enter Student Name");
		   String Name = sc.nextLine();
		   
		   System.out.println("Enter student roll number");
		   int roll_number = sc.nextInt();
		   
		   System.out.println("Enter subject marks one by one \nEnglish \nMaths \nChemistry "
		   		+ "\nPhysics \nBiology ");
		   double English = sc.nextDouble();
		   double Maths = sc.nextDouble();
		   double Chemistry = sc.nextDouble();
		   double Physics = sc.nextDouble();
		   double Biology = sc.nextDouble();
		   
		   
		   double total_marks = English + Maths + Chemistry + Physics + Biology;
		   if(English > 35 && Maths > 35 && Chemistry > 35 && Physics > 35 && Biology > 35)
		   {  
			   System.out.println("Total marks out of 500 is "+ total_marks);
			   System.out.println("Calculating your Grade and Percentage....");
			   double Percentage = total_marks/5;
			   System.out.println("Percentage :" + Percentage);
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
			   
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/StudentGradeSystem","root","ramesh");
			   
			   PreparedStatement stmt = con.prepareStatement("insert into Student_Data(roll_number, Name, "
			   		+ "English, Maths, Chemistry, Physics, Biology, Grade, Percentage) values(?,?,?,?,?,?,?,?,?)");
			   stmt.setInt(1, roll_number);
			   stmt.setString(2, Name);
			   stmt.setDouble(3, English);
			   stmt.setDouble(4, Maths);
			   stmt.setDouble(5, Chemistry);
			   stmt.setDouble(6, Physics);
			   stmt.setDouble(7, Biology);
			   stmt.setString(8, Grade);  
			   stmt.setDouble(9, Percentage);
			   int result = stmt.executeUpdate();
			   if(result>0)
			   {
				   System.out.println("Added data succefully!");
			   }
		   }
		   else
		   {
			   System.out.println("You are failed !");
		   }
	   }

}
