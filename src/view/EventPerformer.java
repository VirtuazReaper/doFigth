package view;

import java.awt.event.KeyEvent;

import controller.IOrderPerformer;
import controller.Order;
import controller.UserOrder;
import gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	
	private IOrderPerformer orderPerfomer;
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerfomer = orderPerformer;
	}
	
	public void eventPerform(KeyEvent keyCode) {
		
	}
	
	private UserOrder keyCodeToUserOrder(Order keyCode) {
		return new UserOrder(1, keyCode);
	}
}
