package view;

import java.lang.Runnable;
import java.util.Observable;

import controller.IOrderPerformer;
import gameframe.GameFrame;
import model.IDogfightModel;

public class DogfightView implements IViewSystem, Runnable{

	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicBuilder;
	private GameFrame gameFrame;
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfigthModel, Observable observable) {
		this.eventPerformer= new EventPerformer(orderPerformer);
		this.graphicBuilder= new GraphicsBuilder(dogfigthModel);
		this.gameFrame = new GameFrame("Cobreille5.4", this.eventPerformer, graphicBuilder, observable);
	}
	
	public void run() {
		
	}

	public void displayMessage(String message) {
		
	}
	
	public void closeAll() {
		
	}
}
