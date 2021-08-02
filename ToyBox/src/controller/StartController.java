package controller;

	import java.net.URL;
	import java.util.ResourceBundle;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.TextField;
import javafx.stage.Stage;


	public class StartController extends CommonPropertiesController{

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Button toybox;

	    @FXML
	    private Button kid;

	    @FXML
	    private TextField kidSearchTextField;

	    @FXML
	    private Button kidSearch;

	    @FXML
	    private TextField toySearchTextField;

	    @FXML
	    private Button toySearch;

	    @FXML
	    void handleKidPressed(ActionEvent event) {
	    	Stage primaryStage = (Stage) kid.getScene().getWindow();
	    	
	    	/*
	    	 *  
	    	 * 
	    	 */
	    	
	    	
	    	goToScene("/application/Kid.fxml");
	    	 primaryStage.close();
	    }

	    @FXML
	    void handleKidSearchPressed(ActionEvent event) {

	    }

	    @FXML
	    void handleToySearchPressed(ActionEvent event) {

	    }

	    @FXML
	    void handleToyboxPressed(ActionEvent event) {
Stage primaryStage = (Stage) kid.getScene().getWindow();
	    	
	    	/*
	    	 *  
	    	 * 
	    	 */
	    	
	    	
	    	goToScene("/application/Toybox.fxml");
	    	 primaryStage.close();
	    }

	    

	    @FXML
	    void initialize() {
	        assert toybox != null : "fx:id=\"toybox\" was not injected: check your FXML file 'Start.fxml'.";
	        assert kid != null : "fx:id=\"kid\" was not injected: check your FXML file 'Start.fxml'.";
	        assert kidSearchTextField != null : "fx:id=\"kidSearchTextField\" was not injected: check your FXML file 'Start.fxml'.";
	        assert kidSearch != null : "fx:id=\"kidSearch\" was not injected: check your FXML file 'Start.fxml'.";
	        assert toySearchTextField != null : "fx:id=\"toySearchTextField\" was not injected: check your FXML file 'Start.fxml'.";
	        assert toySearch != null : "fx:id=\"toySearch\" was not injected: check your FXML file 'Start.fxml'.";

	    }
	}
