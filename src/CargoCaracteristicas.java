import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class CargoCaracteristicas extends JPanel {

	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JTextPane textPane_2;
	private JTextPane textPane_1;
	private JTextPane textPane;

	/**
	 * Create the panel.
	 */
	public CargoCaracteristicas() {
		setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(470, 127, -92, 82);
		add(textArea);
		
		textPane = new JTextPane();
		textPane.setBounds(248, 129, 168, 141);
		add(textPane);
		
		textPane_1 = new JTextPane();
		textPane_1.setBounds(604, 129, 168, 141);
		add(textPane_1);
		
		textPane_2 = new JTextPane();
		textPane_2.setBounds(426, 129, 168, 141);
		add(textPane_2);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new trabajoListener(comboBox_1,textPane,textPane_1,textPane_2));
		
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Seleccione  Nivel"}));
		comboBox_1.setBounds(10, 205, 197, 20);
		add(comboBox_1);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new nivelListener(comboBox,comboBox_1));
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nivel estrategico", "Nivel T\u00E0ctico", "Nivel Operacional"}));
		comboBox.setBounds(10, 129, 197, 20);
		add(comboBox);
		
		
		
		JLabel lblNivelOrganizacional = new JLabel("Nivel organizacional");
		lblNivelOrganizacional.setBounds(10, 104, 116, 14);
		add(lblNivelOrganizacional);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(10, 180, 116, 14);
		add(lblCargo);
		
		JLabel lblNewLabel = new JLabel("Parametros segun Rol");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setBounds(248, 11, 370, 41);
		add(lblNewLabel);
		
		JLabel lblHabilidades = new JLabel("Habilidades");
		lblHabilidades.setBounds(300, 104, 78, 14);
		add(lblHabilidades);
		
		JLabel lblNecesidades = new JLabel("Necesidades");
		lblNecesidades.setBounds(477, 104, 88, 14);
		add(lblNecesidades);
		
		JLabel lblCompetencias = new JLabel("Competencias");
		lblCompetencias.setBounds(646, 104, 98, 14);
		add(lblCompetencias);

	}
}
