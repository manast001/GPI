import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.JLabel;


public class QuestionPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public QuestionPanel() {
		setLayout(null);
		
		JButton nextButton = new JButton("Siguente ");
		nextButton.setBounds(536, 426, 89, 23);
		add(nextButton);
		
		JLabel firstQuestionLabel = new JLabel("");
		firstQuestionLabel.setBounds(145, 31, 70, 15);
		add(firstQuestionLabel);

	}
}
