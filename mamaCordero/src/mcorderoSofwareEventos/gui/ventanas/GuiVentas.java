package mcorderoSofwareEventos.gui.ventanas;

public class GuiVentas extends javax.swing.JFrame {
    


    public GuiVentas() {
         
        initComponents();
        this.setLocationRelativeTo(null);
    
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonChao = new javax.swing.JButton();
        jButtonMatrimonios = new javax.swing.JButton();
        jButtonCenas = new javax.swing.JButton();
        jButtonblablabla = new javax.swing.JButton();
        jButtonGalas = new javax.swing.JButton();
        jButtonBautizos = new javax.swing.JButton();
        jButtonCumpleaños = new javax.swing.JButton();
        fnsegundo = new javax.swing.JLabel();
        barramom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        fnprincipal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonChao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonChao.setForeground(new java.awt.Color(255, 153, 0));
        jButtonChao.setText("SALIR");
        jButtonChao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonChao, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 90, 30));

        jButtonMatrimonios.setForeground(new java.awt.Color(255, 153, 0));
        jButtonMatrimonios.setText("Matrimonios");
        getContentPane().add(jButtonMatrimonios, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 110, 20));

        jButtonCenas.setForeground(new java.awt.Color(255, 153, 0));
        jButtonCenas.setText("Cenas");
        getContentPane().add(jButtonCenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 110, 20));

        jButtonblablabla.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonblablabla.setForeground(new java.awt.Color(255, 153, 0));
        jButtonblablabla.setText("Bla BLa BLa");
        getContentPane().add(jButtonblablabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 110, 20));

        jButtonGalas.setForeground(new java.awt.Color(255, 153, 0));
        jButtonGalas.setText("Galas");
        getContentPane().add(jButtonGalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 110, 20));

        jButtonBautizos.setForeground(new java.awt.Color(255, 153, 0));
        jButtonBautizos.setText("Bautizos");
        getContentPane().add(jButtonBautizos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 110, 20));

        jButtonCumpleaños.setForeground(new java.awt.Color(255, 153, 0));
        jButtonCumpleaños.setText("Cumpleaños");
        jButtonCumpleaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCumpleañosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCumpleaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 110, 20));

        fnsegundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/barrasa-emplatado-3.jpg"))); // NOI18N
        getContentPane().add(fnsegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 500, 370));

        barramom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/barra.png"))); // NOI18N
        getContentPane().add(barramom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contactos:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registros:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lugar / Local:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Servicios:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 30, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 30, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 190, 30, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 30, -1));

        fnprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/C55.jpg"))); // NOI18N
        getContentPane().add(fnprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 780, 480));

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCumpleañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCumpleañosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCumpleañosActionPerformed

    private void jButtonChaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChaoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonChaoActionPerformed


    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barramom;
    private javax.swing.JLabel fnprincipal;
    private javax.swing.JLabel fnsegundo;
    private javax.swing.JButton jButtonBautizos;
    private javax.swing.JButton jButtonCenas;
    private javax.swing.JButton jButtonChao;
    private javax.swing.JButton jButtonCumpleaños;
    private javax.swing.JButton jButtonGalas;
    private javax.swing.JButton jButtonMatrimonios;
    private javax.swing.JButton jButtonblablabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
