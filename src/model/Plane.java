package model;

public class Plane {
	private static int SPEED = 4;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;
	
	public Plane(int player,Direction direction,Position position,String image) {
		this.player = player;
	}
	
	public boolean isPlayer(int player) {
		return false;
	}
	public boolean hit() {
		return false;
	}
}
