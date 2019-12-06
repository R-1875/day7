

import java.sql.*;


public class RsMetaDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");
		

		PreparedStatement pst= con.prepareStatement("select * from allemp");
		
		
		ResultSet res= pst.executeQuery();
		
		
		ResultSetMetaData rs=res.getMetaData();
		
		
		System.out.println(rs.getColumnCount());
		
		System.out.println(rs.getTableName(3));
		
	//System.out.println(rs.)
		
		
	
		
		

	}

}
