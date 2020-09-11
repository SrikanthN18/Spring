import java.sql.*;

public class JdbcUpdate {
	public static void main(String[] args) throws SQLException {
		Connection myCon = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String user = "student";
		String pass = "student";
		
		myCon = DriverManager.getConnection(dbUrl, user, pass);
		System.out.println("The connection is successful");
		
		myStmt = myCon.createStatement();
		System.out.println("The creation of statement is succesful"); 
		
		//before update
		System.out.println("Before update");
		displayEmployee(myCon, "Srikanth");
		
		int rowsUpdated = myStmt.executeUpdate("update employees set email = 'sri@gmail.com'"
				+ "where first_name = 'srikanth'");
		
	}

	private static void displayEmployee(Connection myCon, String string) {
		
		
	}
}
