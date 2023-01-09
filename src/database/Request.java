package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import oracle.jdbc.OracleTypes;


public class Request {

	private boolean baudouin = false;
	
	Connexion connn = baudouin ? new Connexion("system", "oracle", "127.0.0.1", "1521") : new Connexion("HOPITAL", "HOPITAL", "172.17.0.3", "1521");
	Connection c = connn.getConnection();
	
	public void test() {

		
        String runSP = "{ call test(?) }";

        try (Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@172.17.0.3:1521:xe", "HOPITAL", "HOPITAL");
             Statement statement = conn.createStatement();
             CallableStatement cs = conn.prepareCall(runSP);
        ) {

            //conn.setAutoCommit(false);

            // create function


            // alternative
            //cs.registerOutParameter(2, Types.REF_CURSOR);
            cs.registerOutParameter(1, OracleTypes.CURSOR);

            // run SP
            cs.execute();

            // get refcursor and convert it to ResultSet
            ResultSet resultSet = (ResultSet) cs.getObject(1);
            while (resultSet.next()) {

                int id = resultSet.getInt("ID_PATIENT");
                System.out.println(id);

            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

	    
		
	}

}
