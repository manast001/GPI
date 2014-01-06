import java.awt.EventQueue;


public class Interfaz {

	private JFrame frame;
	private int seccion;
	private Postulante postulante;
	public JTabbedPane tabbedPane;
	public DataPanel dPanel;
	public Cargo cargo;
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

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
		
		//JButton btnComenzar = new JButton("Comenzar");
		//btnComenzar.setBounds(796, 761, 152, 23);
		//btnComenzar.addActionListener(new ButtonListener(this.postulante,btnComenzar,this.seccion,this));
		//frame.getContentPane().add(btnComenzar);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 948, 750);
		frame.getContentPane().add(tabbedPane);
		
		dPanel=new DataPanel();
		tabbedPane.addTab("Datos Iniciales",(JPanel)new CargoCaracteristicas());
	}
	public void reinicializate()
	{
		this.postulante=new Postulante();
		tabbedPane.addTab("Datos Iniciales",(JPanel) CargoCaracteristicas());
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 974, 833);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		this.seccion=0;
		this.cargo=new Cargo();
		this.postulante=new Postulante();
	}
}


	
