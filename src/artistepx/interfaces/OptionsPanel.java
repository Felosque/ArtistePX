package artistepx.interfaces;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import artistepx.logic.Constants;

public class OptionsPanel extends JPanel {

	private MainWindow mainWindow;
	
	private JButton btOptions;
	
	private JButton btEraser;
	
	private JButton btSmooth;
	
	private JButton btNewDraw;
	
	private JButton btSave;
	
	private JButton btLoad;
	
	private JButton btSelectColor;
	
	private ColorPanel colorPanel;
	
	public OptionsPanel(MainWindow pMainWindows) {
		
		this.mainWindow = pMainWindows;
		setLayout(new GridLayout(1, 2));
		
		colorPanel = new ColorPanel(pMainWindows);
		add(colorPanel);
		
		JPanel panelOptionsMain = new JPanel();
		panelOptionsMain.setLayout(new GridLayout(1, 2));
		
		JPanel panelOptionsTools = new JPanel();
		panelOptionsTools.setLayout(new GridLayout(3, 3));
		panelOptionsMain.add(panelOptionsTools);
		
		btEraser = new JButton("E");
		btEraser.setActionCommand(Constants.BT_ERASER);
		btEraser.addActionListener(mainWindow.getActionListener());
		panelOptionsTools.add(btEraser);
		
		btSmooth = new JButton("S");
		btSmooth.setActionCommand(Constants.BT_SMOOTH);
		btSmooth.addActionListener(mainWindow.getActionListener());
		panelOptionsTools.add(btSmooth);
		
		btNewDraw = new JButton("ND");
		btNewDraw.setActionCommand(Constants.BT_NEWDRAW);
		btNewDraw.addActionListener(mainWindow.getActionListener());
		panelOptionsTools.add(btNewDraw);
		
		btSelectColor = new JButton("SC");
		btSelectColor.setActionCommand(Constants.BT_SELECTCOLOR);
		btSelectColor.addActionListener(mainWindow.getActionListener());
		panelOptionsTools.add(btSelectColor);
		
		btSave = new JButton("SAVE");
		btSave.setActionCommand(Constants.BT_SAVE);
		btSave.addActionListener(mainWindow.getActionListener());
		panelOptionsTools.add(btSave);
		
		btLoad = new JButton("LOAD");
		btLoad.setActionCommand(Constants.BT_LOAD);
		btLoad.addActionListener(mainWindow.getActionListener());
		panelOptionsTools.add(btLoad);
		
		btOptions = new JButton("Opciones");
		btOptions.setActionCommand(Constants.BT_OPTIONS);
		btOptions.addActionListener(mainWindow.getActionListener());
		panelOptionsMain.add(btOptions);
		
		add(panelOptionsMain);
		
	}
	
}
