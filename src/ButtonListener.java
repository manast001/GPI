import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ButtonListener implements ActionListener {
	
	private Postulante postulante;
	private JButton button;
	private int seccion;
	private JPanel panel;
	
	public ButtonListener(Postulante postulante,JButton button,int seccion,JPanel panel)
	{
		this.button=button;
		this.postulante=postulante;
		this.seccion=seccion;
		this.panel=panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.seccion==0)
		{
			this.button.setText("siguiente");
			this.panel.removeAll();
			this.panel.add(new QuestionXYPanel(this.postulante));
		}
		this.seccion++;
		
		
	}

}
