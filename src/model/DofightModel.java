package model;


import java.util.ArrayList;
import java.util.Observable;

public class DofightModel implements IDofightModel {
	private Sky sky;
	private ArrayList<IMobile> mobiles;
	
	public DofightModel() {
		// TODO Auto-generated constructor stub
		this.sky = new Sky(new Dimension(500,500));
	}

	@Override
	public void removeMobile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile getMobileByPlaner(int player) {
		// TODO Auto-generated method stub
		return null;
	}
	


}