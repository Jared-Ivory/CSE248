package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	private static StringBag theBag;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			theBag = new StringBag(50);
			
			Parent root = FXMLLoader.load(getClass().getResource("mainFXML.fxml"));;
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static StringBag getBag() {
		return theBag;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
