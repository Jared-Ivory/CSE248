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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import models.StringBag;

public class SecondaryController implements Initializable {
	private StringBag theBag;
	
	@FXML
	private TextArea txtArea;
	
	public void showData(ActionEvent e) {
		int nElems = theBag.getNElems();
		for(int i = 0; i <= theBag.getNElems(); i++) {
			txtArea.appendText(theBag.pop() + "\n");
		}
	}
	
	public void changeView(ActionEvent e) throws IOException{
		Parent root = FXMLLoader.load(getClass().getResource("mainFXML.fxml"));
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
