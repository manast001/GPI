import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;


public class OperationalPanel extends JPanel {
	
    private Postulante postulante;
    private JComboBox comboBox,comboBox_1,comboBox_2,comboBox_3,comboBox_4,comboBox_5;
    private JComboBox comboBox_6,comboBox_7,comboBox_8,comboBox_9,comboBox_10,comboBox_11;
    private JComboBox comboBox_12,comboBox_13,comboBox_14,comboBox_15,comboBox_16,comboBox_17;
    private JComboBox comboBox_18,comboBox_19;
    /**
* Create the panel.
*/
	public OperationalPanel(Postulante postulante) {
		this.postulante=postulante;
		this.postulante.insert(20);
		setLayout(null);
		
		JLabel lblAnteUna = new JLabel("1.- Ante una exposici\u00F3n ud busca:");
		lblAnteUna.setForeground(Color.BLACK);
		lblAnteUna.setBounds(38, 30, 228, 15);
		add(lblAnteUna);
		
		JLabel lblConSus = new JLabel("<html>2.- Con sus compa\u00F1eros de trabajo, usted prefiere :</html>");
		lblConSus.setForeground(Color.BLACK);
		lblConSus.setBounds(38, 63, 299, 15);
		add(lblConSus);
		
		JLabel lblEnUn = new JLabel("3.- En un grupo de trabajo, prefiere que el cumplimiento de las metas sea recompensado seg\u00FAn...\r\n");
		lblEnUn.setForeground(Color.BLACK);
		lblEnUn.setBounds(38, 94, 301, 15);
		add(lblEnUn);
		
		JLabel lblUstedAnte = new JLabel("<html>4.-  Usted, ante un problema determinado\u2026</html>");
		lblUstedAnte.setBounds(38, 127, 299, 25);
		add(lblUstedAnte);
		
		JLabel lblsSusCompaeros = new JLabel("5.-S\u00ED sus compa\u00F1eros planean realizar una actividad sindical en el trabajo\u2026\r\n");
		lblsSusCompaeros.setBounds(38, 164, 299, 15);
		add(lblsSusCompaeros);
		
		JLabel lblParaResolver = new JLabel("<html>6.- Para resolver una discusi\u00F3n del grupo de trabajo, usted\u2026:</html>");
		lblParaResolver.setVerticalAlignment(SwingConstants.TOP);
		lblParaResolver.setBounds(38, 201, 299, 15);
		add(lblParaResolver);
		
		JLabel lblAnteEl = new JLabel("7.- Ante el inminente incumplimiento de los plazos del grupo de trabajo\u2026:\r\n");
		lblAnteEl.setForeground(Color.BLACK);
		lblAnteEl.setBounds(38, 238, 299, 15);
		add(lblAnteEl);
		
		JLabel lblEnUn_1 = new JLabel("<html>8.- En un grupo de trabajo prefiere:</html>");
		lblEnUn_1.setVerticalTextPosition(SwingConstants.TOP);
		lblEnUn_1.setVerticalAlignment(SwingConstants.TOP);
		lblEnUn_1.setBounds(38, 287, 299, 62);
		add(lblEnUn_1);
		
		JLabel lblEnSu = new JLabel("<html>9.- En su tiempo libre prefiere:</html>");
		lblEnSu.setBounds(38, 316, 312, 25);
		add(lblEnSu);
		
		JLabel lblenUnGrupo = new JLabel("10.-En un grupo de personas usted prefiere:\r\n");
		lblenUnGrupo.setBounds(38, 352, 299, 15);
		add(lblenUnGrupo);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Generar impacto en los asistentes", "Lograr que lo que se expone sea entendido por los asistentes"}));
        comboBox.addItemListener(new EventListener(0,postulante,comboBox));
		comboBox.setBounds(347, 26, 374, 22);
		add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"establecer relaciones puntualmente en relaci\u00F3n al desarrollo de las actividades ", "establecer relaciones socialmente cercanas ", "", ""}));
        comboBox_1.addItemListener(new EventListener(1,postulante,comboBox_1));
		comboBox_1.setBounds(347, 60, 374, 22);
		add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Mejor rendimiento individual ", "Previo acuerdo con su superior "}));
        comboBox_2.addItemListener(new EventListener(2,postulante,comboBox_2));
		comboBox_2.setBounds(347, 93, 372, 22);
		add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Se enfoca en las causas", "Busca variables asociadas y las subdivide"}));
        comboBox_3.addItemListener(new EventListener(3,postulante,comboBox_3));
        comboBox_3.setFont(new Font("Dialog", Font.BOLD, 12));
		comboBox_3.setBounds(347, 131, 374, 22);
		add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Participa de sus actividades laborales y luego seinvolucra en \u00E9sta", "Participa y ayuda a coordinar los preparativos de \u00E9sta"}));
        comboBox_4.addItemListener(new EventListener(4,postulante,comboBox_4));
        comboBox_4.setBounds(347, 167, 374, 22);
		add(comboBox_4);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Resuelve zanjar la discusi\u00F3n imponiendo una soluci\u00F3n arbitraria", "Acuerda  a las partes a buscar una soluci\u00F3n equitativa"}));
        comboBox_5.addItemListener(new EventListener(5,postulante,comboBox_5));
        comboBox_5.setBounds(347, 204, 374, 22);
		add(comboBox_5);
		
		comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Atribuye la responsabilidad del incumplimiento a los culpables respectivos", "Realiza las actividades ajenas a su responsabilidad para cumplir lo establecido"}));
        comboBox_6.addItemListener(new EventListener(6,postulante,comboBox_6));
        comboBox_6.setBounds(347, 239, 374, 33);
		add(comboBox_6);
		
		comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Ser el l\u00EDder para imponer sus ideas", "Aportar desde afuera para dar otro punto de vista a los l\u00EDderes"}));
        comboBox_7.addItemListener(new EventListener(7,postulante,comboBox_7));
        comboBox_7.setBounds(347, 283, 374, 22);
		add(comboBox_7);
		
		comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Disfrutar a solas", "Compartir con sus amigos", ""}));
        comboBox_8.addItemListener(new EventListener(8,postulante,comboBox_8));
        comboBox_8.setBounds(347, 317, 374, 22);
		add(comboBox_8);
		
		comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Ser el l\u00EDder para imponer sus ideas", "Aportar desde afuera para dar otro punto de vista a los l\u00EDderes"}));
        comboBox_9.addItemListener(new EventListener(9,postulante,comboBox_9));
    	comboBox_9.setBounds(347, 348, 374, 22);
		add(comboBox_9);
		
		JLabel lblUstedPrefierePensar = new JLabel("11.- Usted prefiere pensar m\u00E1s en:\r\n");
		lblUstedPrefierePensar.setBounds(38, 378, 299, 15);
		add(lblUstedPrefierePensar);
		
		comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"Un presente vivido", "Un futuro prometedor"}));
        comboBox_10.addItemListener(new EventListener(10,postulante,comboBox_10));
        comboBox_10.setBounds(347, 381, 374, 22);
		add(comboBox_10);
		
		JLabel lbltrabajaBien = new JLabel("12.- \u00BFTrabaja bien bajo presi\u00F3n? :\r\n");
		lbltrabajaBien.setBounds(38, 414, 299, 15);
		add(lbltrabajaBien);
		
		comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
        comboBox_11.addItemListener(new EventListener(11,postulante,comboBox_11));
        comboBox_11.setBounds(347, 410, 374, 22);
		add(comboBox_11);
		
		JLabel lblUstedSuele = new JLabel("13.- Usted suele\u2026\r\n");
		lblUstedSuele.setBounds(38, 440, 299, 15);
		add(lblUstedSuele);
		
		comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"Retrasarse a un evento de poca importancia", "Llegar a tiempo a un evento de importancia"}));
        comboBox_12.addItemListener(new EventListener(12,postulante,comboBox_12));
        comboBox_12.setBounds(347, 436, 374, 22);
		add(comboBox_12);
		
		JLabel lblCuandoEl = new JLabel("14.- Cuando el tel\u00E9fono suena, usted\u2026\r\n");
		lblCuandoEl.setBounds(38, 468, 299, 15);
		add(lblCuandoEl);
		
		comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"Espera aque alguien m\u00E1s conteste", "Se apura por llegar primero y contestar"}));
        comboBox_13.addItemListener(new EventListener(13,postulante,comboBox_13));
        comboBox_13.setBounds(347, 469, 374, 22);
		add(comboBox_13);
		
		JLabel lblAlOcasionar = new JLabel("15.- Al ocasionar un problema\u2026");
		lblAlOcasionar.setBounds(38, 504, 299, 15);
		add(lblAlOcasionar);
		
		comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"Prefiere investigar bien para saber si es realmente su culpa", "Asume que fue directamente su culpa"}));
        comboBox_14.addItemListener(new EventListener(14,postulante,comboBox_14));
        comboBox_14.setBounds(347, 502, 374, 22);
		add(comboBox_14);
		
		JLabel lblSiDebe = new JLabel("16.- Si debe asignar una tarea a alguien:\r\n");
		lblSiDebe.setBounds(38, 544, 299, 15);
		add(lblSiDebe);
		
		comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"Lo deja moderadamente solo para evitar roces", "Lo vigila moderadamente para evitar errores"}));
        comboBox_15.addItemListener(new EventListener(15,postulante,comboBox_15));
        comboBox_15.setBounds(347, 535, 374, 22);
		add(comboBox_15);
		
		JLabel lblAlHacer = new JLabel("17.- Al hacer cosas de rutina, sueles\u20260\r\n\r\n");
		lblAlHacer.setBounds(38, 584, 299, 15);
		add(lblAlHacer);
		
		comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"Hacerlas a tu manera ", "Hacerlas de la manera usual "}));
        comboBox_16.addItemListener(new EventListener(16,postulante,comboBox_16));
        comboBox_16.setBounds(347, 568, 374, 22);
		add(comboBox_16);
		
		JLabel lblTeVes = new JLabel("18.- Te ves a ti mismo como\u2026\r\n\r\n");
		lblTeVes.setBounds(38, 610, 299, 15);
		add(lblTeVes);
		
		comboBox_17 = new JComboBox();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"Una persona no organizada ni esquematizada", "Una persona organizada y esquematizada"}));
        comboBox_17.addItemListener(new EventListener(17,postulante,comboBox_17));
        comboBox_17.setBounds(347, 601, 374, 22);
		add(comboBox_17);
		
		JLabel lblSuNivel = new JLabel("19.- Su nivel de estudio comprende\r\n\r\n\r\n");
		lblSuNivel.setBounds(38, 647, 299, 15);
		add(lblSuNivel);
		
		comboBox_18 = new JComboBox();
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"1ero a 8vo b\u00E1sico", "Ense\u00F1anza media o superior completa"}));
        comboBox_18.addItemListener(new EventListener(18,postulante,comboBox_18));
        comboBox_18.setBounds(347, 634, 374, 22);
		add(comboBox_18);
		
		JLabel lblQueEs = new JLabel("20.- Que es m\u00E1s admirable\u2026\r\n\r\n\r\n\r\n");
		lblQueEs.setBounds(38, 673, 299, 15);
		add(lblQueEs);
		
		comboBox_19 = new JComboBox();
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"La habilidad para adaptarse y arreglarse con lo que hay", "La habilidad para organizar y ser met\u00F3dico"}));
        comboBox_19.addItemListener(new EventListener(19,postulante,comboBox_19));
        comboBox_19.setBounds(347, 667, 374, 22);
		add(comboBox_19);
	}
}
