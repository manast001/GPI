import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import javax.swing.JList;
import javax.swing.AbstractListModel;


public class DataPanel extends JPanel {
	private JTextField dataField_Rut;
	private JTextField dataField_Name;
	private JTextField dataField_SurnameM;
	private JTextField dataField_SurnameP;


	/**
	 * Create the panel.
	 */
	public DataPanel() {
		
		this.setBounds(0, 0, 635, 459);
		setLayout(null);
		
		JPanel userDataPanel = new JPanel();
		userDataPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 1, true), "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		userDataPanel.setBounds(12, 22, 611, 152);
		add(userDataPanel);
		userDataPanel.setLayout(null);
		
		JLabel nameLabel = new JLabel("Nombre");
		nameLabel.setBounds(12, 55, 55, 15);
		userDataPanel.add(nameLabel);
		
		JLabel rutLabel = new JLabel("Rut");
		rutLabel.setBounds(12, 28, 55, 15);
		userDataPanel.add(rutLabel);
		
		JLabel apellidoPLabel = new JLabel("Apellido Paterno");
		apellidoPLabel.setBounds(12, 80, 108, 15);
		userDataPanel.add(apellidoPLabel);
		
		JLabel apellidoMLabel = new JLabel("Apellido Materno");
		apellidoMLabel.setBounds(12, 106, 108, 15);
		userDataPanel.add(apellidoMLabel);
		
		JLabel nacimientoLabel = new JLabel("Fecha de Nacimiento ");
		nacimientoLabel.setBounds(268, 28, 121, 15);
		userDataPanel.add(nacimientoLabel);
		
		JLabel estadoCivilLabel = new JLabel("Estado Civil");
		estadoCivilLabel.setBounds(268, 55, 76, 15);
		userDataPanel.add(estadoCivilLabel);
		
		JLabel cantidadHijosLabel = new JLabel("N\u00B0 de Hijos");
		cantidadHijosLabel.setBounds(268, 106, 61, 15);
		userDataPanel.add(cantidadHijosLabel);
		
		dataField_Rut = new JTextField();
		dataField_Rut.setBounds(130, 25, 128, 20);
		userDataPanel.add(dataField_Rut);
		dataField_Rut.setColumns(10);
		
		dataField_Name = new JTextField();
		dataField_Name.setColumns(10);
		dataField_Name.setBounds(130, 52, 128, 20);
		userDataPanel.add(dataField_Name);
		
		dataField_SurnameP = new JTextField();
		dataField_SurnameP.setColumns(10);
		dataField_SurnameP.setBounds(130, 77, 128, 20);
		userDataPanel.add(dataField_SurnameP);
		
		dataField_SurnameM = new JTextField();
		dataField_SurnameM.setColumns(10);
		dataField_SurnameM.setBounds(130, 103, 128, 20);
		userDataPanel.add(dataField_SurnameM);
		
		JSpinner dataField_Date = new JSpinner();
		dataField_Date.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		dataField_Date.setModel(new SpinnerDateModel(new Date(1388718000000L), null, null, Calendar.DAY_OF_YEAR));
		dataField_Date.setBounds(407, 25, 143, 20);
		userDataPanel.add(dataField_Date);
		
		JSpinner dataField_sonsNumber = new JSpinner();
		dataField_sonsNumber.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		dataField_sonsNumber.setBounds(347, 103, 76, 20);
		userDataPanel.add(dataField_sonsNumber);
		
		JComboBox dataField_civilState = new JComboBox();
		dataField_civilState.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Separado", "Divorciado", "Viudo"}));
		dataField_civilState.setBounds(359, 50, 179, 25);
		userDataPanel.add(dataField_civilState);
		
		JPanel chargeDataPanel = new JPanel();
		chargeDataPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255)), "Datos Profesionales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		chargeDataPanel.setBounds(12, 186, 611, 225);
		add(chargeDataPanel);
		chargeDataPanel.setLayout(null);
		
		JLabel educacionLabel = new JLabel("Nivel Educacional");
		educacionLabel.setBounds(12, 47, 99, 16);
		chargeDataPanel.add(educacionLabel);
		
		JComboBox dataField_Education = new JComboBox();
		dataField_Education.setBounds(139, 45, 121, 20);
		chargeDataPanel.add(dataField_Education);
		dataField_Education.setModel(new DefaultComboBoxModel(new String[] {"Basica", "Media", "Superior"}));
		
		JLabel computacionPlz = new JLabel("Nivel Computacional");
		computacionPlz.setBounds(12, 81, 121, 15);
		chargeDataPanel.add(computacionPlz);
		
		JComboBox dataField_Computer = new JComboBox();
		dataField_Computer.setBounds(139, 78, 133, 20);
		chargeDataPanel.add(dataField_Computer);
		dataField_Computer.setModel(new DefaultComboBoxModel(new String[] {"Basico", "Medio", "Avanzado", "Experto"}));
		
		JLabel chargeLabel = new JLabel("Cargo Actual");
		chargeLabel.setBounds(12, 117, 110, 16);
		chargeDataPanel.add(chargeLabel);
		
		JComboBox dataField_charge = new JComboBox();
		dataField_charge.setModel(new DefaultComboBoxModel(new String[] {"Nuevo Postulante", "Cargo plz"}));
		dataField_charge.setMaximumRowCount(20);
		dataField_charge.setBounds(139, 113, 133, 25);
		chargeDataPanel.add(dataField_charge);
		
		JList dataField_WishCharge = new JList();
		dataField_WishCharge.setModel(new AbstractListModel() {
			String[] values = new String[] {"Hola ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		dataField_WishCharge.setBounds(331, 46, 252, 167);
		chargeDataPanel.add(dataField_WishCharge);
		
		JLabel lblCargoAlQue = new JLabel("Cargo al que se desea postular");
		lblCargoAlQue.setBounds(331, 18, 190, 16);
		chargeDataPanel.add(lblCargoAlQue);
		
		JButton startButton = new JButton("Comenzar");
		startButton.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		startButton.setBounds(506, 423, 117, 25);
		add(startButton);

	}
}
