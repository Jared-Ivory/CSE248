package p2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application{
	private TextField nameField;
	private Button okBtn;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		nameField = new TextField();
		okBtn = new Button("OK");
		
		VBox root = new VBox();
		root.setPadding(new Insets(10,10,10,10));
		root.getChildren().addAll(nameField, okBtn);
		root.setAlignment(Pos.TOP_CENTER);
		
		Scene scene = new Scene(root, 200, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		nameField.setOnKeyPressed(e -> {
			if(e.getCode().equals(KeyCode.ENTER)) {
				print();
			}
		});
		
		// Event handler, a.k.a callback method.
		okBtn.setOnAction(e ->{
			print();
		});
		
		System.out.println("End of start." + "\n---" + Thread.currentThread().getName() + "---");
	}
	
	public void print() {
		System.out.println(nameField.getText());
		nameField.clear();
		System.out.println("---" + Thread.currentThread().getName() + "---");
	}
	
	

}
