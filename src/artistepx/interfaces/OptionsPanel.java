package artistepx.interfaces;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OptionsPanel extends JPanel {

	private MainWindow mainWindow;
	
	private JButton btColor;
	
	public OptionsPanel(MainWindow mainWindow) {
		
		this.mainWindow = mainWindow;
		setLayout(new GridLayout(10, 1));
		
		btColor = new JButton("Color");
		add(btColor);
	}
	
}
