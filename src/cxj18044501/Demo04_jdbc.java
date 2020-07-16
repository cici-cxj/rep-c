package cxj18044501;

import java.sql.*;


public class Demo04_jdbc {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://swing","root","root");
		Statement createStatement = connection.createStatement();
		String sql = "select * from t_user";
		ResultSet rs=createStatement.executeQuery(sql);
		while(rs.next()){
			String name = rs.getString("name");
			System.out.println(name);
		}
		createStatement.close();
		connection.close();
		
		
	}
	

}
