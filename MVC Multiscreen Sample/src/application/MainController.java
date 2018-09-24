package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private TextField inputField;
	
	@FXML
	private Button btnGetData;
	
	public void getData(ActionEvent e) {
		System.out.println("Button Clicked!");
	}
	
	public void changeView(ActionEvent e) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("secondaryFXML.fxml"));
		Scene scene = new Scene(root);
		Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
	}
}
