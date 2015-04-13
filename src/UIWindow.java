import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * The window class for Super Tic-Tac-Toe
 * @author Jonathan
 */
public class UIWindow implements WindowListener
{
	private final JFrame mainWindow;
	
	private JPanel currentPanel;
	
	private final History history;
	
	/**
	 * This holds the running instance of the UIWindow.
	 */
	private static UIWindow currentInstance;
	
	private UIWindow()
	{
		mainWindow = new JFrame("Super Tic-Tac-Toe");
		
		mainWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		mainWindow.addWindowListener(this);
		
		this.history = new History();
	}
	
	public static UIWindow getInstance()
	{
		if(currentInstance == null)
		{
			currentInstance = new UIWindow();
		}
		
		return currentInstance;
	}
	
	public static History getHistoryInstance()
	{
		return getInstance().history;
	}
	
	public void show()
	{
		if(this.mainWindow != null && !this.mainWindow.isVisible())
		{
			this.mainWindow.setVisible(true);
		}
	}
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
		UIWindow program = UIWindow.getInstance();
		program.show();
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		//Not Used Currently.
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		//Call history save function.
		
		this.mainWindow.setVisible(false);
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		//Not Used Currently.
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		//Not Used Currently.
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		//Not Used Currently.
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		//Not Used Currently.
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		//Not Used Currently.
	}

}
