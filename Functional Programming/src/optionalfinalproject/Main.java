package optionalfinalproject;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	private Set<String> schoolNameSet = new HashSet<>(4000);
	private Set<String> chosenOnes;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void init() {
		fillSchoolNameSet();
		
	}
	
	public void fillSchoolNameSet(){
		schoolNameSet.add("Suffolk County Community College");
		schoolNameSet.add("Nassau Community College");
		schoolNameSet.add("Stony Brook University");
		schoolNameSet.add("Suffolk University");
	}
	
	
	public void findChosenOnes(String s) {
		/** Stream goes through every variable in a collection **/
		/** Filter takes a predicate in which u can use to restrict result **/
		/** Collect takes the Stream and brings it back into a set **/
		chosenOnes = schoolNameSet
						.stream()
						.filter(p -> p.toLowerCase().contains(s) && s.length() >3 )
						.collect(Collectors.toSet());
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		TextField nameField = new TextField();
		nameField.setPrefSize(300,40);
		
		
		TextArea outputArea = new TextArea();
		outputArea.setPrefSize(300,300);
		
		nameField.textProperty().addListener((observable, oldValue, newValue) ->{
			findChosenOnes(newValue.toLowerCase());
			outputArea.clear();
			chosenOnes.stream().forEach(school -> outputArea.appendText(school + "\n"));
	
			
		});
		
		
		VBox root = new VBox(30);
		root.setPadding(new Insets(10,10,10,10));
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nameField, outputArea);
		
		Scene scene = new Scene(root, 300, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
