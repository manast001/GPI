import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;


public class buttonListener implements ActionListener {
	
	private Postulante postulante;
	private JLabel label;
	
	public buttonListener(Postulante postulante,JLabel label)
	{
		this.label=label;
		this.postulante=postulante;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.postulante.caculateXY();
		label.setText("respuestas="+this.postulante.toString()+" X="+ this.postulante.getX() + " Y=" + this.postulante.getY());
		
	}

}
