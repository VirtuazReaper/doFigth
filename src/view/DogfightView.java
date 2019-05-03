package view;

import java.lang.Runnable;

public class DogfightView implements IViewSystem, Runnable{

	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicBuilder;
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfigthModel, Observable observable) {
		this.eventPerformer= new EventPerformer(orderPerformer);
		this.graphicBuilder= new GraphicsBuilder(dogfigthModel);
	}
	
	public void run() {
		
	}

	public void displayMessage(String message) {
		
	}
	
	public void closeAll() {
		
	}
}
