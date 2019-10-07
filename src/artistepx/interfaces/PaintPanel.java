package artistepx.interfaces;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PaintPanel extends JPanel implements MouseListener{

	private int pixelHeight;
	
	private int pixelWidth;
	
	private MainWindow mainWindow;
	
	private JTextField[][] pixels;
	
	public PaintPanel(MainWindow mainWindow, int pixelHeight, int pixelWidth) {

		this.pixelHeight = pixelHeight;
		this.pixelWidth = pixelWidth;
		
		this.mainWindow = mainWindow;
		
		setLayout(new GridLayout(pixelHeight, pixelWidth));
		pixels =  new JTextField[pixelHeight][pixelWidth];
		
		for (int i = 0; i < pixels.length; i++) {
			for (int j = 0; j < pixels.length; j++) {
				pixels[i][j] = new JTextField();
				pixels[i][j].addMouseListener(this);
				pixels[i][j].setEditable(false);
				add(pixels[i][j]);
			}
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		e.getComponent().setBackground(Color.BLACK);
		((JComponent) e.getComponent()).setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
