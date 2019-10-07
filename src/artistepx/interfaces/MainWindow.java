package artistepx.interfaces;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainWindow extends JFrame {

	private PaintPanel paintPanel;
	
	private OptionsPanel optionsPanel;
	
	public MainWindow() {
		
		paintPanel = new PaintPanel(this, 10, 10);
		add(paintPanel, BorderLayout.CENTER);
		
		optionsPanel = new OptionsPanel(this);
		add(optionsPanel, BorderLayout.EAST);
		
	}
	
	
	public static void main(String[] args) {
		MainWindow win = new MainWindow();
		win.setSize(new Dimension(1000, 700));
		win.setDefaultCloseOperation(EXIT_ON_CLOSE);
		win.setVisible(true);
		win.setResizable(false);
	}

}
