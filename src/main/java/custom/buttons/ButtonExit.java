package custom.buttons;

import sudoku.main.WindowDefault;

@SuppressWarnings("serial")
public class ButtonExit extends ButtonDefault{
	public ButtonExit() {
		setText("Sair");
		setLocation((WindowDefault.WINDOW_WIDTH/2)-(getWidth()/2), 250);
	}
}
