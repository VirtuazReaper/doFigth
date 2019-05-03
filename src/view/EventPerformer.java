package view;

import controller.IOrderPerformer;
import controller.Userorder;
import gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	
	private IOderPerformer orderPerfomer;
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerfomer = orderPerformer;
	}
	
	public void eventPerform(KeyEvent keyCode) {
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		
	}
}
