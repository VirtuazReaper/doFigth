package model;

import java.awt.*;
import java.awt.geom.Area;
import java.util.ArrayList;


public class Mobile implements IMobile {

	private int speed;
	private Dimension dimension;
	private Direction direction;
	private Position position;
	private ArrayList<Image> images;
	
	public Mobile(Direction direction, Position position, Dimension dimension,int speed,String image) {
		this.speed = speed;
		this.dimension  = dimension;
		this.direction = direction;
		this.position = position;
		//this.images = new Image();
	}
	
	private void moveUp() {
		
	}
	private void moveRight() {
		
	}
	private void moveDown() {
		
	}
	private void moveLeft() {
		
	}
	public Color color() {
		return new Color(10,20,30);
	}
	public void getDofightModel() {

	}
	
	
	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDofightModel(DofightModel dofightModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void placeInArea(Area area) {
		// TODO Auto-generated method stub
		
	}

}
