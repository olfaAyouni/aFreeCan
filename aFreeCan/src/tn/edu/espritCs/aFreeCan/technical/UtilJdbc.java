package tn.edu.espritCs.aFreeCan.technical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilJdbc {
	private Connection connection;
	private String url = "jdbc:mysql://localhost:3306/afreecandb";
	private String user = "root";
	private String password = "";

	public Connection hetliConnetionMrigla() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("sa7a lina driver charg�");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("oumourna wadha");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}


}
