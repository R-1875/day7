import java.sql.*;

public class MetaDataDeno {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/slk","root","root");

		
		DatabaseMetaData dbmd=con.getMetaData();
		
		
		System.out.println("name"+dbmd.getDriverName());
		
		System.out.println("name"+dbmd.getDriverVersion());
		
		
	}

}
