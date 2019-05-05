package gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IEventPerformer eventPerformer;
	
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicsBuilder, Observable observable) {
		final GamePanel gamePanel = new GamePanel(graphicsBuilder);
		
		this.eventPerformer = performer;
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		
		this.setContentPane(gamePanel);
		this.setSize(800,800); 
		this.setLocationRelativeTo(null);  	
		observable.addObserver(gamePanel);
	}
	public void keyPressed(KeyEvent keyEvent) {
		eventPerformer.eventPerform(keyEvent);
	}
	public void keyReleased(KeyEvent keyEvent) {
		
	}
	public void keyTyped(KeyEvent keyEvent) {
		
	}
}
