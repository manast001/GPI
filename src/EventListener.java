import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;



public class EventListener implements ItemListener {
	
	private int index;
	private Postulante postulante;
	private JComboBox response;
	
	public EventListener(int index,Postulante postulante,JComboBox response)
	{
		this.index=index;
		this.postulante=postulante;
		this.response=response;
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		this.postulante.addAnswerByIndex(this.response.getSelectedIndex(), this.index);
	}

}
