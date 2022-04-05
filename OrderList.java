import java.util.ArrayList;

public class OrderList {
	ArrayList<OrderType> customList;
	
	public OrderList() {
		customList = new ArrayList<OrderType>();
		
		}
	
	public OrderType getOrder(int index) {
		return customList.get(index);
	}
	
	public int getSize() {
		return customList.size();
	}
	
}