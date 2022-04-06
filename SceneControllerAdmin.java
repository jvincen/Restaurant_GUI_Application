package application;

import java.io.IOException;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
	@FXML
	private TextField OneAdminPrice, TwoAdminPrice, ThreeAdminPrice, FourAdminPrice, FiveAdminPrice;
	private Stage stage;
	private Scene scene;
	private Parent root;
	String textField;
	private int q=8;
	private ObservableList<Item> items2 = FXCollections.observableArrayList();
	
	public void ChangeOneName(ActionEvent event) throws IOException {
		FXMLLoader loaderOne = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
		root = loaderOne.load();
		SceneControllerMenu MenuOne = loaderOne.getController();
		MenuOne.displayNameOne(OneAdminTitle.getText());
		items2.get(0).setItemName(new SimpleStringProperty(OneAdminTitle.getText()));
	}
	
	public void ChangeTwoName(ActionEvent event) throws IOException {
		FXMLLoader loaderOne = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
		root = loaderOne.load();
		SceneControllerMenu MenuOne = loaderOne.getController();
		MenuOne.displayNameTwo(TwoAdminTitle.getText());
		items2.get(1).setItemName(new SimpleStringProperty(TwoAdminTitle.getText()));
	}
	
	public void ChangeThreeName(ActionEvent event) throws IOException {
		FXMLLoader loaderOne = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
		root = loaderOne.load();
		SceneControllerMenu MenuOne = loaderOne.getController();
		MenuOne.displayNameThree(ThreeAdminTitle.getText());
		items2.get(2).setItemName(new SimpleStringProperty(ThreeAdminTitle.getText()));
	}
	
	public void ChangeFourName(ActionEvent event) throws IOException {
		FXMLLoader loaderOne = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
		root = loaderOne.load();
		SceneControllerMenu MenuOne = loaderOne.getController();
		MenuOne.displayNameFour(FourAdminTitle.getText());
		items2.get(3).setItemName(new SimpleStringProperty(FourAdminTitle.getText()));
	}
	
	public void ChangeFiveName(ActionEvent event) throws IOException {
		FXMLLoader loaderOne = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
		root = loaderOne.load();
		SceneControllerMenu MenuOne = loaderOne.getController();
		MenuOne.displayNameFive(FiveAdminTitle.getText());
		items2.get(4).setItemName(new SimpleStringProperty(FiveAdminTitle.getText()));
	}
	
	public void ChangeOnePrice(ActionEvent event) throws IOException {
		FXMLLoader loaderOne = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
		root = loaderOne.load();
		SceneControllerMenu MenuOne = loaderOne.getController();
		MenuOne.displayPriceOne(Double.parseDouble(OneAdminPrice.getText()));
		items2.get(0).setPrice(Double.parseDouble(OneAdminPrice.getText()));
	}
	
	public void ChangeTwoPrice(ActionEvent event) throws IOException {
		FXMLLoader loaderOne = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
		root = loaderOne.load();
		SceneControllerMenu MenuOne = loaderOne.getController();
		MenuOne.displayPriceTwo(Double.parseDouble(TwoAdminPrice.getText()));
		items2.get(1).setPrice(Double.parseDouble(TwoAdminPrice.getText()));
	}
	
	public void ChangeThreePrice(ActionEvent event) throws IOException {
		FXMLLoader loaderOne = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
		root = loaderOne.load();
		SceneControllerMenu MenuOne = loaderOne.getController();
		MenuOne.displayPriceThree(Double.parseDouble(ThreeAdminPrice.getText()));
		items2.get(2).setPrice(Double.parseDouble(ThreeAdminPrice.getText()));
	}
	
	public void ChangeFourPrice(ActionEvent event) throws IOException {
		FXMLLoader loaderOne = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
		root = loaderOne.load();
		SceneControllerMenu MenuOne = loaderOne.getController();
		MenuOne.displayPriceFour(Double.parseDouble(FourAdminPrice.getText()));
		items2.get(3).setPrice(Double.parseDouble(FourAdminPrice.getText()));
	}
	
	public void ChangeFivePrice(ActionEvent event) throws IOException {
		FXMLLoader loaderOne = new FXMLLoader(getClass().getResource("MenuPage.fxml"));
		root = loaderOne.load();
		SceneControllerMenu MenuOne = loaderOne.getController();
		MenuOne.displayPriceFive(Double.parseDouble(FiveAdminPrice.getText()));
		items2.get(4).setPrice(Double.parseDouble(FiveAdminPrice.getText()));
	}
	
	
	public void switchToMenuPage(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MenuPage.fxml"));
		Parent editViewParent = loader.load();
		Scene scene = new Scene(editViewParent);
		SceneControllerMenu ctrl = loader.getController();
		ctrl.setItems(items2);
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

	public void setItems(ObservableList<Item> items) {
		// TODO Auto-generated method stub
		items2=items;
	}

}