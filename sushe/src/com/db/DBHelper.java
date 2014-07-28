package com.db;

import java.sql.*;

public class DBHelper {	
	private String dbUrl="jdbc:mysql://localhost:3306/sushe";
	private String dbUser="root";
	private String dbPassword="sa";
	private String jdbcName="com.mysql.jdbc.Driver";
	
	
	//�������ݿ�
	public Connection getConn(){
		Connection conn = null;
		
		try{
			Class.forName(jdbcName);
		}
		catch(Exception e){
//			System.err.println(e.printStackTrace());
			System.err.println("test");
			System.err.println(e);
		}
		try{
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPassword);
		}
		catch(SQLException ex){
//			System.err.println(ex);
			ex.printStackTrace();
		}
		return conn;		
	}
	
//    ����
	public static void main(String[] args)
	{ 
		System.out.println(new DBHelper().getConn());
 
		
	}
	
}
