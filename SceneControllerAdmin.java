package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class SceneControllerAdmin {
	@FXML
	private TextField OneAdminTitle, TwoAdminTitle, ThreeAdminTitle, FourAdminTitle, FiveAdminTitle;
	private Stage stage;
	private Scene scene;
	private Parent root;
	String textField;
	
	public void ChangeOneName(ActionEvent event) throws IOException {
		FXMLLoader loaderOne = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
		root = loaderOne.load();
		SceneControllerMenu MenuOne = loaderOne.getController();
		MenuOne.displayNameOne(OneAdminTitle.getText());
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
	}
	public void switchToMenuPage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MenuPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}