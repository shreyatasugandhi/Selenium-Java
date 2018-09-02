package Selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CompareDBLists {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/gts_db01", "gts_test01", "11@one@11");
		
		System.out.println("Connected to MySQL DB");
		
		Statement smt = con.createStatement();
		
		ResultSet rs = smt.executeQuery("select * from city");
		
		List<String> actuallist = new ArrayList<String>();
		while(rs.next())
		{
			String cityname = rs.getString("Name");
//			System.out.println("City name is " + cityname);
			actuallist.add(cityname);
		}
		
		List<String> expectedlist = new ArrayList<String>();		
		System.out.println(actuallist);
		System.out.println(expectedlist.equals(actuallist));
	}

}
