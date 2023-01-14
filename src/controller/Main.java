package controller;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Patient;

public class Main extends Application{
	
	public static ArrayList<Patient> patient = new ArrayList<>();
	
	/**
	 * 
	 * @param args Method de lancement
	 */
	public static void main(String[] args) {
		//Request request = new Request();
		//request.test();
		patient.add(new Patient("Jean", "Jack", "0000000", "sdsd@gmail.com", "rue", "ville", "codepostal", "numerop", "numeroimp", "registrenationnal0", false, "mdp", 0, 1));
		patient.add(new Patient("nlsfd", "k,ldslffds", "0000000", "sdsd@gmail.com", "rue", "ville", "codepostal", "numerop", "numeroimp", "registrenationnal1", false, "mdp", 0, 1));
		patient.add(new Patient("Nom", "Prénom", "0000000", "sdsd@gmail.com", "rue", "ville", "codepostal", "numerop", "numeroimp", "registrenationnal2", false, "mdp", 0, 1));
		launch(args);
		
	/*	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@172.17.0.3:1521:xe","system","oracle");
			
			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM emp");

			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
		
	}

	public void start(Stage primaryStage) {
		try {
			System.out.println(getClass().getResource("test.fxml").getPath());
			VBox root = (VBox) FXMLLoader.load(getClass().getResource("test.fxml"));
			Scene scene = new Scene(root, 950, 600);

			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Hopital");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
