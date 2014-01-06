import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class TacticPanel extends JPanel {
        
        private Postulante postulante;
        private JComboBox comboBox,comboBox_1,comboBox_2,comboBox_3,comboBox_4,comboBox_5;
		private JComboBox comboBox_6,comboBox_7,comboBox_8,comboBox_9,comboBox_10,comboBox_11;
		private JComboBox comboBox_12,comboBox_13,comboBox_14,comboBox_15,comboBox_16,comboBox_17;
		private JComboBox comboBox_18;
        /**
         * Create the panel.
         */
        public TacticPanel(Postulante postulante) {
                this.postulante=postulante;
                this.postulante.insert(19);
                
                JLabel lblAnteUna = new JLabel("<html>1. Ante una exposici&oacute;n ud busca:</html>");
                lblAnteUna.setBounds(33, 38, 160, 14);
                
                JLabel lblConSus = new JLabel("<html>2. Con sus compa&ntilde;eros de trabajo, prefiere</html>");
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
                
                JLabel lblEnUn_1 = new JLabel("<html>5. En un grupo de trabajo, prefiere que el cumplimiento de las metas sea recompensado seg&uacute;n</html>");
                lblEnUn_1.setBounds(33, 137, 477, 14);
                add(lblEnUn_1);
                
                JLabel lblSSus = new JLabel("<html>6. S&iacute; sus compa&ntilde;eros planean realizar una actividad sindical en el trabajo</html>");
                lblSSus.setBounds(33, 160, 383, 14);
                add(lblSSus);
                
                JLabel lblAUsted = new JLabel("<html>7. A usted, le motiva m&aacute;s</html>");
                lblAUsted.setBounds(33, 185, 258, 14);
                add(lblAUsted);
                
                JLabel lblAnteLa = new JLabel("8. Ante la incertidumbre");
                lblAnteLa.setBounds(33, 210, 125, 14);
                add(lblAnteLa);
                
                JLabel lblAnteEl = new JLabel("9. Ante el inminente incumplimiento de los plazos del grupo de trabajo");
                lblAnteEl.setBounds(33, 235, 340, 14);
                add(lblAnteEl);
                
                JLabel lblseSiente = new JLabel("<html>10. &iquest siente vagamente culpable, cuando descansa y no hace nada durante varias horas o varios dias?</html>");
                lblseSiente.setBounds(33, 260, 520, 14);
                add(lblseSiente);
                
                JLabel lblEsMs = new JLabel("11. Es mas dificil para usted");
                lblEsMs.setBounds(33, 288, 210, 14);
                add(lblEsMs);
                
                JLabel lblEnUna = new JLabel("12. En una fiesta");
                lblEnUna.setBounds(33, 314, 109, 14);
                add(lblEnUna);
                
                JLabel lblLeAtraen = new JLabel("13. Le atraen mas la personas que");
                lblLeAtraen.setBounds(33, 342, 179, 14);
                add(lblLeAtraen);
                
                JLabel lblUstedPrefiere = new JLabel("14. Usted prefiere pensar mas en");
                lblUstedPrefiere.setBounds(33, 367, 210, 14);
                add(lblUstedPrefiere);
                
                JLabel lblnecesitaDe = new JLabel("15.Necesita de algun familiar, objeto o meta para motivarse?");
                lblnecesitaDe.setBounds(33, 392, 315, 14);
                add(lblnecesitaDe);
                
                JLabel lblCuandoEn = new JLabel("16. Cuando en su casa el telefono suena, usted:");
                lblCuandoEn.setBounds(33, 417, 242, 14);
                add(lblCuandoEn);
                
                JLabel lblhaDivagado = new JLabel("17.Ha divagado alguna vez con un plan de vida en el ambito profesional?");
                lblhaDivagado.setBounds(33, 442, 383, 14);
                add(lblhaDivagado);
                
                JLabel lblseSiente_1 = new JLabel("18. Se siente usted satisfecho con su actual trabajo?");
                lblseSiente_1.setBounds(33, 467, 285, 14);
                add(lblseSiente_1);
                
                JLabel lblUnCliente = new JLabel("19. Un cliente le solicita un servicio que usted puede cumplir en el momento");
                lblUnCliente.setBounds(33, 492, 407, 14);
                add(lblUnCliente);
                
                JComboBox comboBox = new JComboBox();
                comboBox.setModel(new DefaultComboBoxModel(new String[] {"lograr que lo que se expone sea entendido por los asistentes", "generar impacto en los asistentes"}));
                comboBox.addItemListener(new EventListener(0,postulante,comboBox));
                comboBox.setBounds(599, 35, 512, 20);
                add(comboBox);
                
                comboBox_1 = new JComboBox();
                comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"establecer  relaciones puntualmente en relacion al desarrollo de las actividades", "establecer relaciones socialmente cercanas"}));
                comboBox_1.addItemListener(new EventListener(1,postulante,comboBox_1));
                comboBox_1.setBounds(599, 60, 512, 20);
                add(comboBox_1);
                
                comboBox_2 = new JComboBox();
                comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"asumir el control de las acciones del grupo", "<html>comprometer a los compa&ntilde;eros que asuman responsabilidades individuales</html>"}));
                comboBox_2.addItemListener(new EventListener(2,postulante,comboBox_2));
                comboBox_2.setBounds(599, 85, 512, 20);
                add(comboBox_2);
                
                comboBox_3 = new JComboBox();
                comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"se enfoca en las causas", "busca variables asociadas y las subdivide"}));
                comboBox_3.addItemListener(new EventListener(3,postulante,comboBox_3));
                comboBox_3.setBounds(599, 109, 512, 20);
                add(comboBox_3);
                
                comboBox_4 = new JComboBox();
                comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"mejor rendimiento individual", "previo acuerdo con su superior"}));
                comboBox_4.addItemListener(new EventListener(4,postulante,comboBox_4));
                comboBox_4.setBounds(599, 134, 512, 20);
                add(comboBox_4);
                
                comboBox_5 = new JComboBox();
                comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Participa de sus actividades laborales y luego si involucra en esta", "Participa y ayuda a coordinar los preparativos de esta"}));
                comboBox_5.addItemListener(new EventListener(5,postulante,comboBox_5));
                comboBox_5.setBounds(599, 157, 512, 20);
                add(comboBox_5);
                
                comboBox_6 = new JComboBox();
                comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"que su trabajo logre aceptacion en las personas involucradas", "buscar soluciones que generen un cambio desde su perspectiva"}));
                comboBox_6.addItemListener(new EventListener(6,postulante,comboBox_6));
                comboBox_6.setBounds(599, 182, 512, 20);
                add(comboBox_6);
                
                comboBox_7 = new JComboBox();
                comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"se retroalimenta del pasado", "augura los posibles escenarios"}));
                comboBox_7.addItemListener(new EventListener(7,postulante,comboBox_7));
                comboBox_7.setBounds(599, 207, 512, 20);
                add(comboBox_7);
                
                comboBox_8 = new JComboBox();
                comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"atribuye la responsabilidad del incumplimiento a los culpables respectivos", "realiza las actividades ajenas a su responsabilidad para cumplir lo establecido"}));
                comboBox_8.addItemListener(new EventListener(8,postulante,comboBox_8));
                comboBox_8.setBounds(599, 232, 512, 20);
                add(comboBox_8);
                
                comboBox_9 = new JComboBox();
                comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
                comboBox_9.addItemListener(new EventListener(9,postulante,comboBox_9));
                comboBox_9.setBounds(599, 257, 512, 20);
                add(comboBox_9);
                
                comboBox_10 = new JComboBox();
                comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"utilizar a otros", "identificarse con otros"}));
                comboBox_10.addItemListener(new EventListener(10,postulante,comboBox_10));
                comboBox_10.setBounds(599, 285, 512, 20);
                add(comboBox_10);
                
                comboBox_11 = new JComboBox();
                comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"interactuas con pocos, solo con tus conocidos", "interactuas con varios, incluso con los que no conoces"}));
                comboBox_11.addItemListener(new EventListener(11,postulante,comboBox_11));
                comboBox_11.setBounds(599, 311, 512, 20);
                add(comboBox_11);
                
                comboBox_12 = new JComboBox();
                comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"Viven el dia a dia", "Tienen un proposito a futuro claro de vida"}));
                comboBox_12.addItemListener(new EventListener(12,postulante,comboBox_12));
                comboBox_12.setBounds(599, 339, 512, 20);
                add(comboBox_12);
                
                comboBox_13 = new JComboBox();
                comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"Un presente vivido", "Un futuro prometedor"}));
                comboBox_13.addItemListener(new EventListener(13,postulante,comboBox_13));
                comboBox_13.setBounds(599, 364, 512, 20);
                add(comboBox_13);
                
                comboBox_14 = new JComboBox();
                comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
                comboBox_14.addItemListener(new EventListener(14,postulante,comboBox_14));
                comboBox_14.setBounds(599, 389, 512, 20);
                add(comboBox_14);
                
                comboBox_15 = new JComboBox();
                comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"espera a que alguien mas conteste", "se apura por llegar primero y contestar"}));
                comboBox_15.addItemListener(new EventListener(15,postulante,comboBox_15));
                comboBox_15.setBounds(599, 414, 512, 20);
                add(comboBox_15);
                
                comboBox_16 = new JComboBox();
                comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
                comboBox_16.addItemListener(new EventListener(16,postulante,comboBox_16));
                comboBox_16.setBounds(599, 439, 512, 20);
                add(comboBox_16);
                
                comboBox_17 = new JComboBox();
                comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"Si, estoy bien donde estoy", "No, quiero algo mejor"}));
                comboBox_17.addItemListener(new EventListener(17,postulante,comboBox_17));
                comboBox_17.setBounds(599, 464, 512, 20);
                add(comboBox_17);
                
                comboBox_18 = new JComboBox();
                comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"Es criterioso con el cliente y le realiza la consulta sabiendo que esto es en beneficio de la empresa", "Le pide que siga el conducto regular, ya que esto ayuda a consolidar la empresa"}));
                comboBox_18.addItemListener(new EventListener(18,postulante,comboBox_18));
                comboBox_18.setBounds(599, 489, 512, 20);
                add(comboBox_18);
        }
}
