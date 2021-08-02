package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ToyController extends CommonPropertiesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button startButton;

    @FXML
    private TableView<?> toyTable;

    @FXML
    private TableColumn<?, ?> nameTableColumn;

    @FXML
    private TableColumn<?, ?> KidTableColumn;

    @FXML
    private TextField nameText;

    @FXML
    private TextField urlText;

    @FXML
    private Button selectButton;

    @FXML
    private ComboBox<?> kidComboBox;

    @FXML
    private Button newButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button updateButton;

    @FXML
    private Button deleteButton;

    @FXML
    private ImageView photoImageView;

    @FXML
    void handleClearToyAction(ActionEvent event) {

    }

    @FXML
    void handleDeleteToyAction(ActionEvent event) {

    }

    @FXML
    void handleSelectFileAction(ActionEvent event) {

    }

    @FXML
    void handleStartPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) startButton.getScene().getWindow();
    	
    	goToScene("/application/Start.fxml");
    	
    	 primaryStage.close();
    }

    @FXML
    void handleToyAction(ActionEvent event) {

    }

    @FXML
    void handleUpdateToyAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert startButton != null : "fx:id=\"startButton\" was not injected: check your FXML file 'Toy.fxml'.";
        assert toyTable != null : "fx:id=\"toyTable\" was not injected: check your FXML file 'Toy.fxml'.";
        assert nameTableColumn != null : "fx:id=\"nameTableColumn\" was not injected: check your FXML file 'Toy.fxml'.";
        assert KidTableColumn != null : "fx:id=\"KidTableColumn\" was not injected: check your FXML file 'Toy.fxml'.";
        assert nameText != null : "fx:id=\"nameText\" was not injected: check your FXML file 'Toy.fxml'.";
        assert urlText != null : "fx:id=\"urlText\" was not injected: check your FXML file 'Toy.fxml'.";
        assert selectButton != null : "fx:id=\"selectButton\" was not injected: check your FXML file 'Toy.fxml'.";
        assert kidComboBox != null : "fx:id=\"kidComboBox\" was not injected: check your FXML file 'Toy.fxml'.";
        assert newButton != null : "fx:id=\"newButton\" was not injected: check your FXML file 'Toy.fxml'.";
        assert clearButton != null : "fx:id=\"clearButton\" was not injected: check your FXML file 'Toy.fxml'.";
        assert updateButton != null : "fx:id=\"updateButton\" was not injected: check your FXML file 'Toy.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'Toy.fxml'.";
        assert photoImageView != null : "fx:id=\"photoImageView\" was not injected: check your FXML file 'Toy.fxml'.";

    }
}
