package sudoku.main;

import java.awt.Font;

import javax.swing.JLabel;

import custom.panel.PanelGame;

@SuppressWarnings("serial")
public class WindowMain extends WindowDefault{
	public WindowMain() {
		super("Sudoku");
		add(new TableNumbers());
		setVisible(true);
	}
	
	private class TableNumbers extends PanelGame{
		
	}
	
}
