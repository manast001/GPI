import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.List;

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
	private JComboBox dataField_charge;
	private JComboBox dataField_Computer;
	private JComboBox dataField_Education;
	private JSpinner dataField_age;
	private JComboBox dataField_civilState;
	private JSpinner dataField_sonsNumber;
	private JSpinner dataField_Date;
	/**
	 * Create the panel.
	 */
	public DataPanel() {
		setBackground(Color.LIGHT_GRAY);
		
		this.setBounds(0, 0, 720, 458);
		setLayout(null);
		
		JPanel userDataPanel = new JPanel();
		userDataPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 1, true), "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		userDataPanel.setBounds(12, 22, 691, 152);
		add(userDataPanel);
		userDataPanel.setLayout(null);
		
		JLabel nameLabel = new JLabel("Nombre");
		nameLabel.setBounds(12, 55, 55, 15);
		userDataPanel.add(nameLabel);
		
		JLabel rutLabel = new JLabel("Rut");
		rutLabel.setBounds(12, 28, 55, 15);
		userDataPanel.add(rutLabel);
		
		JLabel apellidoPLabel = new JLabel("Apellido Paterno");
		apellidoPLabel.setBounds(12, 80, 143, 15);
		userDataPanel.add(apellidoPLabel);
		
		JLabel apellidoMLabel = new JLabel("Apellido Materno");
		apellidoMLabel.setBounds(12, 106, 143, 15);
		userDataPanel.add(apellidoMLabel);
		
		JLabel nacimientoLabel = new JLabel("Fecha de Nacimiento ");
		nacimientoLabel.setBounds(268, 28, 167, 15);
		userDataPanel.add(nacimientoLabel);
		
		JLabel estadoCivilLabel = new JLabel("Estado Civil");
		estadoCivilLabel.setBounds(268, 55, 121, 15);
		userDataPanel.add(estadoCivilLabel);
		
		JLabel cantidadHijosLabel = new JLabel("N\u00B0 de Hijos");
		cantidadHijosLabel.setBounds(475, 55, 109, 15);
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
		dataField_SurnameP.setBounds(157, 78, 128, 20);
		userDataPanel.add(dataField_SurnameP);
		
		dataField_SurnameM = new JTextField();
		dataField_SurnameM.setColumns(10);
		dataField_SurnameM.setBounds(157, 104, 128, 20);
		userDataPanel.add(dataField_SurnameM);
		
		dataField_Date = new JSpinner();
		dataField_Date.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		dataField_Date.setModel(new SpinnerDateModel(new Date(1388718000000L), null, null, Calendar.DAY_OF_YEAR));
		dataField_Date.setBounds(441, 26, 143, 20);
		userDataPanel.add(dataField_Date);
		
		dataField_sonsNumber = new JSpinner();
		dataField_sonsNumber.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		dataField_sonsNumber.setBounds(572, 53, 76, 20);
		userDataPanel.add(dataField_sonsNumber);
		
		dataField_civilState = new JComboBox();
		dataField_civilState.setModel(new DefaultComboBoxModel(new String[] {"Soltero", "Casado", "Separado", "Divorciado", "Viudo"}));
		dataField_civilState.setBounds(366, 50, 102, 25);
		userDataPanel.add(dataField_civilState);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(303, 80, 86, 15);
		userDataPanel.add(lblEdad);
		
		dataField_age = new JSpinner();
		dataField_age.setBounds(392, 78, 76, 20);
		userDataPanel.add(dataField_age);
		
		JPanel chargeDataPanel = new JPanel();
		chargeDataPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255)), "Datos Profesionales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		chargeDataPanel.setBounds(12, 186, 691, 225);
		add(chargeDataPanel);
		chargeDataPanel.setLayout(null);
		
		JLabel educacionLabel = new JLabel("Nivel Educacional");
		educacionLabel.setBounds(12, 47, 155, 16);
		chargeDataPanel.add(educacionLabel);
		
		dataField_Education = new JComboBox();
		dataField_Education.setBounds(185, 46, 155, 20);
		chargeDataPanel.add(dataField_Education);
		dataField_Education.setModel(new DefaultComboBoxModel(new String[] {"Basica", "Media", "Superior"}));
		
		JLabel computacionPlz = new JLabel("Nivel Computacional");
		computacionPlz.setBounds(12, 81, 155, 15);
		chargeDataPanel.add(computacionPlz);
		
		dataField_Computer = new JComboBox();
		dataField_Computer.setBounds(185, 78, 155, 20);
		chargeDataPanel.add(dataField_Computer);
		dataField_Computer.setModel(new DefaultComboBoxModel(new String[] {"Basico", "Medio", "Avanzado", "Experto"}));
		
		JLabel chargeLabel = new JLabel("Cargo Actual");
		chargeLabel.setBounds(12, 117, 110, 16);
		chargeDataPanel.add(chargeLabel);
		
		dataField_charge = new JComboBox();
		dataField_charge.setModel(new DefaultComboBoxModel(new String[] {"Nuevo Postulante", "Cargo plz"}));
		dataField_charge.setMaximumRowCount(20);
		dataField_charge.setBounds(185, 113, 155, 25);
		chargeDataPanel.add(dataField_charge);

	}

	public List<List<String>> getData()
	{
		List<String> data=new ArrayList<String>();
		List<List<String>> datas=new ArrayList<List<String>>(); 
		SpinnerNumberModel model=(SpinnerNumberModel) this.dataField_sonsNumber.getModel();
		
		data.add(this.dataField_Rut.getText());
		data.add(this.dataField_Name.getText());
		data.add(this.dataField_SurnameP.getText());
		data.add(this.dataField_SurnameM.getText());
		data.add(this.dataField_Date.getValue().toString());
		data.add(this.dataField_civilState.getSelectedItem().toString());
		data.add(model.getValue().toString());
		model=(SpinnerNumberModel) this.dataField_age.getModel();
		data.add(model.getValue().toString());
		
		
		
		datas.add(data);
		data.clear();
		
		data.add(this.dataField_Education.getSelectedItem().toString());
		
		data.add(this.dataField_Computer.getSelectedItem().toString());
		data.add(this.dataField_charge.getSelectedItem().toString());
		
		datas.add(data);
		data.clear();
		return datas;
	}
}
