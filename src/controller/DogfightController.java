package controller;

import model.Dimension;
import model.Direction;
import model.IDogfightModel;
import model.Missile;
import view.IViewSystem;

public class DogfightController implements IOrderPerformer {
	private static int TIME_SLEEP = 30;
	private IViewSystem viewSystem;
	private IDogfightModel dogfightModel;
	
	public DogfightController(IDogfightModel dogfightModel) {
		// TODO Auto-generated constructor stub
		this.dogfightModel = dogfightModel;
		
	}
	
	public void play() {
		
	}
	public void setViewSystem(IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}
	private void launchMissile(int player) {
		//Missile missile = new Missile(Direction.RIGHT, )
	}
	private void gameLoop() {
		
	}
	
	@Override
	public void orderPerform(IUserOrder userOrder) {
		
	}

}
