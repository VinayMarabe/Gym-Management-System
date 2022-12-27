package com.GYM;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class DataBase {
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "System";
	private static String pass = "root";
	private static String driver = "oracle.jdbc.driver.OracleDriver";

	
	public String CName = null;
	public String CPhone = null;
	public String CAge = null;
	public String CAddress = null;
	public String CGen= null;
	public String MName = null;
	public String MPhone = null;
	public String MAge = null;
	public String MAmount = null;
	public String MTiming	= null;
	public String MCoatch= null;
	public String MGen	= null;
	public String Pperiod = null;
	public String PMamber = null;
	public String PAmount = null;
	
	
	public int insertIntoDB(ArrayList e) {
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a = 0;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user,pass);

			stmt = con.createStatement();

			sql = "INSERT into member VALUES(id_m1.nextval ,?,?,?,?,?,?,?)";
			stm = con.prepareStatement(sql);
			stm.setString(1, (String) e.get(0));
			stm.setString(2, (String) e.get(1));
			stm.setString(3, (String) e.get(2));
			stm.setString(4, (String) e.get(3));
			stm.setString(5, (String) e.get(4));
			stm.setString(6, (String) e.get(5));
			stm.setString(7, (String) e.get(6));
			a = stm.executeUpdate();
			String b;
				
		} catch (Exception e1) {
			System.out.print(e1);
		}
		return a;
	}	
	
	public int insertIntoDBC(ArrayList e) {
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a = 0;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user,pass);

			stmt = con.createStatement();

			sql = "INSERT into coach VALUES(id_c1.nextval ,?,?,?,?,?)";
			stm = con.prepareStatement(sql);
			stm.setString(1, (String) e.get(0));
			stm.setString(2, (String) e.get(1));
			stm.setString(3, (String) e.get(2));
			stm.setString(4, (String) e.get(3));
			stm.setString(5, (String) e.get(4));
			
			a = stm.executeUpdate();
			String b;
				
		} catch (Exception e1) {
			System.out.print(e1);
		}
		return a;
	}	
	public int insertIntoDBf(ArrayList e) {
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a = 0;
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user,pass);

			stmt = con.createStatement();

			sql = "INSERT into finance VALUES(id_f1.nextval ,?,?,?)";
			stm = con.prepareStatement(sql);
			stm.setString(1, (String) e.get(0));
			stm.setString(2, (String) e.get(1));
			stm.setString(3, (String) e.get(2));
			
			a = stm.executeUpdate();
			String b;
				
		} catch (Exception e1) {
			System.out.print(e1);
		}
		return a;
	}
	
	
	public int UpdateDetailsC(ArrayList e , String id)
	{
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int a=0;
		
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();

			String sql = "UPDATE coach SET Name = ? , PHONE = ? ,AGE = ? , ADDRESS = ?, GENDER = ?   where ID = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(6,id);
			stm.setString(1, (String) e.get(0));
			stm.setString(2,(String)e.get(1));
			stm.setString(3,(String)e.get(2));
			stm.setString(4,(String)e.get(3));
			stm.setString(5,(String)e.get(4));
			a  = stm.executeUpdate();
			
	}catch(Exception g) {}
		return a;
}
	
	
	public int UpdateDetailsM(ArrayList e , String id)
	{
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int a=0;
		
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);
			
			stmt = con.createStatement();
			
			String sql = "UPDATE member SET Name = ? , PHONE = ? ,AGE = ? , AMOUNT = ?,TIMING = ?,COACH = ?, GENDER = ?  where ID = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(8,id);
			stm.setString(1, (String) e.get(0));
			stm.setString(2,(String)e.get(1));
			stm.setString(3,(String)e.get(2));
			stm.setString(4,(String)e.get(3));
			stm.setString(5,(String)e.get(4));
			stm.setString(6,(String)e.get(5));
			stm.setString(7,(String)e.get(6));
			
			a  = stm.executeUpdate();
			
	}catch(Exception g) {}
		return a;
}

	



public int DeleteDetailsM( String id)
{
	PreparedStatement stm = null;
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	int a=0;
	int o=Integer.parseInt(id);
	try {

		Class.forName(driver);

		con = DriverManager.getConnection(url, user, pass);
		
		stmt = con.createStatement();
		
		String sql = "DELETE FROM member WHERE ID = ?";
		stm = con.prepareStatement(sql);
		stm.setInt(1,o);
		stm.executeUpdate();
		
}catch(Exception g) {
	//JOptionPane.toShow(g);
	System.out.print(g);
	
}
	return a;
}


public int DeleteDetailsC( String id)
{
	PreparedStatement stm = null;
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	int a=0;
	int o=Integer.parseInt(id);
	try {

		Class.forName(driver);

		con = DriverManager.getConnection(url, user, pass);
		
		stmt = con.createStatement();
		
		String sql = "DELETE FROM coach WHERE ID = ?";
		stm = con.prepareStatement(sql);
		stm.setInt(1,o);
		stm.executeUpdate();
		
}catch(Exception g) {
	//JOptionPane.toShow(g);
	System.out.print(g);
}
	System.out.println(a);
	return a;
	
}



public void updateCombo(JComboBox a) {
	// TODO Auto-generated method stub
	PreparedStatement stm = null;
	Connection con = null;
	Statement stmt = null;
	try {
		con = DriverManager.getConnection(url, user, pass);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		String sql="select * from member";
	stm = con.prepareStatement(sql);
	 ResultSet rs= stm.executeQuery();
	while(rs.next()) {
		a.addItem(rs.getString("name"));
	}
	}catch (Exception e ) {e.printStackTrace();}
}

public void updateText(JTextField a) {
	// TODO Auto-generated method stub
	PreparedStatement stm = null;
	Connection con = null;
	Statement stmt = null;
	try {
		con = DriverManager.getConnection(url, user, pass);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		String sql="select * from member";
	stm = con.prepareStatement(sql);
	 ResultSet rs= stm.executeQuery();
	while(rs.next()) {
		a.setText(rs.getString("amount"));
	}
	}catch (Exception e ) {e.printStackTrace();}
}
}
