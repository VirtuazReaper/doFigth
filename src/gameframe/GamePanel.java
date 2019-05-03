package gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

import model.DogfightModel;
import model.IDogfightModel;

public class GamePanel extends JPanel implements Observer{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IGraphicsBuilder graphicsBuilder;
	private DogfightModel dogfightModel;
	
	public GamePanel (IGraphicsBuilder graphicBuilder) {
		this.graphicsBuilder = graphicBuilder;
		dogfightModel.addObserver(this);
	}
	
	
	public void update(Observable arg0, Object arg1) {
		repaint();
	}
	
	public void paintComponent(Graphics graphic) {
		
	}

}
