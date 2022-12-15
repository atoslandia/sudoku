package sudoku.main;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class WindowDefault extends JFrame{
	
	public static final int WINDOW_WIDTH = 450;
	public static final int WINDOW_HEIGHT = 450;
	
	public WindowDefault(String title) {
		setTitle(title);
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}
