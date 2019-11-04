package artistepx.interfaces;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OptionsPanel extends JPanel {

	private MainWindow mainWindow;
	
	private JButton btColor;
	
	private ColorPanel colorPanel;
	
	public OptionsPanel(MainWindow mainWindow) {
		
		this.mainWindow = mainWindow;
		setLayout(new GridLayout(1, 2));
		
		colorPanel = new ColorPanel(mainWindow);
		add(colorPanel);
		
		btColor = new JButton("Opciones");
		add(btColor);
	}
	
}
