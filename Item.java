package application;

import javafx.beans.property.SimpleStringProperty;

public class Item 
{
	private SimpleStringProperty itemName;
	private double price;
	private int quantity;
	
	public Item(String itemName, double price, int quantity) 
	{
		this.itemName = new SimpleStringProperty(itemName);
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getItemName() 
	{
		return itemName.get();
	}
	
	public void setItemName(SimpleStringProperty itemName) 
	{
		this.itemName = itemName;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	public int getQuantity() 
	{
		return quantity;
	}
	
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
		
}

/*
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.text.Font?>

<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="494.0" prefWidth="633.0" style="-fx-background-color: #59a3d1;" xmlns="http://javafx.com/javafx/18" xmlns:fx="http://javafx.com/fxml/1">
   <children>
      <Label fx:id="nameLbl" alignment="CENTER" contentDisplay="CENTER" layoutX="142.0" layoutY="62.0" prefHeight="72.0" prefWidth="349.0" text="Name">
         <font>
            <Font name="System Bold" size="36.0" />
         </font>
      </Label>
      <Label fx:id="priceLbl" alignment="CENTER" layoutX="201.0" layoutY="142.0" prefHeight="64.0" prefWidth="230.0" text="\$">
         <font>
            <Font name="System Bold Italic" size="22.0" />
         </font>
      </Label>
      <Button layoutX="142.0" layoutY="264.0" mnemonicParsing="false" prefHeight="64.0" prefWidth="52.0" text="-">
         <font>
            <Font name="System Bold" size="19.0" />
         </font>
      </Button>
      <Button layoutX="440.0" layoutY="263.0" mnemonicParsing="false" prefHeight="64.0" prefWidth="52.0" text="+">
         <font>
            <Font size="19.0" />
         </font>
      </Button>
      <Button layoutX="251.0" layoutY="342.0" mnemonicParsing="false" prefHeight="40.0" prefWidth="130.0" style="-fx-background-color: #1acf35;" text="CONFIRM">
         <font>
            <Font name="System Bold Italic" size="16.0" />
         </font>
      </Button>
      <Button layoutX="578.0" layoutY="454.0" mnemonicParsing="false" style="-fx-background-color: #ef4a34;" text="Back" />
      <Label fx:id="quantityLbl" alignment="CENTER" layoutX="211.0" layoutY="263.0" prefHeight="64.0" prefWidth="211.0" text="0">
         <font>
            <Font size="19.0" />
         </font>
      </Label>
   </children>
</AnchorPane>
*/
/*package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

import javafx.scene.layout.AnchorPane;

public class EditItemSceneController {
	
	public Item selectedItem;

	@FXML
	private Label nameLbl = new Label("name");
	@FXML
	private Label priceLbl = new Label("$");
	@FXML
	private Label quantityLbl = new Label("HARIPAA");
	
		
	
	//This method accepts an item to initiailize the view
	public void initData(Item item) 
	{
		nameLbl.setText(selectedItem.getItemName());
		double totalPrice = selectedItem.getPrice() * selectedItem.getQuantity();
		priceLbl.setText(String.valueOf(totalPrice));
		quantityLbl.setText(selectedItem.getQuantity()+"");
		
	}

}

 * 
 * */