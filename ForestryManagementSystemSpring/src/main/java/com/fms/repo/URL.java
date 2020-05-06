package com.fms.repo;

public class URL {
	
	
	public static String getURL()
	{
		String url = "jdbc:mysql://localhost:3307/forestry_management_system_db?user=root&password=root";
		return url;
	}
	public  static String getDriver()
	{
		String url = "com.mysql.cj.jdbc.Driver";
		return url;
	}

	
	public  static String getProperty()
	{
		String url = "C:/Users/prashanth g patil/Desktop/cap_training/prop.properties";
		return url;
	}

}
