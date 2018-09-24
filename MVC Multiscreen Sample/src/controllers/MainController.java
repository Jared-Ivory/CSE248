package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.StringBag;

public class MainController implements Initializable{
	private StringBag theBag;
	
	@FXML
	private TextField inputField;
	
	@FXML
	private Button btnGetData;
	
	public void getData(ActionEvent e) {
		theBag.insert(inputField.getText());
		inputField.clear();
	}
	
	public void changeView(ActionEvent e) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("secondaryFXML.fxml"));
		Scene scene = new Scene(root);
		Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		theBag = Main.getBag();
	}
}
