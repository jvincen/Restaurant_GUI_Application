import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
public class CheckOut {
public static void main(String[] args) {
		
		/***** Create data to use for demo *****/
		OrderList listOfOrders = new OrderList();

		/***** Create JFrame to hold everything *****/
		JFrame frame = new JFrame();
		frame.setSize(1200, 1000);
		frame.setLayout(new GridLayout(1,1));
		JTabbedPane tabs = new JTabbedPane();
		//Setting font size to make it easier to see on projector
		
		tabs.setFont(new Font("Dialog", Font.BOLD, 76)); 
		
		/***** Scrollable panel for iterator design pattern *****/
		tabs.addTab("Thanks For Choosing Us", new IteratorDemo(listOfOrders));
		
		
		
		/***** Add tabs to overall frame and set frame to visible *****/
		frame.add(tabs, BorderLayout.CENTER);
		frame.setVisible(true);
}
}
