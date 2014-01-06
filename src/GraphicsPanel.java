import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;



public class GraphicsPanel extends JPanel {
	private Postulante postulante;
	private Cargo cargo;
	private JList datos;
	private JList resultados;
	private JList observaciones;
	private DefaultListModel model;

	
	/**
	 * Private Metod
	 */
	/**
	 * Create the panel.
	 */
	public GraphicsPanel(Postulante postulante, Cargo cargo ) {
		setLayout(null);
		
		this.postulante=postulante;
		this.cargo=cargo;
		
		datos = new JList();
		datos.setModel(new DefaultListModel() {
			String[] values = new String[] {"Datos"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		datos.setBounds(10, 60, 401, 298);
		add(datos);
		
	   resultados = new JList();
		resultados.setModel(new DefaultListModel() {
			String[] values = new String[] {"Resultados"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		resultados.setBounds(421, 60, 424, 298);
		add(resultados);
		
		observaciones = new JList();
		observaciones.setModel(new DefaultListModel() {
			String[] values = new String[] {"Observaciones"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		observaciones.setBounds(10, 369, 835, 223);
		add(observaciones);
	}
	
	private void setResultados()
	{
		List<String> data=cargo.comparate(postulante.getResponse(), postulante.getRol());
		model=(DefaultListModel<String>) resultados.getModel();
		
		if(data==null)
		{
			model.addElement("No se han encontrado coincidencias");
		}else
		{
			for(int i =0;i<data.size();i++)
			{
				model.addElement(data.get(i));
			}
		}
	}
	
	private void setDatos()
	{
		model=(DefaultListModel<String>) datos.getModel();
		
		model.addElement("Edad: "+ postulante.getAge());
		model.addElement("Nivel Computacional: "+ postulante.getNivelComputacional());
		model.addElement("Nivel Educativo: " + postulante.getNivelEducacional());
		model.addElement("Porcentaje X=" + postulante.getX()+"%");
		model.addElement("Porcentaje Y=" + postulante.getY()+"%");
		model.addElement("Rol Optimo: " + postulante.getRol());
		
	}
	
	private void setObservaciones()
	{
		model=(DefaultListModel<String>) observaciones.getModel();
		if(postulante.getAge()<18)
			model.addElement("El postulante es menor a 18 años");
		if(postulante.getNivelComputacional().equals("Basica"))
			model.addElement("Se debe realizar una capacitacion en computacion al postulante");
		if(postulante.getNivelComputacional().equals("Basica") || postulante.getNivelComputacional().equals("media"))
			model.addElement("El postulante solo puede acceder a un maximo de cargo tactico");
		
	}
	
	public void setData()
	{
		this.setDatos();
		this.setResultados();
	}
}
