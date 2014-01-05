import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;



public class QuestionXYPanel extends JPanel {
	/*
	 * Private Constant
	 */
	Postulante postulante;

	
	/**
	 * Create the panel.
	 */
	public QuestionXYPanel(Postulante postulante) {
		
		this.postulante=postulante;
		
		setForeground(Color.GRAY);
		setAutoscrolls(true);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1.- Al terminar de comer, usted: ");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(12, 32, 228, 15);
		add(lblNewLabel);
		
		JLabel lblAnteUn = new JLabel("2.- ante un desperfecto doméstico, usted:");
		lblAnteUn.setForeground(Color.BLACK);
		lblAnteUn.setBounds(12, 78, 306, 15);
		add(lblAnteUn);
		
		JLabel lblEnUn = new JLabel("3.- En un trabajo en equipo, usted:");
		lblEnUn.setForeground(Color.BLACK);
		lblEnUn.setBounds(12, 105, 306, 15);
		add(lblEnUn);
		
		JLabel lblParaCumplir = new JLabel("4.- Para cumplir una meta en el trabajo, usted:");
		lblParaCumplir.setBounds(12, 132, 336, 15);
		add(lblParaCumplir);
		
		JLabel lblSiUsted = new JLabel("5.- si usted sabe como realizar una tarea");
		lblSiUsted.setBounds(12, 160, 306, 15);
		add(lblSiUsted);
		
		JLabel lblAlPresenciar = new JLabel("6.- Al presenciar un choque automovilístico:");
		lblAlPresenciar.setVerticalAlignment(SwingConstants.TOP);
		lblAlPresenciar.setBounds(12, 187, 336, 15);
		add(lblAlPresenciar);
		
		JLabel lblCuandoLe_1 = new JLabel("7.- Cuando le asignan un trabajo:");
		lblCuandoLe_1.setForeground(Color.BLACK);
		lblCuandoLe_1.setBounds(12, 214, 336, 15);
		add(lblCuandoLe_1);
		
		JLabel lblUstedDebe = new JLabel("<html>8.- Usted debe realizar un trabajo del cual <br> no posee experiencia sin embargo este <br> debe ser entregado a la brevedad:</html>");
		lblUstedDebe.setVerticalTextPosition(SwingConstants.TOP);
		lblUstedDebe.setVerticalAlignment(SwingConstants.TOP);
		lblUstedDebe.setBounds(12, 240, 295, 62);
		add(lblUstedDebe);
		
		JLabel label_2 = new JLabel("9.- En un grupo dividido por opiniones usted:");
		label_2.setBounds(12, 314, 327, 15);
		add(label_2);
		
		JLabel lblCuandoLe = new JLabel("10.- En un deporte:");
		lblCuandoLe.setBounds(12, 347, 336, 15);
		add(lblCuandoLe);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(342, 28, 230, 22);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(342, 74, 230, 22);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(342, 98, 230, 22);
		add(comboBox_2);
		

	}
}
