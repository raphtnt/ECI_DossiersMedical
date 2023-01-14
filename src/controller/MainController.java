package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

public class MainController {

    @FXML
    private ListView<String> listtest;
    
    @FXML
    private Text prenom;

    private ObservableList<String> items = FXCollections.observableArrayList();

    public void initialize() {
    	listtest.setItems(items);
    	Main.patient.forEach(t -> {
    		System.out.println(t.getPrenomP() + " - " + t.getNomP() + " - " + t.getRegistreNational());
            items.add(t.getPrenomP() + " - " + t.getNomP() + " - " + t.getRegistreNational());
    	});
    	
    	listtest.setOnMouseClicked(y -> {
            if(y.getTarget() instanceof Text) {
                Text clicked = (Text) y.getTarget();
                prenom.setText(clicked.getText());
            }
    	});
    }
	
}
