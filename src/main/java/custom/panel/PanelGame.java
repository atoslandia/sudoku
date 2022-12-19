package custom.panel;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import custom.buttons.ButtonExit;
import custom.buttons.ButtonNumberDefine;

@SuppressWarnings("serial")
public class PanelGame extends PanelDefault{
	
	public PanelGame() {
		setLayout(null);
		listNumbers();
	}
	
	private void listNumbers() {
		JLabel[][] numbers = {{new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("67"), new JLabel("C")},
		{new JLabel("A"), new JLabel("4"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C")},
		{new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C")},
		{new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C")},
		{new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C")},
		{new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C")},
		{new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C")},
		{new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C")},
		{new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C"), new JLabel("D"), new JLabel("A"), new JLabel("B"), new JLabel("C")}};
		
		for(int l = 0; l < numbers.length; l++) {
			for(int c = 0; c < numbers.length; c++ ) {
				numbers[l][c].setBounds(10+c*20, 10+l*20, 20, 20);
				add(numbers[l][c]);
			}
		}
		
			
	}
	
}
