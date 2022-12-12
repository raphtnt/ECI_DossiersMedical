package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

	private String user;
	private String password;
	private String address;
	private String port;
	private Connection connection;
	
	
	/**
	 * 
	 * @param user
	 * @param password
	 * @param address
	 * @param port
	 */
	public Connexion(String user, String password, String address, String port) {
		this.user = user;
		this.password = password;
		this.address = address;
		this.port = port;
		this.connection = null;
		test();
	}
	
	public void test() {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@" + address + ":" + port + ":xe", user, password);
			connection.close();
			System.out.println("Connection a la DB réussite");
			
		} catch (SQLException e) {
			System.out.println("Erreur SQLException");
//			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Erreur class driver not found");
			//e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@" + address + ":" + port + ":xe", user, password);
		} catch (SQLException e) {
			System.out.println("Erreur a la récuperation de la connexion !");
			//e.printStackTrace();
		}
		return connection;
	}

}
