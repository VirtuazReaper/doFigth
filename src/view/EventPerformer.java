package view;

import java.awt.event.KeyEvent;

import controller.IOrderPerformer;
import controller.Order;
import controller.UserOrder;
import gameframe.IEventPerformer;
import controller.IUserOrder;

public class EventPerformer implements IEventPerformer{
	
	private IOrderPerformer orderPerfomer;
	
	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerfomer = orderPerformer;
	}
	
	public void eventPerform(KeyEvent keyCode) {
		final IUserOrder userOrder = this.keyCodeToUserOrder(keyCode.getKeyCode());
		if (userOrder != null) {
			this.orderPerfomer.orderPerform(userOrder);
		}
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		UserOrder userOrder;
		switch (keyCode) {
			case KeyEvent.VK_UP:
				userOrder = new UserOrder(0, Order.UP);
				break;
			case KeyEvent.VK_RIGHT:
				userOrder = new UserOrder(0, Order.RIGHT);
				break;
			case KeyEvent.VK_DOWN:
				userOrder = new UserOrder(0, Order.DOWN);
				break;
			case KeyEvent.VK_LEFT:
				userOrder = new UserOrder(0, Order.LEFT);
				break;
			case KeyEvent.VK_CONTROL:
				userOrder = new UserOrder(0, Order.SHOOT);
				break;

			case KeyEvent.VK_Z:
				userOrder = new UserOrder(1, Order.UP);
				break;
			case KeyEvent.VK_D:
				userOrder = new UserOrder(1, Order.RIGHT);
				break;
			case KeyEvent.VK_S:
				userOrder = new UserOrder(1, Order.DOWN);
				break;
			case KeyEvent.VK_Q:
				userOrder = new UserOrder(1, Order.LEFT);
				break;
			case KeyEvent.VK_SHIFT:
				userOrder = new UserOrder(1, Order.SHOOT);
				break;
			default:
				userOrder = null;
		}
		return userOrder;
	}
}
