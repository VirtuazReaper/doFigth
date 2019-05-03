package controller;


public class UserOrder implements IUserOrder {
	
	private int player;
	private Order order;
	
	public UserOrder(int player,Order order) {
		// TODO Auto-generated constructor stub
		this.player = player;
		this.order = order;
	}
	
	@Override
	public int getPlayer() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
