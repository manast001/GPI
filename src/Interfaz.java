import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;


public class Interfaz {

	private JFrame frame;
	private JTabbedPane principalPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Public Method 
	 */
	
	public void insertPanel(String tittle,JPanel panel)
	{
		principalPanel.addTab(tittle,panel);
	}
	
	public void removePanelByIndex(int index)
	{
		principalPanel.removeTabAt(index);
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
		
		this.insertPanel("Datos",(JPanel) new DataPanel());
		this.insertPanel("Graficos",(JPanel) new GraphicsPanel());
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 685, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		principalPanel = new JTabbedPane(JTabbedPane.TOP);
		principalPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		principalPanel.setBounds(6, 6, 663, 501);
		frame.getContentPane().add(principalPanel);
	}
	
	
}


	