package StudentDao;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDao
{
   public static void main(String[] args) throws ClassNotFoundException, SQLException
   {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter opration you want to perform on student data");
	   System.out.println("1. Add Student Record \n2. Update Student Record \n3. Delete Student Record");
	   
	   int ch = s.nextInt();
	   
	   switch(ch)
	   {
	      case 1:
	    	  	AddStudent.AddStudent();
	    	  	break;
	      case 2:
	    	    UpdateStudent.UpdateStudent();
	    	    break;
	      case 3:
	    	    DeleteStudent.DeleteStudent();
	    	  break;
	      default:
	    	  break;
	   }
   }
}
