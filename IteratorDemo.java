/*****
  * Iterator Pattern falls under the Behavioral Pattern category.
 * Often used to access a collection of objects while hiding the complexity
 * of the data structure.
 * 
 * In this code, we iterate through the list of pianos twice.
 * 1) printAllPianos() will go through the entire list and print all the
 * 			information to the console.
 * 2) createTable() will go through the entire list and create a table to
 * 			display the information in a GUI
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;


public class IteratorDemo extends JScrollPane {
	
	String[] rowNames = {"Your Order", "Estimated Time on Your Order", "Order Number"};
	
	public IteratorDemo(OrderList listOfOrder) {
		/***** Iterate through the list and print all information to the console *****/
		OrderIterator it = new OrderIterator( listOfOrder );
		it.printAllOrders();
		
		/***** Iterator this time will go through the list
		 * and create a table to show the information in a GUI
		 *  *****/
		// Table to hold all the data that will be shown
		JTable iteratorTable = new JTable(it.createTable(), rowNames);
		
		JTableHeader tableHeader = iteratorTable.getTableHeader();
		tableHeader.setFont(new Font("Dialog", Font.BOLD, 22)); // Font size for table header
		tableHeader.setBackground(Color.red);
		iteratorTable.setBackground(Color.cyan);
		iteratorTable.setForeground(Color.black);
		iteratorTable.setFont(new Font("Text",Font.BOLD,  30)); // Font size of table rows
		iteratorTable.setRowHeight(50);
		
		// Set table to the scrollable panel
		getViewport().add(iteratorTable);
	
		iteratorTable.setFillsViewportHeight(true);
	}
	
}