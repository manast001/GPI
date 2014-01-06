import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;


public class TacticPanel extends JPanel {
	
	private Postulante postulante;
	/**
	 * Create the panel.
	 */
	public TacticPanel(Postulante postulante) {
		this.postulante=postulante;
		
		JLabel lblAnteUna = new JLabel("1. Ante una exposici\u00F3n ud busca:");
		lblAnteUna.setBounds(33, 38, 160, 14);
		
		JLabel lblConSus = new JLabel("2. Con sus compa\u00F1eros de trabajo, prefiere");
		lblConSus.setBounds(33, 63, 210, 14);
		setLayout(null);
		add(lblAnteUna);
		add(lblConSus);
		
		JLabel lblEnUn = new JLabel("3. En un grupo de trabajo prefiere");
		lblEnUn.setBounds(33, 88, 179, 14);
		add(lblEnUn);
		
		JLabel lblUstedAnte = new JLabel("4. Usted, ante un problema determinado");
		lblUstedAnte.setBounds(33, 112, 230, 14);
		add(lblUstedAnte);
		
		JLabel lblEnUn_1 = new JLabel("5. En un grupo de trabajo, prefiere que el cumplimiento de las metas sea recompensado seg\u00FAn");
		lblEnUn_1.setBounds(33, 137, 477, 14);
		add(lblEnUn_1);
		
		JLabel lblSSus = new JLabel("6. S\u00ED sus compa\u00F1eros planean realizar una actividad sindical en el trabajo");
		lblSSus.setBounds(33, 160, 383, 14);
		add(lblSSus);
		
		JLabel lblAUsted = new JLabel("7. A usted, le motiva m\u00E1s");
		lblAUsted.setBounds(33, 185, 258, 14);
		add(lblAUsted);
		
		JLabel lblAnteLa = new JLabel("8. Ante la incertidumbre");
		lblAnteLa.setBounds(33, 210, 125, 14);
		add(lblAnteLa);
		
		JLabel lblAnteEl = new JLabel("9. Ante el inminente incumplimiento de los plazos del grupo de trabajo");
		lblAnteEl.setBounds(33, 235, 340, 14);
		add(lblAnteEl);
		
		JLabel lblseSiente = new JLabel("10. \u00BFSe siente vagamente culpable, cuando descansa y no hace nada durante varias horas o varios d\u00EDas?");
		lblseSiente.setBounds(33, 260, 520, 14);
		add(lblseSiente);
		
		JLabel lblEsMs = new JLabel("11. Es m\u00E1s dif\u00EDcil para usted");
		lblEsMs.setBounds(33, 288, 210, 14);
		add(lblEsMs);
		
		JLabel lblEnUna = new JLabel("12. En una fiesta");
		lblEnUna.setBounds(33, 314, 109, 14);
		add(lblEnUna);
		
		JLabel lblLeAtraen = new JLabel("13. Le atraen m\u00E1s la personas que");
		lblLeAtraen.setBounds(33, 342, 179, 14);
		add(lblLeAtraen);
		
		JLabel lblUstedPrefiere = new JLabel("14. Usted prefiere pensar m\u00E1s en");
		lblUstedPrefiere.setBounds(33, 367, 210, 14);
		add(lblUstedPrefiere);
		
		JLabel lblnecesitaDe = new JLabel("15. \u00BFNecesita de alg\u00FAn familiar, objeto o meta para motivarse?");
		lblnecesitaDe.setBounds(33, 392, 315, 14);
		add(lblnecesitaDe);
		
		JLabel lblCuandoEn = new JLabel("16. Cuando en su casa el tel\u00E9fono suena, usted:");
		lblCuandoEn.setBounds(33, 417, 242, 14);
		add(lblCuandoEn);
		
		JLabel lblhaDivagado = new JLabel("17. \u00BFHa divagado alguna vez con un plan de vida en el \u00E1mbito profesional?");
		lblhaDivagado.setBounds(33, 442, 383, 14);
		add(lblhaDivagado);
		
		JLabel lblseSiente_1 = new JLabel("18. \u00BFSe siente usted satisfecho con su actual trabajo?");
		lblseSiente_1.setBounds(33, 467, 285, 14);
		add(lblseSiente_1);
		
		JLabel lblUnCliente = new JLabel("19. Un cliente le solicita un servicio que usted puede cumplir en el momento");
		lblUnCliente.setBounds(33, 492, 407, 14);
		add(lblUnCliente);
	}
}
