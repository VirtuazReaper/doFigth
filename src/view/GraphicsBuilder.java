package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import gameframe.IGraphicsBuilder;
import model.IDogfightModel;
import model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder{
	
	private BufferedImage emptySky;
	private IDogfightModel dogfigthModel;
	
	public GraphicsBuilder(IDogfightModel dogfightModel) {
		this.emptySky = new BufferedImage(0,0,255);
		this.dogfigthModel = dogfightModel;
	}
	
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
	}
	
	private void buildEmptySky() {
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer ) {
		
	}
	
	public int getGlobalWidth() {
		return 1;
	}
	
	public int getGlobalHeigth() {
		return 1;
	}

}
