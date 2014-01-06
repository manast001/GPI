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
		cargo.addNewOperational(lista,coincidenciaVendedor, opera.get(0));
		//programador
		lista=new ArrayList<Integer>();
		lista.add(1);
		lista.add(7);
		lista.add(2);
		lista.add(23);
		lista.add(15);
		lista.add(37);
		lista.add(39);
		cargo.addNewOperational(lista,coincidenciaProgramador, opera.get(1));
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
		cargo.addNewOperational(lista,coincidenciaSecretaria, opera.get(2));
		//Recepcionista
		lista=new ArrayList<Integer>();
		lista.add(4);
		lista.add(8);
		lista.add(13);
		lista.add(2);
		lista.add(14);
		lista.add(16);
		lista.add(39);
		cargo.addNewOperational(lista,coincidenciaRecepcionista, opera.get(3));
		//Bodega
		lista=new ArrayList<Integer>();
		lista.add(2);
		lista.add(7);
		lista.add(33);
		lista.add(34);
		lista.add(39);
		lista.add(35);
		cargo.addNewOperational(lista,coincidenciaBodega, opera.get(4));
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
		cargo.addNewOperational(lista,coincidenciaGuardia, opera.get(5));
		//Nivel tactico
		//jefe de RRHH
		String jeferrhh="JefeRRHH";
	 	double coincidenciajeferrhh=62.5;
	 	lista=new ArrayList<Integer>();
	 	lista.add(0);
	 	lista.add(2);
	 	lista.add(12);
	 	lista.add(13);
	 	lista.add(31);
	 	lista.add(27);
	 	lista.add(39);
	 	lista.add(35);
	 	cargo.addNewOperational(lista, coincidenciajeferrhh, jeferrhh);
	 	
	 	//Director de finanzas
	 	String dirfinanzas="DirectorFinanzas";
	 	double coincidenciadirfinanzas=62.5;
	 	lista=new ArrayList<Integer>();
	 	lista.add(1);
	 	lista.add(3);
	 	lista.add(7);
	 	lista.add(29);
	 	lista.add(23);
	 	lista.add(39);
	 	lista.add(37);
	 	lista.add(36);
	 	cargo.addNewOperational(lista, coincidenciadirfinanzas, dirfinanzas);
	 	
	 	//Director de produccion
	 	String dirproduccion="DirectorProduccion";
	 	double coincidenciadirproduccion=62.5;
	 	lista=new ArrayList<Integer>();
	 	lista.add(1);
	 	lista.add(9);
	 	lista.add(11);
	 	lista.add(29);
	 	lista.add(28);
	 	lista.add(34);
	 	lista.add(39);
	 	lista.add(36);
	 	cargo.addNewOperational(lista, coincidenciadirproduccion, dirproduccion);
	 	
	 	//Director de informatica
	 	String dirinformatica="DirectorInformatica";
	 	double coincidenciadirinformatica=62.5;
	 	lista=new ArrayList<Integer>();
	 	lista.add(1);
	 	lista.add(3);
	 	lista.add(7);
	 	lista.add(19);
	 	lista.add(29);
	 	lista.add(22);
	 	lista.add(39);
	 	lista.add(37);
	 	cargo.addNewOperational(lista, coincidenciadirinformatica, dirinformatica);
	 	
	 	//Jefe de seccion
	 	String jefeseccion="JefeSeccion";
	 	double coincidenciajefeseccion=62.5;
	 	lista=new ArrayList<Integer>();
	 	lista.add(12);
	 	lista.add(7);
	 	lista.add(13);
	 	lista.add(29);
	 	lista.add(31);
	 	lista.add(24);
	 	lista.add(39);
	 	lista.add(38);
	 	cargo.addNewOperational(lista, coincidenciajefeseccion, jefeseccion);
	 	
	 	//Jefe de proyecto
	 	String jefeproyecto="JefeProyecto";
	 	double coincidenciajefeproyecto=71.4;
	 	lista=new ArrayList<Integer>();
	 	lista.add(1);
	 	lista.add(4);
	 	lista.add(12);
	 	lista.add(19);
	 	lista.add(29);
	 	lista.add(39);
	 	lista.add(35);
	 	cargo.addNewOperational(lista, coincidenciajefeproyecto, jefeproyecto);
	 	
	 	//Nivel estrategico
	 	//gerente general
	 	String GerenteGeneral="GerenteGeneral";
	 	double coincidenciaGerenteGeneral=90.9;
	 	lista=new ArrayList<Integer>();
	 	lista.add(6);
	 	lista.add(11);
	 	lista.add(4);
	 	lista.add(9);
	 	lista.add(20);
	 	lista.add(29);
	 	lista.add(32);
	 	lista.add(18);
	 	lista.add(24);
	 	lista.add(39);
	 	lista.add(36);
	 	cargo.addNewOperational(lista, coincidenciaGerenteGeneral, GerenteGeneral);
	 	
	 	//gerente de finanzas
	 	String GerenteFinanzas="GerenteFinanzas";
	 	double coincidenciaGerenteFinanzas=87.5;
	 	lista=new ArrayList<Integer>();
	 	lista.add(1);
	 	lista.add(3);
	 	lista.add(7);
	 	lista.add(13);
	 	lista.add(34);
	 	lista.add(39);
	 	lista.add(38);
	 	lista.add(36);
	 	cargo.addNewOperational(lista, coincidenciaGerenteFinanzas, GerenteFinanzas);
	 	
	 	//Gerente de marketing
	 	String GerenteMarketing="GerenteMarketing";
	 	double coincidenciaGerenteMarketing=80;
	 	lista=new ArrayList<Integer>();
	 	lista.add(4);
	 	lista.add(8);
	 	lista.add(3);
	 	lista.add(13);
	 	lista.add(19);
	 	lista.add(20);
	 	lista.add(26);
	 	lista.add(31);
	 	lista.add(39);
	 	lista.add(36);
	 	cargo.addNewOperational(lista, coincidenciaGerenteMarketing, GerenteMarketing);
	 	
	 	//Gerente de ventas
	 	String GerenteVentas="GerenteVentas";
	 	double coincidenciaGerenteVentas=90;
	 	lista=new ArrayList<Integer>();
	 	lista.add(1);
	 	lista.add(7);
	 	lista.add(13);
	 	lista.add(5);
	 	lista.add(29);
	 	lista.add(31);
	 	lista.add(24);
	 	lista.add(22);
	 	lista.add(39);
	 	lista.add(36);
	 	cargo.addNewOperational(lista, coincidenciaGerenteVentas, GerenteVentas);
	 	
	 	//Gerente de producion
	 	String GerenteProduccion="GerenteProduccion";
	 	double coincidenciaGerenteProduccion=87.5;
	 	lista=new ArrayList<Integer>();
	 	lista.add(7);
	 	lista.add(13);
	 	lista.add(12);
	 	lista.add(22);
	 	lista.add(30);
	 	lista.add(33);
	 	lista.add(39);
	 	lista.add(38);
	 	cargo.addNewOperational(lista, coincidenciaGerenteProduccion, GerenteProduccion);
	 	
	 	//Presidente del directorio
	 	String PresidenteDirectorio="PresidenteDirectorio";
	 	double coincidenciaPresidenteDirectorio=100;
	 	lista=new ArrayList<Integer>();
	 	lista.add(1);
	 	lista.add(4);
	 	lista.add(8);
	 	lista.add(5);
	 	lista.add(9);
	 	lista.add(11);
	 	lista.add(13);
	 	lista.add(17);
	 	lista.add(19);
	 	lista.add(20);
	 	lista.add(22);
	 	lista.add(24);
	 	lista.add(39);
	 	lista.add(38);
	 	cargo.addNewOperational(lista, coincidenciaPresidenteDirectorio, PresidenteDirectorio);
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


	
