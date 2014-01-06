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
        private QuestionXYPanel xyPanel;
        private StrategicPanel sPanel;
        private TacticPanel tPanel;
        private OperationalPanel oPanel;
        private GraphicsPanel gpanel;
        
        
        public ButtonListener(Postulante postulante,JButton button,int seccion,Interfaz frame)
        {
                this.button=button;
                this.postulante=postulante;
                this.seccion=seccion;
                this.frame=frame;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
                
        		if(this.seccion==0)
        		{
        			this.postulante.setData(this.frame.dPanel.getData());
        		}
        	
        		this.frame.tabbedPane.removeAll();
                switch(this.seccion)
                {
                
                        case 0:
                                this.button.setText("siguiente");
                                this.frame.tabbedPane.addTab("Preguntas Iniciales",(JPanel) new QuestionXYPanel(this.postulante));
                                break;
                        case 1:
                                this.postulante.caculateXY();
                                
                                if(this.postulante.getY()>=80)
                                {
                                        
                                        this.frame.tabbedPane.addTab("Preguntas Finales",(JPanel) new StrategicPanel(this.postulante));
                                        postulante.setRol("Estrategico");
                                }else
                                {
                                        if(this.postulante.getY()<80 && this.postulante.getY()>=50)
                                        {
                                                this.frame.tabbedPane.addTab("Preguntas Finales",(JPanel) new TacticPanel(this.postulante));
                                                postulante.setRol("Tactico");
                                        }else
                                        {
                                                this.frame.tabbedPane.addTab("Preguntas Finales",new OperationalPanel(this.postulante));
                                                postulante.setRol("Operacional");
                                        }
                                        
                                }
                                this.button.setText("Finalizar");
                                break;
                        case 2:
                        		gpanel=new GraphicsPanel(this.postulante,new Cargo());
                                this.frame.tabbedPane.addTab("Resultados Finales",gpanel);
                                gpanel.setData();
                                this.button.setText("Reiniciar");
                                break;
                                default:
                                        this.button.setText("Comenzar");
                                        this.seccion=-1;
                                        this.frame.reinicializate();
                                        break;
                }
                
                this.seccion++;
                
        }

}
