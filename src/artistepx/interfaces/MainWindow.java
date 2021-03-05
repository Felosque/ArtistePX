package artistepx.interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import artistepx.logic.ArtistePX;
import artistepx.logic.Pixel;

public class MainWindow extends JFrame {

	private PaintPanel paintPanel;
	
	private OptionsPanel optionsPanel;
	
	private ArtistePX artistePX;
	
	private ActionListenerUI actionListenerUI;
	
	public MainWindow() {
		
		artistePX = new ArtistePX();
		
		actionListenerUI = new ActionListenerUI(this);
		
		paintPanel = new PaintPanel(this, 40, 40);
		add(paintPanel, BorderLayout.CENTER);
		
		optionsPanel = new OptionsPanel(this);
		add(optionsPanel, BorderLayout.SOUTH);
		
		this.pack();
	}
	
	public void loadDraw() {
		JFileChooser fileChooser = new JFileChooser("./saves");
		int selected = fileChooser.showOpenDialog(this);
//		FileNameExtensionFilter filter = new FileNameExtensionFilter(".artpx");
//		fileChooser.setFileFilter(filter);
		try {
			if (selected == JFileChooser.APPROVE_OPTION)
			{
			   File file = fileChooser.getSelectedFile();
			   ArrayList<Pixel> pixels = artistePX.viewPixelArt(file.getAbsolutePath());
			   paintPanel.setDrawToPanel(pixels);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void saveDraw() {
		artistePX.savePixelArt("Prueba1", paintPanel.getDrawToArrayList());
	}
	
	public void newDraw()
	{
		this.paintPanel.newDraw();
	}
	
	public void setEraser()
	{
		this.paintPanel.setBrushColor(Color.WHITE);
	}
	
	public void setSmooth()
	{
		this.paintPanel.smoothPicture();
		JOptionPane.showMessageDialog(this, "Si funciono :D");
	}
	
	public void setSelectColor()
	{
		
	}
	
	public void setBrushColor(Color brushColor) {
		this.paintPanel.setBrushColor(brushColor);
	}
	
	public ActionListenerUI getActionListener()
	{
		return actionListenerUI;
	}
	
	public static void main(String[] args) {
		MainWindow win = new MainWindow();
		win.setSize(new Dimension(1000, 700));
		win.setDefaultCloseOperation(EXIT_ON_CLOSE);
		win.setVisible(true);
		win.setTitle("ArtistePX - By Felosque");
		//win.setResizable(false);
	}

}
