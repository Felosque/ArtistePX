package artistepx.interfaces;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class OptionsPanel extends JPanel {

	private MainWindow mainWindow;
	
	public OptionsPanel(MainWindow mainWindow) {
		
		this.mainWindow = mainWindow;
		setLayout(new GridLayout(10, 1));
	}
	
}
