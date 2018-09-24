package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class SecondaryController {
	private StringBag theBag;
	
	@FXML
	private TextArea txtArea;
	
	public void showData(ActionEvent e) {
		theBag = Main.getBag();
		int nElems = theBag.getNElems();
		for(int i = 0; i < nElems; i++) {
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
}
