package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ToyboxController extends CommonPropertiesController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> descriptionToyboxTableColumn;

    @FXML
    private TableColumn<?, ?> KidTableColumn;

    @FXML
    private TextField toyboxDescriptionTextField;

    @FXML
    private Button clearButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button newButton;

    @FXML
    private ComboBox<?> kidComboBox;

    @FXML
    private Button startButton;

    @FXML
    void handleClearToyboxAction(ActionEvent event) {

    }

    @FXML
    void handleDeleteToyboxAction(ActionEvent event) {

    }

    @FXML
    void handleNewToyboxAction(ActionEvent event) {

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
    void handleUpdateToyboxButton(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert descriptionToyboxTableColumn != null : "fx:id=\"descriptionToyboxTableColumn\" was not injected: check your FXML file 'Toybox.fxml'.";
        assert KidTableColumn != null : "fx:id=\"KidTableColumn\" was not injected: check your FXML file 'Toybox.fxml'.";
        assert toyboxDescriptionTextField != null : "fx:id=\"toyboxDescriptionTextField\" was not injected: check your FXML file 'Toybox.fxml'.";
        assert clearButton != null : "fx:id=\"clearButton\" was not injected: check your FXML file 'Toybox.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'Toybox.fxml'.";
        assert updateButton != null : "fx:id=\"updateButton\" was not injected: check your FXML file 'Toybox.fxml'.";
        assert newButton != null : "fx:id=\"newButton\" was not injected: check your FXML file 'Toybox.fxml'.";
        assert kidComboBox != null : "fx:id=\"kidComboBox\" was not injected: check your FXML file 'Toybox.fxml'.";
        assert startButton != null : "fx:id=\"startButton\" was not injected: check your FXML file 'Toybox.fxml'.";

    }
}
