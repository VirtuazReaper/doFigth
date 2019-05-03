package model;

import java.util.ArrayList;

public interface IDogfightModel {
		public IArea getArea();
		public void buildArea(Dimension dimension);
		public void addMobile(Mobile mobile);
		public void removeMobile();
		public ArrayList<IMobile> getMobiles();
		public IMobile getMobileByPlaner(int player);
		public void setMobilesHavesMoved();
}
