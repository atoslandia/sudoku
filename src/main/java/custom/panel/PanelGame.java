package custom.panel;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class PanelGame extends PanelDefault{
	
	public PanelGame() {
		setLayout(null);
		listNumbers();
	}
	
	
	private void listNumbers() {
		DefaultTableModel model = new DefaultTableModel();
		Object[] columsAndRows = new Object[9];
		for(int i = 1; i <= columsAndRows.length; i++) 
			model.addColumn(i);
		
		for(int i = 1; i <= columsAndRows.length; i++) 
			model.addRow(columsAndRows);
		JTable table = new JTable(model);
		table.setBounds(10, 10, 300, 300);
		add(table);
	}
	
}
