package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class MainSceneController implements Initializable {
	@FXML private TableView<Item> tableView;
	@FXML private TableColumn<Item, SimpleStringProperty> itemNameColumn = new TableColumn<Item,SimpleStringProperty>("itemName");
	@FXML private TableColumn<Item, Integer> quantityColumn = new TableColumn<Item,Integer>("quantity");
	@FXML private TableColumn<Item, Double> priceColumn= new TableColumn<Item,Double>("price");
	@FXML private Label totalLbl, taxLbl;
		  private double totalPrice =0.0;
		  private double tax = 0.0;
		  private ObservableList<Item> items = FXCollections.observableArrayList();
		  
//	public void editQuantityButtonClicked(ActionEvent event) throws IOException
//	{
//		FXMLLoader loader = new FXMLLoader();
//		loader.setLocation(getClass().getClassLoader().getResource("EditViewScene.fxml"));
//		Parent editViewParent = /*loader.load();*/FXMLLoader.load(getClass().getResource("EditViewScene.fxml"));
//		Scene editViewScene = new Scene(editViewParent);
//		
//		//access the controller and call a method
//		EditViewSceneController ctrl = loader.getController();
//		ctrl.initData(tableView.getSelectionModel().getSelectedItem());
//		
//		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//		window.setScene(editViewScene);
//		window.show();	
//	}
	
	public void switchToMenuPage(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("MenuPage.fxml"));
		Parent editViewParent = loader.load();
		Scene scene = new Scene(editViewParent);
		ObservableList<Item> items2 = FXCollections.observableArrayList();
		items2.add(new Item("French Toast",6.99,0));
		items2.add(new Item("Green Salad",6.99,0));
		items2.add(new Item("Chicken Lollipop",9.99,0));
		items2.add(new Item("Sesame Noodles",10.99,0));
		items2.add(new Item("Garlic Butter Chicken",12.99,0));
		for(int i=0;i<items.size();i++) {
			for(int j=0;j<items2.size();j++) {
				if(items.get(i).getItemName().equals(items2.get(j).getItemName())) {
					items2.get(j).setQuantity(items.get(i).getQuantity());
				}
			}
		}
		SceneControllerMenu ctrl = loader.getController();
		ctrl.setQuantities(items2.get(0).getQuantity(),items2.get(1).getQuantity(),items2.get(2).getQuantity(),items2.get(3).getQuantity(),items2.get(4).getQuantity());
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();

	}	  
	
	
	public void changeQuantityCellEvent(CellEditEvent event) {
		
		Item itemSelected = tableView.getSelectionModel().getSelectedItem();
		int origQuantity = itemSelected.getQuantity();
		itemSelected.setQuantity((int) event.getNewValue());
		if(origQuantity>itemSelected.getQuantity()) {
			totalPrice -= (origQuantity-itemSelected.getQuantity())*itemSelected.getPrice();
			tax = totalPrice*0.08;
		}
		else if(origQuantity<itemSelected.getQuantity()) {
			totalPrice += (itemSelected.getQuantity()-origQuantity)*itemSelected.getPrice();
			tax = totalPrice*0.08;
		}
		totalLbl.setText("$"+totalPrice);
		//taxLbl.setText("$"+tax);
		if(itemSelected.getQuantity()==0) {
			ObservableList<Item> allItems = tableView.getItems();
			allItems.remove(itemSelected);
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
		//set up columns in the table
		
		itemNameColumn.setCellValueFactory(new PropertyValueFactory<Item, SimpleStringProperty>("ItemName"));
		
		priceColumn.setCellValueFactory(new PropertyValueFactory<Item, Double>("Price"));
		quantityColumn.setCellValueFactory(new PropertyValueFactory<Item, Integer>("Quantity"));
//		quantityColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
//		quantityColumn.setOnEditCommit(new EventHandler<CellEditEvent<Item, Integer>>(){
//			@Override
//			public void handle(CellEditEvent<Item, Integer> event) {
//				Item item = event.getRowValue();
//				item.setQuantity(event.getNewValue());
//				double totalPrice = item.getQuantity()*item.getPrice();
//				totalLbl.setText(totalPrice + "");
//			}
//		});		
		tableView.setItems(items);
		tableView.setEditable(true);
		quantityColumn.setEditable(true);
		quantityColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
	}
	//returns item object's observable list
	

	public void setItems(ObservableList<Item> items2) {
		this.items = items2;
itemNameColumn.setCellValueFactory(new PropertyValueFactory<Item, SimpleStringProperty>("ItemName"));
		
		priceColumn.setCellValueFactory(new PropertyValueFactory<Item, Double>("Price"));
		quantityColumn.setCellValueFactory(new PropertyValueFactory<Item, Integer>("Quantity"));
//		quantityColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
//		quantityColumn.setOnEditCommit(new EventHandler<CellEditEvent<Item, Integer>>(){
//			@Override
//			public void handle(CellEditEvent<Item, Integer> event) {
//				Item item = event.getRowValue();
//				item.setQuantity(event.getNewValue());
//				double totalPrice = item.getQuantity()*item.getPrice();
//				totalLbl.setText(totalPrice + "");
//			}
//		});		
		ObservableList<Item> removeItems = FXCollections.observableArrayList();
		tableView.setItems(items);
		for(int i=0;i<items.size();i++) {
			totalPrice += items.get(i).getQuantity()*items.get(i).getPrice();
			//totalPrice = Math.round(totalPrice * 100.0) / 100.0;
			totalLbl.setText("$"+totalPrice);
			if(items.get(i).getQuantity()==0) {
				removeItems.add(items.get(i));
			}
		}
		items.removeAll(removeItems);
		tableView.setEditable(true);
		quantityColumn.setEditable(true);
		quantityColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
		
		
	}
}