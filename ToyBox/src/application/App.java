package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// object-tree
			
			FXMLLoader loader = new FXMLLoader();
			Parent root = loader.load();	
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void init() throws Exception {
	
		super.init();
		
		// Create DB connection
		DatabaseContext.setupDatabase();
		
	}
	
	@Override
	public void stop() throws Exception {
	 
		// Close DB connection
		DatabaseContext.bringDownDatabase();
		
		super.stop();
	}

}
