package edu.online.applications;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JDBC {
	public static void main(String args[]) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, FileNotFoundException{
	String connectionUrl="jdbc:mysql://localhost:3306/onlineide";
	Connection connection=null;
	DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
	connection=DriverManager.getConnection(connectionUrl,"root",null);
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	String sql="select *from applications";
	PreparedStatement statement=connection.prepareStatement(sql);
	ResultSet results=statement.executeQuery();
	while(results.next()){
		int id=results.getInt("id");
		String name=results.getString("name").trim();
		double price=results.getDouble("price");
		//Application application=new Application(id,name,price);
		System.out.println(id+name+price);
		
	}
	
	connection.close();
	ArrayList<String> list=new ArrayList<>();
	Scanner sc=new Scanner(new File("D://b.txt"));
	HashMap<String,ArrayList<String>> hs=new HashMap<String,ArrayList<String>>();
	while(sc.hasNextLine()){
		String word = sc.nextLine();
		list.add(word);
		//list=hs.get(word);
		hs.put(word, list);
		
	}
	System.out.println(hs);
	}
	
}
