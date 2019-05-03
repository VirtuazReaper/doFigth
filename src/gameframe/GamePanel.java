package gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer{
	
	private IGraphicsBuilder graphicsBuilder;
	
	public GamePanel (IGraphicsBuilder graphicBuilder) {
		this.graphicsBuilder = graphicBuilder;
	}
	
	
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
	}
	
	public void paintComponent(Graphics graphic) {
		
	}

}
