package custom.buttons;

import sudoku.main.WindowDefault;

@SuppressWarnings("serial")
public class ButtonInitGame extends ButtonDefault {
	public ButtonInitGame() {
		setText("Iniciar jogo");
		setLocation((WindowDefault.WINDOW_WIDTH/2)-(getWidth()/2), 190);
	}
}
