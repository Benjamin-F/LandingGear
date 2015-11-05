package Application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainView extends Application {


	@Override
	public void start(Stage primaryStage) {
		
        primaryStage.setTitle("Landing Gear System");
        
		try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("View.fxml"));
            
            loader.setController(new ViewController());
            
            AnchorPane rootLayout = (AnchorPane) loader.load();
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}


	public static void main(String[] args) {
		launch(args);
	}
}
