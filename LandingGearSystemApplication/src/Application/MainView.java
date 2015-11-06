package Application;

import java.io.IOException;

import Application.GearSystem.BoardComputer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainView extends Application {

	private ViewController viewController = null;
	private BoardComputer boardComputer = null;

	@Override
	public void start(Stage primaryStage) {
		
		boardComputer = new BoardComputer();
		viewController = new ViewController(boardComputer);
		
        primaryStage.setTitle("Landing Gear System");
        primaryStage.setResizable(false);
        
		try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("View.fxml"));
            
            loader.setController(viewController);
            
            AnchorPane rootLayout = (AnchorPane) loader.load();
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		boardComputer.setViewController(viewController);
	}


	public static void main(String[] args) {
		launch(args);
	}
}
