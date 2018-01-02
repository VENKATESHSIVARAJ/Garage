package com.sathimotors.project;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class DataBase {

	private Connection con;
	private PreparedStatement stmt;

	public DataBase() {
		try {
			con = null;
			stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void connection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "root");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void close() {
		if (stmt != null) {
			try {
				stmt.close();
				stmt = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
				con = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public LinkedList getData(String tableName) {
		String query = "select * from " + tableName;
		ResultSet rs = null;
		LinkedList list = null;

		connection();

		try {
			stmt = con.prepareStatement(query);
			list = getResult(tableName, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close();

		return list;

	}

	public LinkedList getData(String tableName, String col, String value) {
		String query = "select * from" + tableName + "where" + col + "= ?";
		LinkedList list = null;

		connection();

		try {

			stmt = con.prepareStatement(query);
			stmt.setString(1, value);
			list = getResult(tableName, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close();

		return list;

	}

	public LinkedList getResult(String tableName, PreparedStatement stmt) {
		LinkedList list = null;
		ResultSet rs;
		try {
			rs = stmt.executeQuery();
			if (tableName.equalsIgnoreCase("CarDetails")) {

				while (rs.next()) {
					list.add(new CarDetails(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
				}
			} else if (tableName.equalsIgnoreCase("ComplaintType")) {
				while (rs.next()) {
					list.add(new ComplaintType(rs.getString(1), rs.getString(2)));
				}
			} else if (tableName.equalsIgnoreCase("CustomerDetails")) {
				while (rs.next()) {
					list.add(new CustomerDetails(rs.getString(1), rs.getString(2), rs.getInt(3)));
				}
			} else if (tableName.equalsIgnoreCase("EveryComplaints")) {
				while (rs.next()) {
					list.add(new EveryComplaints(rs.getString(1), rs.getString(2), rs.getBoolean(3), rs.getInt(4),
							rs.getDate(5), rs.getDate(6)));
				}
			} else if (tableName.equalsIgnoreCase("InitialComplaint")) {
				while (rs.next()) {
					list.add(new InitialComplaint(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
				}
			} else {

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;

	}

	public void insert(String tableName, LinkedList<String> list) {

		PreparedStatement stmt;
		String query;
		connection();
		try {
			if (tableName.equalsIgnoreCase("CarDetails")) {
				query = "insert into " + tableName + " values(?,?,?,?)";
				stmt = con.prepareStatement(query);
				stmt.setString(1, list.get(0));
				stmt.setString(2, list.get(1));
				stmt.setString(3, list.get(2));
				stmt.setInt(4, Integer.parseInt(list.get(3)));
				stmt.executeUpdate();

			} else if (tableName.equalsIgnoreCase("ComplaintType")) {
				query = "insert into " + tableName + " values(?,?)";
				stmt = con.prepareStatement(query);
				stmt.setString(1, list.get(0));
				stmt.setString(2, list.get(1));
				stmt.executeUpdate();
			} else if (tableName.equalsIgnoreCase("CustomerDetails")) {
				query = "insert into " + tableName + " values(?,?,?)";
				stmt = con.prepareStatement(query);
				stmt.setString(1, list.get(0));
				stmt.setString(2, list.get(1));
				stmt.setInt(3, Integer.parseInt(list.get(2)));
				stmt.executeUpdate();
			} else if (tableName.equalsIgnoreCase("EveryComplaints")) {
				query = "insert into " + tableName + " values(?,?,?,?,?,?)";
				stmt = con.prepareStatement(query);
				stmt.setString(1, list.get(0));
				stmt.setString(2, list.get(1));
				stmt.setBoolean(3, Boolean.parseBoolean(list.get(2)));
				stmt.setInt(4, Integer.parseInt(list.get(3)));
				stmt.setDate(5, Date.valueOf(list.get(4)));
				stmt.setDate(6, Date.valueOf(list.get(5)));
				stmt.executeUpdate();
			} else if (tableName.equalsIgnoreCase("InitialComplaint")) {
				query = "insert into " + tableName + " values(?,?,?,?)";
				stmt = con.prepareStatement(query);
				stmt.setString(1, list.get(0));
				stmt.setString(2, list.get(1));
				stmt.setString(3, list.get(2));
				stmt.setInt(4, Integer.parseInt(list.get(3)));
				stmt.executeUpdate();
			} else {

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

	}
}
