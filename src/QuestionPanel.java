import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.JLabel;


public class QuestionPanel extends JPanel {
	private JTable question;

	/**
	 * Create the panel.
	 */
	public QuestionPanel() {
		setLayout(null);
		
		JButton nextButton = new JButton("Siguente ");
		nextButton.setBounds(536, 426, 89, 23);
		add(nextButton);
		
		question = new JTable();
		question.setBounds(12, 12, 607, 368);
		add(question);

	}
}
