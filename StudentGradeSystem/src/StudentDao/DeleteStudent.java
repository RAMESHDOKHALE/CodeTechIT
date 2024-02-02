package StudentDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudent 
{
	public static void DeleteStudent() throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student roll_number to delete from records.");
		int roll_number = sc.nextInt();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/StudentGradeSystem", "root","ramesh");
		PreparedStatement stmt = con.prepareStatement("delete from Student_Data where roll_number=?");
		stmt.setInt(1, roll_number);
		int result = stmt.executeUpdate();
		if(result>0)
		{
			System.out.println("Deleted record succesfully!");
		}
	}
}
