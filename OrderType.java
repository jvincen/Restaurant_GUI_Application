public class OrderType {
  String typeName;
  int NumOrder;
  int numKeys;
  OrderObserver observer; // Used in ObserverDemo

  public OrderType(String arg1, int arg2, int arg3) {
    typeName = arg1;
    NumOrder = arg2;
    numKeys = arg3;
  }

  /**
   * Used by iterator to print all information to the console.
   */
  public void printInfo() {
	  System.out.println("Order Type: " + typeName);
    System.out.println("Order Success: " + NumOrder);
    System.out.println("Order has " + numKeys + " keys.\n");
  }
  
  public String getTypeName() {
  	return typeName;
  }
  
  public int getNumOrder() {
  	return NumOrder;
  }
  
  public int getNumKeys() {
  	return numKeys;
  }
  
  
  public void addObserver( OrderObserver arg1 ) {
  	observer = arg1;
  }
  
 
}