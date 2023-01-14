package view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;

public class View {
	
	@FXML
	private ListView<String> listtest;
	
	
    public View()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("test.fxml"));
        fxmlLoader.setController(this);
        try
        {
            fxmlLoader.load();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

}
