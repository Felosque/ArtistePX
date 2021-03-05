package artistepx.interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import artistepx.logic.Constants;

public class ActionListenerUI implements ActionListener{

	private MainWindow mainWindow;
	
	public ActionListenerUI(MainWindow pMainWindows) {
		mainWindow = pMainWindows;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if(command.equals(Constants.BT_NEWDRAW)){
			mainWindow.newDraw();
		}
		else if(command.equals(Constants.BT_ERASER)){
			mainWindow.setEraser();
		}
		else if(command.equals(Constants.BT_OPTIONS)){
			
		}
		else if(command.equals(Constants.BT_SMOOTH)){
			mainWindow.setSmooth();
		}
		else if(command.equals(Constants.BT_SELECTCOLOR)){
			mainWindow.setSelectColor();
		}
		else if(command.equals(Constants.BT_SAVE)){
			mainWindow.saveDraw();
		}
		else if(command.equals(Constants.BT_LOAD)){
			mainWindow.loadDraw();
		}
		
	}

}







