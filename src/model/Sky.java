package model;

import java.awt.*;


public class Sky implements IArea{
	
	private Dimension dimension;
	private Image image;
	
	public Sky(Dimension dimension) {
		this.dimension = dimension;
		//this.image = new Image();
	}
	
	public Dimension getDimension() {
		return dimension;
	}
	public Image getImage() {
		return this.image;
	}

}
