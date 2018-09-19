package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Label myLabel;
	@FXML
	private Button clickme;
	
	public MainController() {
	}
	
	@FXML
	public void getRandomNumber(ActionEvent e) {
		Random rand = new Random();
		int num = rand.nextInt(100000) + 1;
		System.out.println(num);
		myLabel.setText(String.valueOf(num));
	}
	
}
