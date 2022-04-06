package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Node;

public class SceneControllerMenu implements Initializable {

	@FXML
	private TextField SearchField;
	@FXML
	private Label qOne, qTwo, qThree, qFour, qFive;
	@FXML
	private Label OnePrice, TwoPrice, ThreePrice, FourPrice, FivePrice;
	int q;
	String textField;
	@FXML
	private Label OneTitle, TwoTitle, ThreeTitle, FourTitle, FiveTitle;
	//@FXML
	//private Image OneImage, TwoImage, ThreeImage, FourImage, FiveImage;
	private ObservableList<Item> items = FXCollections.observableArrayList();
	private ObservableList<Item> items2 = FXCollections.observableArrayList();
	
	public void Search(ActionEvent event) throws IOException {
		
		textField = SearchField.getText();
		if(textField.equalsIgnoreCase(OneTitle.getText())) {
			OneTitle.setTextFill(Color.RED);
		} else if(textField.equalsIgnoreCase(TwoTitle.getText())) {
			TwoTitle.setTextFill(Color.RED);
		} else if(textField.equalsIgnoreCase(ThreeTitle.getText())) {
			ThreeTitle.setTextFill(Color.RED);
		} else if(textField.equalsIgnoreCase(FourTitle.getText())) {
			FourTitle.setTextFill(Color.RED);
		} else if(textField.equalsIgnoreCase(FiveTitle.getText())) {
			FiveTitle.setTextFill(Color.RED);
		}
	}
	
	public void showIngOne(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("IngredientPage.fxml"));
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void showIngTwo(ActionEvent event) throws IOException {
		
	}
	
	public void showIngThree(ActionEvent event) throws IOException {
		
	}
	
	public void showIngFour(ActionEvent event) throws IOException {
		
	}
	
