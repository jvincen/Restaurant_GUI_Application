public class OrderIterator {
  OrderList iteratorList;
  int index;

  public OrderIterator(OrderList listOfOrders) {
    iteratorList = listOfOrders;
    index = 0;
  }

  /**
   * Check is there is another element in the list
   * @return
   */
  public boolean hasNext(){
    boolean returnValue = false;

    if( index < iteratorList.getSize() )
      returnValue = true;

    return returnValue;
  }

  /**
   * Get the next element in the list and move the index forward
   * @return
   */
  public OrderType getNext(){
  	OrderType nextElement = iteratorList.getOrder( index );
  	
    index++;

    return nextElement;
  }
  
  /**
   * Move through the list of pianos and print all the information to console.
   */
  public void printAllOrders() {
		while( hasNext() ) {
		  OrderType current = getNext();
		    
		  current.printInfo();
		}
  }
  
  /**
   * Move through the list of pianos and create a table to display in a GUI
   * @return
   */
  public Object[][] createTable(){
  	Object[][] data = new Object[6][3];
  	index = 0; // make sure the index is reset to 0
  	int i = 0; // this is the row for the data array
  	
  	while( hasNext() ) {
  		OrderType current = getNext();
  		data[ i ][0] = current.getTypeName();
  		data[ i ][1] = current.getNumOrder();
  		data[ i ][2] = current.getNumKeys();
  		i++;
  	}
  	
  	return data;
  }
  
}