import javax.swing.JPanel;

public class OrderObserverV2 extends OrderObserver {
	
	public OrderObserverV2(OrderType subj, JPanel pa) {
		super(subj, pa);
		this.subject = subj;
		subj.addObserver(this);
		
		this.panel = pa;
	}}