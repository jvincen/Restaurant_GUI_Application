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

public class SceneControllerMenu {
	@FXML
	private TextField SearchField;
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	private Label qOne, qTwo, qThree, qFour, qFive;
	int q;
	String textField;
	@FXML
	private Label OneTitle, TwoTitle, ThreeTitle, FourTitle, FiveTitle;
	
	public void Search(ActionEvent event) throws IOException {
		
		textField = SearchField.getText();
		System.out.println(textField);
	}
	public void OneMinus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qOne.getText());
		q--;
		if(q >= 0 & q <= 10) {
			qOne.setText(Integer.toString(q));
		}
	}
	public void OnePlus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qOne.getText());
		q++;
		if(q >= 0 & q <= 10) {
			qOne.setText(Integer.toString(q));
		}
	}
	
	public void TwoMinus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qTwo.getText());
		q--;
		if(q >= 0 & q <= 10) {
			qTwo.setText(Integer.toString(q));
		}
	}
	public void TwoPlus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qTwo.getText());
		q++;
		if(q >= 0 & q <= 10) {
			qTwo.setText(Integer.toString(q));
		}
	}
	
	public void ThreeMinus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qThree.getText());
		q--;
		if(q >= 0 & q <= 10) {
			qThree.setText(Integer.toString(q));
		}
	}
	public void ThreePlus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qThree.getText());
		q++;
		if(q >= 0 & q <= 10) {
			qThree.setText(Integer.toString(q));
		}
	}
	
	public void FourMinus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qFour.getText());
		q--;
		if(q >= 0 & q <= 10) {
			qFour.setText(Integer.toString(q));
		}
	}
	public void FourPlus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qFour.getText());
		q++;
		if(q >= 0 & q <= 10) {
			qFour.setText(Integer.toString(q));
		}
	}
	
	public void FiveMinus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qFive.getText());
		q--;
		if(q >= 0 & q <= 10) {
			qFive.setText(Integer.toString(q));
		}
	}
	public void FivePlus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qFive.getText());
		q++;
		if(q >= 0 & q <= 10) {
			qFive.setText(Integer.toString(q));
		}
	}

	public void switchToIngredientPage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("IngredientPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToAdminPage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("AdminMenuPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void displayNameOne(String text) {
		System.out.println(OneTitle.getText());
		OneTitle.setText(text);
		System.out.println(OneTitle.getText());
	}

}
