import java.awt.Component;


public class StrategicPanel extends JPanel {

        private Postulante postulante;
		private JComboBox comboBox,comboBox_1,comboBox_2,comboBox_3,comboBox_4,comboBox_5;
		private JComboBox comboBox_6,comboBox_7,comboBox_8,comboBox_9,comboBox_10,comboBox_11;
		private JComboBox comboBox_12,comboBox_13,comboBox_14,comboBox_15,comboBox_16,comboBox_17;
		private JComboBox comboBox_18,comboBox_19,comboBox_20,comboBox_21,comboBox_22,comboBox_23;
		/**
         * Create the panel.
         */
        public StrategicPanel(Postulante postulante) {
                this.postulante=postulante;
                this.postulante.insert(24);
                setLayout(null);
                
                JPanel panel = new JPanel();
                panel.setBounds(10, 11, 843, 643);
                add(panel);
                panel.setLayout(null);
                
                JLabel lblNewLabel = new JLabel("1. Usted, ante un problema determinado");
                lblNewLabel.setBounds(10, 11, 195, 14);
                panel.add(lblNewLabel);
                
                JLabel lblAnteUnaExposicin = new JLabel("2 Ante una exposici\u00F3n ud busca");
                lblAnteUnaExposicin.setBounds(10, 36, 152, 14);
                panel.add(lblAnteUnaExposicin);
                
                JLabel lblConSusCompaeros = new JLabel("3 Con sus compa\u00F1eros de trabajo, prefiere");
                lblConSusCompaeros.setBounds(10, 61, 206, 14);
                panel.add(lblConSusCompaeros);
                
                JLabel lblUstedCree = new JLabel("4 Usted cree en");
                lblUstedCree.setBounds(10, 86, 76, 14);
                panel.add(lblUstedCree);
                
                JLabel lblAUsted = new JLabel("<html>5. A usted, le motiva m&aacute;s</html>");
                lblAUsted.setBounds(10, 111, 122, 14);
                panel.add(lblAUsted);
                
                JLabel lblAnteLa = new JLabel("6. Ante la incertidumbre");
                lblAnteLa.setBounds(10, 136, 115, 14);
                panel.add(lblAnteLa);
                
                JLabel lblNewLabel_1 = new JLabel("7. Ante el inminente incumplimiento de los plazos del grupo de trabajo");
                lblNewLabel_1.setBounds(10, 161, 333, 14);
                panel.add(lblNewLabel_1);
                
                JLabel lblEnUna = new JLabel("<html>8. En una competencia a usted le importa m&aacute;1s</html>");
                lblEnUna.setBounds(10, 186, 243, 14);
                panel.add(lblEnUna);
                
                JLabel lblNewLabel_2 = new JLabel("<html>9. Le atraen m&aacute;s la personas que</html>");
                lblNewLabel_2.setBounds(10, 211, 243, 14);
                panel.add(lblNewLabel_2);
                
                JLabel lblSiLe = new JLabel("<html>10. Si le dieran a escoger un cargo usted elegir&iacute;a</html>");
                lblSiLe.setBounds(10, 236, 333, 14);
                panel.add(lblSiLe);
                
                JLabel lblAlOcasionar = new JLabel("11. Al ocasionar un problema");
                lblAlOcasionar.setBounds(10, 266, 243, 14);
                panel.add(lblAlOcasionar);
                
                JLabel lblUnCliente = new JLabel("12. Un cliente le solicita un servicio que usted puede cumplir en el momento");
                lblUnCliente.setBounds(10, 291, 401, 14);
                panel.add(lblUnCliente);
                
                JLabel lblCuandoEl = new JLabel("<html>13. Cuando el tel&eacute;fono suena, usted</html>");
                lblCuandoEl.setBounds(10, 316, 232, 14);
                panel.add(lblCuandoEl);
                
                JLabel lblhaDivagado = new JLabel("<html>14. \u00BFHa divagado alguna vez con un plan de vida en el &aacute;mbito profesional?</html>");
                lblhaDivagado.setBounds(10, 341, 416, 14);
                panel.add(lblhaDivagado);
                
                JLabel lblEnUna_1 = new JLabel("15. En una fiesta");
                lblEnUna_1.setBounds(10, 366, 272, 14);
                panel.add(lblEnUna_1);
                
                JLabel lblEsMs = new JLabel("<html>16. Es m&aacute;s dif&iacute;cil para ti</html>");
                lblEsMs.setBounds(10, 391, 243, 14);
                panel.add(lblEsMs);
                
                JLabel lblTeAtraen = new JLabel("<html>17. Te atraen m&aacute;s la personas que</html>");
                lblTeAtraen.setBounds(10, 416, 243, 14);
                panel.add(lblTeAtraen);
                
                JLabel lblseSiente = new JLabel("18. \u00BFSe siente usted satisfecho con su actual trabajo?");
                lblseSiente.setBounds(10, 441, 333, 14);
                panel.add(lblseSiente);
                
                JLabel lblEsMs_1 = new JLabel("<html>19. Es m&aacute;s com&uacute;n que conf&iacute;es en\r\n</html>");
                lblEsMs_1.setBounds(10, 466, 333, 14);
                panel.add(lblEsMs_1);
                
                JLabel lblUstedSuele = new JLabel("20. Usted suele");
                lblUstedSuele.setBounds(10, 491, 333, 14);
                panel.add(lblUstedSuele);
                
                JLabel lblQueCaracteristica = new JLabel("<html>21. Que caracteristica usted admira m&aacute;s\r\n</html>");
                lblQueCaracteristica.setBounds(10, 516, 333, 14);
                panel.add(lblQueCaracteristica);
                
                JLabel lblSuNivel = new JLabel("22. Su nivel de estudio comprende");
                lblSuNivel.setBounds(10, 541, 333, 14);
                panel.add(lblSuNivel);
                
                JLabel lblDeberaUno = new JLabel("<html>23. Deber&eacute;a uno dejar que los eventos ocurra\r\nn</html>");
                lblDeberaUno.setBounds(10, 566, 333, 14);
                panel.add(lblDeberaUno);
                
                JLabel lblQueEs = new JLabel("<html>24. Que es m&aacute;s admirable</html>");
                lblQueEs.setBounds(10, 591, 333, 14);
                panel.add(lblQueEs);
                
                comboBox = new JComboBox();
                comboBox.addItemListener(new EventListener(0,postulante,comboBox));
                comboBox.setModel(new DefaultComboBoxModel(new String[] {"Se enfoca en las causas", "Busca variables asociadas y las subdivide"}));
                
                comboBox.setBounds(432, 8, 401, 20);
                panel.add(comboBox);
                
                comboBox_1 = new JComboBox();
                comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Generar impacto en los asistentes", "Lograr que lo que se expone sea entendido por los asistentes"}));
                comboBox_1.addItemListener(new EventListener(1,postulante,comboBox_1));
                comboBox_1.setBounds(432, 33, 401, 20);
                panel.add(comboBox_1);
                
                comboBox_2 = new JComboBox();
                comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Establecer  relaciones puntualmente en relaci\u00F3n al desarrollo de las actividades", "Establecer relaciones socialmente cercanas"}));
                comboBox_2.addItemListener(new EventListener(2,postulante,comboBox_2));
                comboBox_2.setBounds(432, 58, 401, 20);
                panel.add(comboBox_2);
                
                comboBox_3 = new JComboBox();
                comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"el azar", "la causa y efecto"}));
                comboBox_3.addItemListener(new EventListener(3,postulante,comboBox_3));
                comboBox_3.setBounds(432, 83, 401, 20);
                panel.add(comboBox_3);
                
                comboBox_4 = new JComboBox();
                comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"que su trabajo logre aceptaci\u00F3n en las personas involucradas", "buscar soluciones que generen un cambio desde su perspectiva"}));
                comboBox_4.addItemListener(new EventListener(4,postulante,comboBox_4));
                comboBox_4.setBounds(432, 108, 401, 20);
                panel.add(comboBox_4);
                
                comboBox_5 = new JComboBox();
                comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"se retroalimenta del pasado", "augura los posibles escenarios"}));
                comboBox_5.addItemListener(new EventListener(5,postulante,comboBox_5));
                comboBox_5.setBounds(432, 133, 401, 20);
                panel.add(comboBox_5);
                
                comboBox_6 = new JComboBox();
                comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"atribuye la responsabilidad del incumplimiento a los culpables respectivos", "realiza las actividades ajenas a su responsabilidad para cumplir lo establecido"}));
                comboBox_6.addItemListener(new EventListener(6,postulante,comboBox_6));
                comboBox_6.setBounds(432, 158, 401, 20);
                panel.add(comboBox_6);
                
                comboBox_7 = new JComboBox();
                comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"el premio en dinero, no importa en que lugar llegue", "ser el primero aunque no haya recompensa"}));
                comboBox_7.addItemListener(new EventListener(7,postulante,comboBox_7));
                comboBox_7.setBounds(432, 183, 401, 20);
                panel.add(comboBox_7);
                
                comboBox_8 = new JComboBox();
                comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Personas que viven el dia a dia", "Tienen un prop\u00F3sito a futuro claro de vida"}));
                comboBox_8.addItemListener(new EventListener(8,postulante,comboBox_8));
                comboBox_8.setBounds(432, 208, 401, 20);
                panel.add(comboBox_8);
                
                comboBox_9 = new JComboBox();
                comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Jefe de RR.HH", "Gerente de finanzas de Microsoft"}));
                comboBox_9.addItemListener(new EventListener(9,postulante,comboBox_9));
                comboBox_9.setBounds(432, 233, 401, 20);
                panel.add(comboBox_9);
                
                comboBox_10 = new JComboBox();
                comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"Prefiere investigar bien para saber si es realmente su culpa", "Asume que fui directamente su culpa"}));
                comboBox_10.addItemListener(new EventListener(10,postulante,comboBox_10));
                comboBox_10.setBounds(432, 263, 401, 20);
                panel.add(comboBox_10);
                
                comboBox_11 = new JComboBox();
                comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"Es criterioso con el cliente y le realiza la consulta sabiendo que esto es en beneficio de la empresa", "Le pide que siga el conducto regular, ya que esto ayuda a consolidar la empresa."}));
                comboBox_11.addItemListener(new EventListener(11,postulante,comboBox_11));
                comboBox_11.setBounds(432, 288, 401, 20);
                panel.add(comboBox_11);
                
                comboBox_12 = new JComboBox();
                comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"esperas que alguien m\u00E1s conteste", "Se apura por llegar primero y contestar"}));
                comboBox_12.addItemListener(new EventListener(12,postulante,comboBox_12));
                comboBox_12.setBounds(432, 313, 401, 20);
                panel.add(comboBox_12);
                
                comboBox_13 = new JComboBox();
                comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
                comboBox_13.addItemListener(new EventListener(13,postulante,comboBox_13));
                comboBox_13.setBounds(432, 338, 401, 20);
                panel.add(comboBox_13);
                
                comboBox_14 = new JComboBox();
                comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"interact\u00FAas con pocos, solo con tus conocidos", "interact\u00FAas con varios, incluso con los que no conoces"}));
                comboBox_14.addItemListener(new EventListener(14,postulante,comboBox_14));
                comboBox_14.setBounds(432, 366, 401, 20);
                panel.add(comboBox_14);
                
                comboBox_15 = new JComboBox();
                comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"identificarse con otros", "utilizar a otros"}));
                comboBox_15.addItemListener(new EventListener(15,postulante,comboBox_15));
                comboBox_15.setBounds(432, 391, 401, 20);
                panel.add(comboBox_15);
                
                comboBox_16 = new JComboBox();
                comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"Personas que viven el dia a dia", "Tienen un prop\u00F3sito a futuro claro de vida"}));
                comboBox_16.addItemListener(new EventListener(16,postulante,comboBox_16));
                comboBox_16.setBounds(432, 413, 401, 20);
                panel.add(comboBox_16);
                
                comboBox_17 = new JComboBox();
                comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"Si, estoy bien donde estoy", "No,quiero algo mejor"}));
                comboBox_17.addItemListener(new EventListener(17,postulante,comboBox_17));
                comboBox_17.setBounds(432, 438, 401, 20);
                panel.add(comboBox_17);
                
                comboBox_18 = new JComboBox();
                comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"una corazonada", "la experiencia"}));
                comboBox_18.addItemListener(new EventListener(18,postulante,comboBox_18));
                comboBox_18.setBounds(432, 463, 401, 20);
                panel.add(comboBox_18);
                
                comboBox_19 = new JComboBox();
                comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"Retrasarse a un evento de poca importancia", "Llegar a tiempo a un evento de importancia"}));
                comboBox_19.addItemListener(new EventListener(19,postulante,comboBox_19));
                comboBox_19.setBounds(432, 488, 401, 20);
                panel.add(comboBox_19);
                
                comboBox_20 = new JComboBox();
                comboBox_20.setModel(new DefaultComboBoxModel(new String[] {"una persona que puede descansar y tenga mucho tiempo libre", "una persona que es esforzada que le agrade  trabajar"}));
                comboBox_20.addItemListener(new EventListener(20,postulante,comboBox_20));
                comboBox_20.setBounds(432, 513, 401, 20);
                panel.add(comboBox_20);
                
                comboBox_21 = new JComboBox();
                comboBox_21.setModel(new DefaultComboBoxModel(new String[] {"1ero a 8vo b\u00E1sico", "ense\u00F1anza media o superior completa"}));
                comboBox_21.addItemListener(new EventListener(21,postulante,comboBox_21));
                comboBox_21.setBounds(432, 538, 401, 20);
                panel.add(comboBox_21);
                
                comboBox_22 = new JComboBox();
                comboBox_22.setModel(new DefaultComboBoxModel(new String[] {"al azar y por casualidad", "por selecci\u00F3n y elecci\u00F3n cuidadosa"}));
                comboBox_22.addItemListener(new EventListener(22,postulante,comboBox_22));
                comboBox_22.setBounds(432, 563, 401, 20);
                panel.add(comboBox_22);
                
                comboBox_23 = new JComboBox();
                comboBox_23.setModel(new DefaultComboBoxModel(new String[] {"la habilidad para adaptarse y arreglarse con lo que hay", "la habilidad para organizar y ser met\u00F3dico"}));
                comboBox_23.addItemListener(new EventListener(23,postulante,comboBox_23));
                comboBox_23.setBounds(432, 588, 401, 20);
                panel.add(comboBox_23);
        }
        

}
