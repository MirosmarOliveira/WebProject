package com.legolas.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private static final String URL = "jdbc:mysql://localhost:3306/legolas?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	public static Connection connect() throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

		return connection;
	}

	public static void main(String[] args) {
		try {
			Connection connection = Database.connect();
			System.out.println("Connection successfully completed!");
		} catch (SQLException e) {
			System.out.println("Connection was not successfully completed!");
			e.printStackTrace();
		}
	}
}
