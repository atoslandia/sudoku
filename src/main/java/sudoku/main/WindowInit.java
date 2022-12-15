package sudoku.main;

import custom.buttons.ButtonExit;
import custom.buttons.ButtonInitGame;

@SuppressWarnings("serial")
public class WindowInit extends WindowDefault {
	public WindowInit() {
		super("Início");
		setVisible(true);
		buttons();
	}
	
	private void buttons() {
		ButtonInitGame buttonInitGame = new ButtonInitGame();
		add(buttonInitGame);
		
		ButtonExit buttonExit = new ButtonExit();
		add(buttonExit);
	}
	
}
