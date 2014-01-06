import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JSeparator;



public class QuestionXYPanel extends JPanel {
	/*
	 * Private Constant
	 */
	Postulante postulante;
	private JComboBox respuesta;
	private JLabel lblPostulante;
	private JButton btnContinuar;
	private JComboBox respuesta_2;
	private JComboBox respuesta_3;
	private JComboBox respuesta_4;
	private JComboBox respuesta_5;
	private JComboBox respuesta_6;
	private JComboBox respuesta_7;
	private JComboBox respuesta_8;
	private JComboBox respuesta_9;
	private JComboBox respuesta_10;
	
	

	
	/**
	 * Create the panel.
	 */
	public QuestionXYPanel(Postulante postulante) {
		setToolTipText("Seleccione una respuesta");
		
		this.postulante=postulante;
		this.postulante.insert(10);
		
		setForeground(Color.GRAY);
		setAutoscrolls(true);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1.- Al terminar de comer, usted: ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(12, 29, 228, 15);
		add(lblNewLabel);
		
		JLabel lblAnteUn = new JLabel("<html>2.- Ante un desperfecto dom&eacute;stico, usted:</html>");
		lblAnteUn.setForeground(Color.BLACK);
		lblAnteUn.setBounds(12, 69, 270, 15);
		add(lblAnteUn);
		
		JLabel lblEnUn = new JLabel("3.- En un trabajo en equipo, usted:");
		lblEnUn.setForeground(Color.BLACK);
		lblEnUn.setBounds(10, 102, 228, 15);
		add(lblEnUn);
		
		JLabel lblParaCumplir = new JLabel("4.- Para cumplir una meta en el trabajo, usted:");
		lblParaCumplir.setBounds(22, 132, 260, 15);
		add(lblParaCumplir);
		
		JLabel lblSiUsted = new JLabel("5.- si usted sabe como realizar una tarea");
		lblSiUsted.setBounds(22, 158, 228, 15);
		add(lblSiUsted);
		
		JLabel lblAlPresenciar = new JLabel("<html>6.- Al presenciar un choque automovil&iacute;stico:</html>");
		lblAlPresenciar.setVerticalAlignment(SwingConstants.TOP);
		lblAlPresenciar.setBounds(22, 184, 228, 15);
		add(lblAlPresenciar);
		
		JLabel lblCuandoLe_1 = new JLabel("7.- Cuando le asignan un trabajo:");
		lblCuandoLe_1.setForeground(Color.BLACK);
		lblCuandoLe_1.setBounds(22, 210, 228, 15);
		add(lblCuandoLe_1);
		
		JLabel lblUstedDebe = new JLabel("<html>8.- Usted debe realizar un trabajo del cual <br> no posee experiencia sin embargo este <br> debe ser entregado a la brevedad:</html>");
		lblUstedDebe.setVerticalTextPosition(SwingConstants.TOP);
		lblUstedDebe.setVerticalAlignment(SwingConstants.TOP);
		lblUstedDebe.setBounds(22, 236, 228, 62);
		add(lblUstedDebe);
		
		JLabel label_2 = new JLabel("9.- En un grupo dividido por opiniones usted:");
		label_2.setBounds(22, 302, 228, 15);
		add(label_2);
		
		JLabel lblCuandoLe = new JLabel("10.- En un deporte:");
		lblCuandoLe.setBounds(22, 344, 228, 15);
		add(lblCuandoLe);
		
		respuesta = new JComboBox();
		respuesta.setModel(new DefaultComboBoxModel(new String[] {"Reposa", "Retira la Mesa"}));
		respuesta.addItemListener(new EventListener(0,postulante,respuesta));
		respuesta.setBounds(294, 25, 349, 22);
		add(respuesta);
		
		respuesta_2 = new JComboBox();
		respuesta_2.setModel(new DefaultComboBoxModel(new String[] {"<html>Pide asistencia t&eacute;cnica</html>", "Se instruye y lo repara usted mismo"}));
		respuesta_2.addItemListener(new EventListener(1,postulante,respuesta_2));
		respuesta_2.setBounds(294, 65, 349, 22);
		add(respuesta_2);
		
		respuesta_3 = new JComboBox();
		respuesta_3.setModel(new DefaultComboBoxModel(new String[] {"Espera a que un compa\u00F1ero asuma el liderazgo ", "Usted asume el liderazgo de el equipo de trabajo"}));
		respuesta_3.addItemListener(new EventListener(2,postulante,respuesta_3));
		respuesta_3.setBounds(292, 98, 349, 22);
		add(respuesta_3);
		
		respuesta_4 = new JComboBox();
		respuesta_4.setModel(new DefaultComboBoxModel(new String[] {"Las realiza segun fecha estipulada ", "Las realiza segun tareas cumplidas"}));
		respuesta_4.addItemListener(new EventListener(3,postulante,respuesta_4));
		respuesta_4.setBounds(304, 128, 349, 22);
		add(respuesta_4);
		
		respuesta_5 = new JComboBox();
		respuesta_5.setFont(new Font("Arial", Font.PLAIN, 11));
		respuesta_5.setModel(new DefaultComboBoxModel(new String[] {"Acepta de buena manera", "Le molesta que su superior le diga como reaizarla"}));
		respuesta_4.addItemListener(new EventListener(4,postulante,respuesta_5));
		respuesta_5.setBounds(304, 154, 349, 22);
		add(respuesta_5);
		
		respuesta_6 = new JComboBox();
		respuesta_6.setModel(new DefaultComboBoxModel(new String[] {"Espera a una ambulancia", "Ayuda a los afectados con sus propios medios."}));
		respuesta_6.addItemListener(new EventListener(5,postulante,respuesta_6));
		respuesta_6.setBounds(304, 180, 349, 22);
		add(respuesta_6);
		
		respuesta_7 = new JComboBox();
		respuesta_7.setModel(new DefaultComboBoxModel(new String[] {"Prefiere un plazo establecido", "Prefiere solo un indicio de el plazo establecido"}));
		respuesta_7.addItemListener(new EventListener(6,postulante,respuesta_7));
		respuesta_7.setBounds(304, 206, 349, 22);
		add(respuesta_7);
		
		respuesta_8 = new JComboBox();
		respuesta_8.setModel(new DefaultComboBoxModel(new String[] {"<html>Pedir&aacute; ayuda a alguien con experiencia aunque esto retrase la entrega</html>", "Intenta hacerlo por su cuenta entregando el trabajo a tiempo"}));
		respuesta_8.addItemListener(new EventListener(7,postulante,respuesta_8));
		respuesta_8.setBounds(304, 239, 349, 22);
		add(respuesta_8);
		
		respuesta_9 = new JComboBox();
		respuesta_9.setModel(new DefaultComboBoxModel(new String[] {"Espera a escuchar todas las ideas y que los dem\u00E1s decidan que es lo mejor", "Act\u00FAa como intermediario para que  el grupo pueda llegar a un acuerdo"}));
		respuesta_9.addItemListener(new EventListener(8,postulante,respuesta_9));
		respuesta_9.setBounds(304, 298, 349, 22);
		add(respuesta_9);
		
		respuesta_10 = new JComboBox();
		respuesta_10.setModel(new DefaultComboBoxModel(new String[] {"Ser parte del equipo", "<html>Prefiere ser director t&eacute;cnico del equipo</html>"}));
		respuesta_10.addItemListener(new EventListener(9,postulante,respuesta_10));
		respuesta_10.setBounds(304, 340, 349, 22);
		add(respuesta_10);
		
		lblPostulante = new JLabel("Postulante");
		lblPostulante.setBounds(22, 368, 560, 14);
		add(lblPostulante);
		
		btnContinuar = new JButton("Mostrar Parametros");
		btnContinuar.addActionListener(new buttonListener(postulante,lblPostulante));
		btnContinuar.setBounds(416, 393, 179, 30);
		add(btnContinuar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 55, 554, 8);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 95, 554, 8);
		add(separator_1);

	}
}
