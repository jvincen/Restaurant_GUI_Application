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