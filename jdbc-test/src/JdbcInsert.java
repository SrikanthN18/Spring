import java.sql.*;

public class JdbcInsert {
	
	public static void main(String[] args) throws SQLException {
		
		Connection myCon = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user = "student";
		String pass = "student";
		
		// connecting mySql 
		myCon = DriverManager.getConnection(dbUrl, user, pass);
		myStmt = myCon.createStatement();
		
		System.out.println("Connection to database is successfull");
		
		// creating a statement
		
		myStmt = myCon.createStatement();
		
		System.out.println("Inserting the row into the table");
		
		int rowsAffected = myStmt.executeUpdate("Insert into employees(last_name, first_name, email, department, salary)"
				+ "values('N', 'Srikanth', 'srikanth@gmail.com', 'CS', '100000')");
		
		System.out.println("The insertion is succesful ");
		
		myRs = myStmt.executeQuery("select * from employees");
		System.out.println("The number of rows affected in the MySql are : " + rowsAffected);
		while(myRs.next()) {
			System.out.println(myRs.getString("first_name") + ",   " + myRs.getString("email"));
		}
		
	}
}
