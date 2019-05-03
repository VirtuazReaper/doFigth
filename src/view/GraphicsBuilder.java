package view;

import java.awt.image.BufferedImage;

import gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder{
	
	private BufferedImage emptySky;
	private IDogfightModel dogfigthModel;
	
	public GraphicsBuilder(IDogfigthModel dogfigthModel) {
		this.emptySky = new BufferedImage(0,0,255);
		this.dogfithModel = new IDogfigthModel();
	}
	
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		
	}
	
	private void buildEmptySky() {
		
	}
	
	private void drawMobile(Imobile mobile, Graphics graphics, ImageObserver observer ) {
		
	}
	
	public int getGlobalWidth() {
		return 1;
	}
	
	public int getGlobalHeigth() {
		return 1;
	}
}
