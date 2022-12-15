package sudoku.main;

import custom.panel.PanelGame;

public class WindowMain extends WindowDefault{
	public WindowMain() {
		super("Sudoku");
		add(new TableNumbers());
		setVisible(true);
	}
	
	private class TableNumbers extends PanelGame{
	}
	
}
