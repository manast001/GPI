import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ButtonListener implements ActionListener {
	
	private Postulante postulante;
	private JButton button;
	private int seccion;
	private Interfaz frame;
	
	public ButtonListener(Postulante postulante,JButton button,int seccion,Interfaz frame)
	{
		this.button=button;
		this.postulante=postulante;
		this.seccion=seccion;
		this.frame=frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(this.seccion)
		{
			case 0:
				this.button.setText("siguiente");
				this.frame.tabbedPane.remove(0);
				this.frame.tabbedPane.addTab("Preguntas Iniciales",(JPanel) new QuestionXYPanel(this.postulante));
				break;
			case 1:
				this.postulante.caculateXY();
				
				if(this.postulante.getY()>=80)
				{
					this.frame.tabbedPane.addTab("Preguntas Finales",(JPanel) new StrategicPanel(this.postulante));
				}else
				{
					if(this.postulante.getY()<80 && this.postulante.getY()>=50)
					{
						this.frame.tabbedPane.addTab("Preguntas Finales",(JPanel) new TacticPanel(this.postulante));
					}else
					{
						this.frame.tabbedPane.addTab("Preguntas Finales",new OperationalPanel(this.postulante));
					}
					
				}
				
				break;
		}
		
		this.seccion++;
		
		
	}

}
