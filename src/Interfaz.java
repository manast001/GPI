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
	public DataPanel dPanel;
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
	public void consulta(){
		List<Integer> lista =new ArrayList<Integer>();
		List<String> opera =new ArrayList<String>();
		//nivel operacional
		opera.add("Vendedor");
		opera.add("Programador");
		opera.add("Secretaria");
		opera.add("Recepcionista");
		opera.add("Bodega");
		opera.add("Guardia");
		double coincidenciaVendedor=66.6;
		double coincidenciaProgramador=71.4;
		double coincidenciaSecretaria=62.5;
		double coincidenciaRecepcionista=57.1;
		double coincidenciaBodega=66.6;
		double coincidenciaGuardia=55.5;
		//vendedor
		lista.add(4);
		lista.add(8);
		lista.add(3);
		lista.add(14);
		lista.add(16);
		lista.add(35);
		cargo.addNewOperational(lista,(int) coincidenciaVendedor, opera.get(0));
		//programador
		lista=new ArrayList<Integer>();
		lista.add(1);
		lista.add(7);
		lista.add(2);
		lista.add(23);
		lista.add(15);
		lista.add(37);
		lista.add(39);
		cargo.addNewOperational(lista,(int) coincidenciaProgramador, opera.get(1));
		//Secretaria
		lista=new ArrayList<Integer>();
		lista.add(8);
		lista.add(13);
		lista.add(2);
		lista.add(15);
		lista.add(16);
		lista.add(38);
		lista.add(35);
		lista.add(39);
		cargo.addNewOperational(lista,(int) coincidenciaSecretaria, opera.get(2));
		//Recepcionista
		lista=new ArrayList<Integer>();
		lista.add(4);
		lista.add(8);
		lista.add(13);
		lista.add(2);
		lista.add(14);
		lista.add(16);
		lista.add(39);
		cargo.addNewOperational(lista,(int) coincidenciaRecepcionista, opera.get(3));
		//Bodega
		lista=new ArrayList<Integer>();
		lista.add(2);
		lista.add(7);
		lista.add(33);
		lista.add(34);
		lista.add(39);
		lista.add(35);
		cargo.addNewOperational(lista,(int) coincidenciaBodega, opera.get(4));
		//Guardia
		lista=new ArrayList<Integer>();
		lista.add(7);
		lista.add(12);
		lista.add(13);
		lista.add(34);
		lista.add(18);
		lista.add(25);
		lista.add(39);
		lista.add(35);
		lista.add(38);
		cargo.addNewOperational(lista,(int) coincidenciaGuardia, opera.get(5));
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
		
		dPanel=new DataPanel();
		tabbedPane.addTab("Datos Iniciales",(JPanel)dPanel);
	}
	public void reinicializate()
	{
		this.postulante=new Postulante();
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


	
