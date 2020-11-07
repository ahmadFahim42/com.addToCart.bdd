package utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.opencsv.CSVWriter;

public class DataBaseUtility {
	
	
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String url = "jdbc:postgresql:/localhost:5432/dvdrental";
	private static String userName = "postgres";
	private static String password = "root";
	
	
	public static void setupConnention() {
    try {
		connection = DriverManager.getConnection(url, userName, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
}
	
	public static ResultSet runQuery(String query) {
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultSet;
		
		
	}
	public static void returnResult() {

		try {
			while (resultSet.next()) {
				CSVWriter csvWriter;
				// provide path for output data file
				String output = "./output/book.csv";
				File file = new File(output);

				// we need to use FileWriter class to write ResultSet data from DB to Csvfile
				FileWriter fileWriter = new FileWriter(file);
				csvWriter = new CSVWriter(fileWriter);
				csvWriter.writeAll(resultSet, true);
				csvWriter.close();
			}
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
	}			
			
	public static void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {

			} finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
	
	
