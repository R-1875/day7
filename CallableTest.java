package pp1;

import java.sql.*;

public class CallableTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		Connection con=
				DriverManager.getConnection
				("jdbc:mysql://localhost:3306/slk","root","root");
		
		
	CallableStatement cst=
		 
			con.
			prepareCall(" {call INSERTRS(?,?)   } ");
	
	
	cst.setInt(1, 1001);
	cst.setString(2, "cinthol");
	
	
	cst.execute();
	
	cst.close();
	con.close();
		
	}

}
