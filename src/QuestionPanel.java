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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;


public class QuestionPanel extends JPanel {
	/*
	 * Private Constant
	 */
	List<String> questions=new ArrayList<String>();

	
	/**
	 * Create the panel.
	 */
	public QuestionPanel() {
		setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("609px"),},
			new RowSpec[] {
				RowSpec.decode("328px"),}));

	}
}
