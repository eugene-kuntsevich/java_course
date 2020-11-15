package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleDb
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/planets?useUnicode=true&serverTimezone=UTC";
			String login = "newuser";
			String password = "root";
			Connection con = DriverManager.getConnection(url, login, password);
			try
			{
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM PLANET");
				while (rs.next())
				{
					String str = rs.getString("id") + " : " + rs.getString("planet_name");
					System.out.println(str);
				}
				rs.close();
				stmt.close();
			}
			finally
			{
				con.close();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

