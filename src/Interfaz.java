import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;


public class Interfaz {

	private JFrame frame;
	private int seccion;
	private Postulante postulante;
	private JPanel panel_1;
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
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 717, 502);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		DataPanel dataPanel = new DataPanel();
		dataPanel.setBounds(358, 5, 1, 1);
		DataPanel dataPanel_1 = new DataPanel();
		dataPanel_1.setBounds(0, 0, 717, 502);
		panel_1.add((JPanel) dataPanel_1);
		
		JButton btnComenzar = new JButton("Comenzar");
		btnComenzar.setBounds(553, 514, 152, 23);
		btnComenzar.addActionListener(new ButtonListener(this.postulante,btnComenzar,this.seccion,this.panel_1));
		frame.getContentPane().add(btnComenzar);
		
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 721, 598);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		this.seccion=0;
		
		this.postulante=new Postulante();
	}
	
	
}


	