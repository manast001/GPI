import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.image.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTable;
import java.awt.FlowLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JTree;
import javax.swing.border.MatteBorder;


public class GraphicsPanel extends JPanel {
	private JTabbedPane tabbedPane;
	private JPanel result;
	private ChartPanel chart;
	private DefaultCategoryDataset data;
	private JFreeChart graphics;
	private JTable advices;
	private DefaultTableModel advicesModel;

	
	/**
	 * Private Metod
	 */
		
	private void setData()
	{
		this.data=new DefaultCategoryDataset();
		
		
		data.addValue(50, "X", "X");
		data.addValue(80, "Y", "Y");
		data.addValue(60, "T", "T");
		data.addValue(20, "P", "P");
		data.addValue(96, "Metas", "Metas");
		data.addValue(35, "Necesidades", "Necesidades");
		data.addValue(42, "Cofre PLZ", "Cofre PLZ");
		
	}
	
	/**
	 * Create the panel.
	 */
	public GraphicsPanel() {
		setLayout(null);
		
		this.setData();
		graphics = ChartFactory.createBarChart3D("Resultados Obtenidos","Parametros","Porcentaje",data,PlotOrientation.VERTICAL,true,true,true);
		
		this.tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		this.tabbedPane.setBounds(0, 0, 636, 459);
		add(this.tabbedPane);
		chart = new ChartPanel(graphics);
		chart.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.GREEN));
		this.tabbedPane.addTab("Resultados", chart);
		chart.setLayout(null);
		
		chart.setForeground(Color.BLACK);
		chart.setBackground(Color.WHITE);
		chart.setBounds(12, 12, 606, 408);
		
		result = new JPanel();
		result.setBounds(12, 12, 606, 408);
		JPanel panel = new JPanel();
		this.tabbedPane.addTab("Consejos", panel);
		panel.setLayout(null);
		
		advicesModel=new DefaultTableModel(new Object[][] {},new String[] {"Resultados"}) {
			Class[] columnTypes = new Class[] {
					String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
		};
		advicesModel.addRow(new String [] {"Advertencia 1"});
		advicesModel.addRow(new String [] {"Advertencia 2"});
		advicesModel.addRow(new String [] {"Advertencia 3"});
		advicesModel.addRow(new String [] {"Advertencia 4"});
		advicesModel.addRow(new String [] {"Advertencia 5"});
		advicesModel.addRow(new String [] {"Advertencia 6"});
		advicesModel.addRow(new String [] {"Advertencia 7"});
		advicesModel.addRow(new String [] {"Advertencia 8"});
		advicesModel.addRow(new String [] {"Advertencia 9"});
		advicesModel.addRow(new String [] {"Advertencia 10"});
		
		advices = new JTable();
		advices.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		advices.setName("Resultados");
		advices.setShowGrid(false);
		advices.setEnabled(false);
		advices.setModel(advicesModel);
		advices.getColumnModel().getColumn(0).setResizable(false);
		advices.getColumnModel().getColumn(0).setPreferredWidth(624);
		advices.getColumnModel().getColumn(0).setMinWidth(624);
		advices.getColumnModel().getColumn(0).setMaxWidth(624);
		advices.setBounds(12, 12, 606, 408);
		panel.add(advices);
		
		

	}
}
