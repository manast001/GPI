import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JTextPane;


public class trabajoListener implements ItemListener {

	private JComboBox trabajo;
	private JTextPane habilidades,competencias,necesidades;
	public trabajoListener(JComboBox trabajo,JTextPane habilidades,JTextPane necesidades,JTextPane competencias)
	{
		this.trabajo = trabajo;
		this.habilidades = habilidades;
		this.competencias = competencias;
		this.necesidades = necesidades;
	}
	

	public void itemStateChanged(ItemEvent e) {
		switch (trabajo.getSelectedIndex())
		{
		case 0:
			if(trabajo.getSelectedItem().equals("Gerente General")){
				habilidades.setText("Desarrollador\nFuturista\nComunicador\nEmprendedor");
				necesidades.setText("Reconocimiento\nDestacarse\nMetas dificiles\nAcepta la responsabilidad\nCumple con politicas de la empresa");
				competencias.setText("Basicas\nIntelectuales");
			}
			else if(trabajo.getSelectedItem().equals("Jefe de RRHH")){
				habilidades.setText("Comunicador\nEmpatico\nMandatario");
				necesidades.setText("Responsabilidad\nLograr influir\nAfiliacion");
				competencias.setText("Basicas\nComportamiento");
			}
			else if(trabajo.getSelectedItem().equals("Vendedor")){
				habilidades.setText("Comunicador\nEmpatico\nCompetitivo");
				necesidades.setText("Sociales\nRequieren control\n");
				competencias.setText("Comportamiento");
			}
			break;
		case 1:
			if(trabajo.getSelectedItem().equals("Gerente de finanzas")){
				habilidades.setText("Analitico\nCompetitivo\nDisciplinado\nResponsable");
				necesidades.setText("Eficacia personal");
				competencias.setText("Basicas\nOrden y seguridad\nIntelectuales");
			}
			else if(trabajo.getSelectedItem().equals("Director de finanzas")){
				habilidades.setText("Analitico\nCompetitivo\nDisciplinado");
				necesidades.setText("Destacarse\nDesarrollo");
				competencias.setText("Basicas\nTecnicas\nintelectuales");
			}
			else if(trabajo.getSelectedItem().equals("Programador")){
				habilidades.setText("Analitico\nDisciplinado\nArmonico");
				necesidades.setText("Desarrollo\nNecesita que lo presionen");
				competencias.setText("Tecnicas\nBasicas");
			}
			
			break;
		case 2:
			if(trabajo.getSelectedItem().equals("Gerente de ventas")){
				habilidades.setText("Analitico\nDisciplinado\nResponsable\nConector");
				necesidades.setText("Lograr influir\nDestacarse\nMetas dificiles\nProgreso\nCumple con politicas de la empresa");
				competencias.setText("Basicas\nIntelectuales");
			}
			else if(trabajo.getSelectedItem().equals("Director de produccion")){
				habilidades.setText("Analitico\nFuturista\nEmprendedor");
				necesidades.setText("Factores Motivadores\nDestacarse\nMetas dificiles\nEficacia personal");
				competencias.setText("Basicas\nIntelectuales");
			}
			else if(trabajo.getSelectedItem().equals("Secretaria")){
				habilidades.setText("Empatico\nResponsable\nArmonico");
				necesidades.setText("Necesita presion\nDestacarse\nRequieren control directo");
				competencias.setText("Basicas\nOrden y seguridad \nComportamiento");
			}
			break;
		case 3:
			if(trabajo.getSelectedItem().equals("Gerente de produccion")){
				habilidades.setText("Mandatario\nDisciplinado\nResponsable\nConector");
				necesidades.setText("Realizacion segun estandares \nCompromiso \nProgreso");
				competencias.setText("Basicas \nOrden y seguridad");
			}
			else if(trabajo.getSelectedItem().equals("Director de informatica")){
				habilidades.setText("Analitico\nCompetitivo \nDisciplinado");
				necesidades.setText("Realizacion \nDestacarse \n Progreso");
				competencias.setText("Basicas\nTecnicas");
			}
			else if(trabajo.getSelectedItem().equals("Recepcionista")){
				habilidades.setText("Comunicador \nEmpatico \nResponsable \nArmonico");
				necesidades.setText("Sociales \nRequieren control directo");
				competencias.setText("Basicas");
			}
			break;
			
		case 4:
			if(trabajo.getSelectedItem().equals("Presidente del directorio")){
				habilidades.setText("Analitico\nComunicador\nEmpatico\nConector\nEmprendedor\nFuturista\nResponsable");
				necesidades.setText("El trabajo es natural\nEl trabajo es natural\nReconocimiento\nProgreso\nPoliticas de empresa");
				competencias.setText("Basicas\nOrden y seguridad");
			}
			else if(trabajo.getSelectedItem().equals("Jefe de seccion")){
				habilidades.setText("Mandatario\nDisciplinado\nResponsable");
				necesidades.setText("Destacarse\nLogra influir\nPoliticas de empresa");
				competencias.setText("Basicas\nOrden y seguridad");
			}
			else if(trabajo.getSelectedItem().equals("Bodega")){
				habilidades.setText("Armónico\nDisciplinado");
				necesidades.setText("Compromiso\nEficacia personal");
				competencias.setText("Basicas\nComportamiento");
			}
			
			break;
		case 5:

			if(trabajo.getSelectedItem().equals("Gerente de marketing")){
				habilidades.setText("Competitivo\nDisciplinado\nResponsable");
				necesidades.setText("Metas/Eficacia personal");
				competencias.setText("Basicas\nIntelectuales");
			}
			else if(trabajo.getSelectedItem().equals("Jefe de proyecto")){
				habilidades.setText("Analitico\nComunicador\nMandatario");
				necesidades.setText("Realizacion\nDestacarse");
				competencias.setText("Basicas\nDe comportamiento");
			}
			else if(trabajo.getSelectedItem().equals("Guardia")){
				habilidades.setText("Disciplinado\nMandatario\nResponsable");
				necesidades.setText("Eficacia Personal\nAcepta Responsabilidad\nSupervision");
				competencias.setText("Basicas\nComportamiento\nOrden y Seguridad");
			}
			break;
		}

	}

}
