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
	public JTabbedPane tabbedPane;
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
		
		JButton btnComenzar = new JButton("Comenzar");
		btnComenzar.setBounds(553, 514, 152, 23);
		btnComenzar.addActionListener(new ButtonListener(this.postulante,btnComenzar,this.seccion,this));
		frame.getContentPane().add(btnComenzar);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 717, 484);
		frame.getContentPane().add(tabbedPane);
		
		tabbedPane.addTab("Datos Iniciales",(JPanel) new DataPanel());
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


	