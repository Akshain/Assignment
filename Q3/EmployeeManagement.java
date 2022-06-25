package com.prodapt.assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt", "root", "admin");
			Statement stmt = con.createStatement();
			
			//Insertion is done here
			System.out.println("\nTable of employees:");
			String sql = "INSERT INTO Employee VALUES (5,'Swetha','Testing',80000)";
			stmt.executeUpdate(sql);
			
			//Deletion is done here
			String sql1 ="Delete FROM Employee WHERE id =4";
			//sql ="Delete FROM Employee WHERE id = 4";
			stmt.executeUpdate(sql1);
			
			//Updation is done here	
			String sql2 = "Update Employee set salary = 85000 where Dept = 'SW'";
			stmt.executeUpdate(sql2);
		
			ResultSet rs = stmt.executeQuery("select * from Employee");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("hi");
		}

	}

}
