package artistepx.interfaces;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JPanel;

public class ColorPanel extends JPanel {

	private Scrollbar colorR, colorG, colorB;
	
	private JPanel colorVisualizer;
	
	
	public ColorPanel(MainWindow mainWindows) {
		
		setLayout(new GridLayout(4, 1));
		
		//initialize random color
		int randomColorR = (int) Math.floor(Math.random()*(0-255+1)+255);
		int randomColorG = (int) Math.floor(Math.random()*(0-255+1)+255);
		int randomColorB = (int) Math.floor(Math.random()*(0-255+1)+255);
		
		colorR = new Scrollbar(Scrollbar.HORIZONTAL, randomColorR, 1, 0, 255);
		colorG = new Scrollbar(Scrollbar.HORIZONTAL, randomColorG, 1, 0, 255);
		colorB = new Scrollbar(Scrollbar.HORIZONTAL, randomColorB, 1, 0, 255);
		
		mainWindows.setBrushColor(new Color(randomColorR, randomColorG, randomColorB));
		
		colorVisualizer = new JPanel();
		colorVisualizer.setBackground(new Color(colorR.getValue(), colorG.getValue(), colorB.getValue()));
		add(colorVisualizer);
		
		//Check scrollbar movements
		AdjustmentListener adjustmentListener = new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
				Color color = new Color(colorR.getValue(), colorG.getValue(), colorB.getValue());
				colorVisualizer.setBackground(color);
				mainWindows.setBrushColor(color);
			}
		};

		colorR.addAdjustmentListener(adjustmentListener);
		colorG.addAdjustmentListener(adjustmentListener);
		colorB.addAdjustmentListener(adjustmentListener);
		
		add(colorR);
		add(colorG);
		add(colorB);
		
	}

}
