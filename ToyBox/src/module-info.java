module ToyBox {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	requires java.desktop;

	requires jakarta.persistence;

	
	opens model to eclipselink;
	opens controller to javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
}
