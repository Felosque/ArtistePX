package artistepx.interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import artistepx.logic.ArtistePX;

public class MainWindow extends JFrame {

	private PaintPanel paintPanel;
	
	private OptionsPanel optionsPanel;
	
	private ArtistePX artistePX;
	
	public MainWindow() {
		
		artistePX = new ArtistePX();
		
		paintPanel = new PaintPanel(this, 20, 20);
		add(paintPanel, BorderLayout.CENTER);
		
		optionsPanel = new OptionsPanel(this);
		add(optionsPanel, BorderLayout.SOUTH);
		
		
	}
	
	public void setBrushColor(Color brushColor) {
		this.paintPanel.setBrushColor(brushColor);
	}
	
	public static void main(String[] args) {
		MainWindow win = new MainWindow();
		win.setSize(new Dimension(1000, 700));
		win.setDefaultCloseOperation(EXIT_ON_CLOSE);
		win.setVisible(true);
		//win.setResizable(false);
	}

}
