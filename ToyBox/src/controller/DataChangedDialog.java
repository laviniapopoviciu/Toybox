package controller;


	import javafx.scene.control.ButtonType;
	import javafx.scene.control.Dialog;
	public class DataChangedDialog extends Dialog<ButtonType> {

		public DataChangedDialog() {
			this.setContentText("Daten wurden geändert");
			this.setHeaderText("Info");
			this.getDialogPane().getButtonTypes().add(ButtonType.OK);

		}
	}