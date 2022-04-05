import javax.swing.JPanel;

public class OrderObserver {
	OrderType subject; // The object that the observer is monitoring
	JPanel panel; // The panel to send an update to
	
	public OrderObserver(OrderType subj, JPanel pa) {
		subject = subj;
		subj.addObserver(this);
		
		panel = pa;
	}
	
	
}