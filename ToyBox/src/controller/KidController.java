package controller;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class KidController extends CommonPropertiesController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private Button addButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button startButton;

    @FXML
    private ListView<?> listView;

    @FXML
    void handleAddAction(ActionEvent event) {

    }

    @FXML
    void handleClearAction(ActionEvent event) {

    }

    @FXML
    void handleDeleteAction(ActionEvent event) {

    }

    @FXML
    void handleStartPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) startButton.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	goToScene("/application/Start.fxml");
    	 primaryStage.close();
    }

    @FXML
    void handleUpdateAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert firstNameTextField != null : "fx:id=\"firstNameTextField\" was not injected: check your FXML file 'Kid.fxml'.";
        assert lastNameTextField != null : "fx:id=\"lastNameTextField\" was not injected: check your FXML file 'Kid.fxml'.";
        assert addButton != null : "fx:id=\"addButton\" was not injected: check your FXML file 'Kid.fxml'.";
        assert updateButton != null : "fx:id=\"updateButton\" was not injected: check your FXML file 'Kid.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'Kid.fxml'.";
        assert clearButton != null : "fx:id=\"clearButton\" was not injected: check your FXML file 'Kid.fxml'.";
        assert startButton != null : "fx:id=\"startButton\" was not injected: check your FXML file 'Kid.fxml'.";
        assert listView != null : "fx:id=\"listView\" was not injected: check your FXML file 'Kid.fxml'.";

    }
}