	public void showIngFive(ActionEvent event) throws IOException {
		
	}

	
	public void OneMinus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qOne.getText());
		q--;
		if(q >= 0 ) {
			items.get(0).setQuantity(q);
			qOne.setText(Integer.toString(q));
		}
	}
	public void OnePlus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qOne.getText());
		q++;
		if(q >= 0 ) {
			items.get(0).setQuantity(q);
			qOne.setText(Integer.toString(q));
		}
	}
	
	public void TwoMinus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qTwo.getText());
		q--;
		if(q >= 0 ) {
			items.get(1).setQuantity(q);
			qTwo.setText(Integer.toString(q));
		}
	}
	public void TwoPlus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qTwo.getText());
		q++;
		if(q >= 0 ) {
			items.get(1).setQuantity(q);
			qTwo.setText(Integer.toString(q));
		}
	}
	
	public void ThreeMinus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qThree.getText());
		q--;
		if(q >= 0 ) {
			items.get(2).setQuantity(q);
			qThree.setText(Integer.toString(q));
		}
	}
	public void ThreePlus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qThree.getText());
		q++;
		if(q >= 0 ) {
			items.get(2).setQuantity(q);
			qThree.setText(Integer.toString(q));
		}
	}
	
	public void FourMinus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qFour.getText());
		q--;
		if(q >= 0) {
			items.get(3).setQuantity(q);
			qFour.setText(Integer.toString(q));
		}
	}
	public void FourPlus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qFour.getText());
		q++;
		if(q >= 0 ) {
			items.get(3).setQuantity(q);
			qFour.setText(Integer.toString(q));
		}
	}
	
	public void FiveMinus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qFive.getText());
		q--;
		if(q >= 0 ) {
			items.get(4).setQuantity(q);
			qFive.setText(Integer.toString(q));
		}
	}
	public void FivePlus(ActionEvent event) throws IOException {
		q = Integer.parseInt(qFive.getText());
		q++;
		if(q >= 0) {
			items.get(4).setQuantity(q);
			qFive.setText(Integer.toString(q));
		}
	}

	public void switchToMenuPage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MenuPage.fxml"));
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToAdminPage(ActionEvent event) throws IOException {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("AdminMenuPage.fxml"));
		Parent editViewParent = loader.load();
		Scene scene = new Scene(editViewParent);
		SceneControllerAdmin ctrl = loader.getController();
		ctrl.setItems(items);
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
	public void switchToCheckout(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MainScene.fxml"));
		Parent editViewParent = loader.load();
		Scene scene = new Scene(editViewParent);
		MainSceneController ctrl = loader.getController();
		ctrl.setItems(items);
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
	public void displayNameOne(String text) {
		SimpleStringProperty var = new SimpleStringProperty((String) text);
		items.get(0).setItemName(var);
	}
	
	public void displayNameTwo(String text) {
		SimpleStringProperty var = new SimpleStringProperty((String) text);
		items.get(1).setItemName(var);
	}
	
	public void displayNameThree(String text) {
		SimpleStringProperty var = new SimpleStringProperty((String) text);
		items.get(2).setItemName(var);
	}
	
	public void displayNameFour(String text) {
		SimpleStringProperty var = new SimpleStringProperty((String) text);
		items.get(3).setItemName(var);
	}
	
	public void displayNameFive(String text) {
		SimpleStringProperty var = new SimpleStringProperty((String) text);
		items.get(4).setItemName(var);
	}
	
	public void displayPriceOne(Double price) {
		items.get(0).setPrice(price);
	}
	
	public void displayPriceTwo(Double price) {
		items.get(0).setPrice(price);
	}
	
	public void displayPriceThree(Double price) {
		items.get(0).setPrice(price);
	}
	
	public void displayPriceFour(Double price) {
		items.get(0).setPrice(price);
	}
	
	public void displayPriceFive(Double price) {
		items.get(0).setPrice(price);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		items.add(new Item("French Toast",6.99,0));
		items.add(new Item("Green Salad",6.99,0));
		items.add(new Item("Chicken Lollipop",9.99,0));
		items.add(new Item("Sesame Noodles",10.99,0));
		items.add(new Item("Garlic Butter Chicken",12.99,0));
		OneTitle.setText(items.get(0).getItemName());
		TwoTitle.setText(items.get(1).getItemName());
		ThreeTitle.setText(items.get(2).getItemName());
		FourTitle.setText(items.get(3).getItemName());
		FiveTitle.setText(items.get(4).getItemName());
		OnePrice.setText("$"+items.get(0).getPrice());
		TwoPrice.setText("$"+items.get(1).getPrice());
		ThreePrice.setText("$"+items.get(2).getPrice());
		FourPrice.setText("$"+items.get(3).getPrice());
		FivePrice.setText("$"+items.get(4).getPrice());
		qOne.setText(""+items.get(0).getQuantity());
		qTwo.setText(""+items.get(1).getQuantity());
		qThree.setText(""+items.get(2).getQuantity());
		qFour.setText(""+items.get(3).getQuantity());
		qFive.setText(""+items.get(4).getQuantity());
	}
		
	
	private ObservableList<Item> getItem() {
		return items;
	}

	public void setQuantities(int quantity, int quantity2, int quantity3, int quantity4, int quantity5) {
		// TODO Auto-generated method stub
		items2.add(new Item("French Toast",6.99,quantity));
		items2.add(new Item("Green Salad",6.99,quantity2));
		items2.add(new Item("Chicken Lollipop",9.99,quantity3));
		items2.add(new Item("Sesame Noodles",10.99,quantity4));
		items2.add(new Item("Garlic Butter Chicken",12.99,quantity5));
		OneTitle.setText(items2.get(0).getItemName());
		TwoTitle.setText(items2.get(1).getItemName());
		ThreeTitle.setText(items2.get(2).getItemName());
		FourTitle.setText(items2.get(3).getItemName());
		FiveTitle.setText(items2.get(4).getItemName());
		OnePrice.setText("$"+items2.get(0).getPrice());
		TwoPrice.setText("$"+items2.get(1).getPrice());
		ThreePrice.setText("$"+items2.get(2).getPrice());
		FourPrice.setText("$"+items2.get(3).getPrice());
		FivePrice.setText("$"+items2.get(4).getPrice());
		qOne.setText(""+items2.get(0).getQuantity());
		qTwo.setText(""+items2.get(1).getQuantity());
		qThree.setText(""+items2.get(2).getQuantity());
		qFour.setText(""+items2.get(3).getQuantity());
		qFive.setText(""+items2.get(4).getQuantity());
		items=items2;
	}
	public void setItems(ObservableList<Item> items4) {
		// TODO Auto-generated method stub
		
		OneTitle.setText(items4.get(0).getItemName());
		TwoTitle.setText(items4.get(1).getItemName());
		ThreeTitle.setText(items4.get(2).getItemName());
		FourTitle.setText(items4.get(3).getItemName());
		FiveTitle.setText(items4.get(4).getItemName());
		OnePrice.setText("$"+items4.get(0).getPrice());
		TwoPrice.setText("$"+items4.get(1).getPrice());
		ThreePrice.setText("$"+items4.get(2).getPrice());
		FourPrice.setText("$"+items4.get(3).getPrice());
		FivePrice.setText("$"+items4.get(4).getPrice());
		qOne.setText(""+items4.get(0).getQuantity());
		qTwo.setText(""+items4.get(1).getQuantity());
		qThree.setText(""+items4.get(2).getQuantity());
		qFour.setText(""+items4.get(3).getQuantity());
		qFive.setText(""+items4.get(4).getQuantity());
		items=items4;
	}
	
}
