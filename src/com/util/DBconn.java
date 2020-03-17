package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * connect database(mysql-connector-8.0.16)
 */
public class DBconn {
	static String url = "jdbc:mysql://localhost:3306/mandarin?useSSL=false&serverTimezone=UTC";/*modification*/
	static String username = "root"; /*modification*/
	static String password = "1234"; /*modification*/
	
	static Connection  conn = null;
	static ResultSet rs = null;
	static PreparedStatement ps =null;
	
	public static void init(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			System.out.println("init sql error");
			e.printStackTrace();
		}
	}
	
	public static int addUpdDel(String sql){
		int i = 0;
		try {
			PreparedStatement ps =  (PreparedStatement)conn.prepareStatement(sql);
			i =  ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("sql addup error");
			e.printStackTrace();
		}
		return i;
	}
	
	public static ResultSet selectSql(String sql){
		try {
			PreparedStatement ps =  (PreparedStatement)conn.prepareStatement(sql);
			rs =  ps.executeQuery();
		} catch (SQLException e) {
			System.out.println("sql select error");
			e.printStackTrace();
		}
		return rs;
	}
	
	public static void closeConn(){
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("sql close error");
			e.printStackTrace();
		}
	}
}
