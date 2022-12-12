package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Request {

	private boolean baudouin = false;
	
	Connexion conn = baudouin ? new Connexion("system", "oracle", "127.0.0.1", "1521") : new Connexion("system", "oracle", "172.17.0.3", "1521");
	Connection c = conn.getConnection();
	
	public void test() {
		Statement stmt;
		try {
			
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM emp");

			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
			c.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
