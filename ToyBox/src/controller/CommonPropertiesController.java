package controller;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Toy;
import model.Toybox;
import model.Kid;
import service.ToyService;
import service.ToyboxService;
import service.KidService;
import application.Constants;

public class CommonPropertiesController {

	static KidService kidService = new KidService();

	static ToyService toyService = new ToyService();
	
	static ToyboxService toyboxService = new ToyboxService();

	static ObservableList<Toy> toyList = FXCollections.observableArrayList();

	static ObservableList<Kid> kidList = FXCollections.observableArrayList();
	
	static ObservableList<Toybox> toyboxList = FXCollections.observableArrayList();

	static ObjectProperty<Toy> selectedToy = new SimpleObjectProperty<Toy>();
	
	static ObjectProperty<Kid> selectedKid = new SimpleObjectProperty<Kid>();
	
	static ObjectProperty <Toybox> selectedToybox = new SimpleObjectProperty<Toybox>();
	
	public void goToScene(String scene){
		try { // Hier wird die zweite Fenster geöffneta
			FXMLLoader loadScene = new FXMLLoader();
			loadScene.setLocation(getClass().getResource(scene));

			Parent root = (Parent) loadScene.load();

			Scene Scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(Scene);

			stage.show();
			stage.setOnHidden(null);

		} catch (Exception e) {
			System.err.println("Can not load");
			e.printStackTrace();
		}
		}
}
