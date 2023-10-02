package lista2_ex1_poo_java;

import javax.swing.JOptionPane;

public class lista2ex1_swing extends javax.swing.JFrame {

    public lista2ex1_swing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboSEXO = new javax.swing.JComboBox<>();
        txtIDADE = new javax.swing.JTextField();
        txtNOME = new javax.swing.JTextField();
        txtNUMERO = new javax.swing.JTextField();
        txtVALORAUTOMOVEL = new javax.swing.JTextField();
        BOTAO_CRIAR___ = new javax.swing.JButton();
        BOTAO_VER_DADOS___ = new javax.swing.JButton();
        BOTAO_SAIR___ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "APÓLICE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setText("Número");

        jLabel2.setText("Nome");

        jLabel3.setText("Idade");
        jLabel3.setToolTipText("");

        jLabel4.setText("Sexo");

        jLabel5.setText("Valor do Automóvel");

        comboSEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "M", "F" }));

        BOTAO_CRIAR___.setText("Criar Apólice");
        BOTAO_CRIAR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_CRIAR___ActionPerformed(evt);
            }
        });

        BOTAO_VER_DADOS___.setText("Ver Dados Apólice");
        BOTAO_VER_DADOS___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_VER_DADOS___ActionPerformed(evt);
            }
        });

        BOTAO_SAIR___.setText("Sair");
        BOTAO_SAIR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_SAIR___ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboSEXO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVALORAUTOMOVEL)
                    .addComponent(txtNUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNOME)
                    .addComponent(txtIDADE))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BOTAO_SAIR___, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAO_VER_DADOS___, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAO_CRIAR___, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboSEXO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtVALORAUTOMOVEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(BOTAO_CRIAR___)
                .addGap(18, 18, 18)
                .addComponent(BOTAO_VER_DADOS___)
                .addGap(18, 18, 18)
                .addComponent(BOTAO_SAIR___)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTAO_SAIR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_SAIR___ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BOTAO_SAIR___ActionPerformed

    private Apolice apolice;
    
    private void BOTAO_CRIAR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_CRIAR___ActionPerformed
        apolice = new Apolice();
        apolice.setNumero(Integer.parseInt(txtNUMERO.getText()));
        apolice.setNome(txtNOME.getText());
        apolice.setIdade(Integer.parseInt(txtIDADE.getText()));
        apolice.setSexo(comboSEXO.getSelectedItem().toString().charAt(0));
        apolice.setValorAutomovel(Double.parseDouble(txtVALORAUTOMOVEL.getText()));
        JOptionPane.showMessageDialog(this, "Seu apólice foi calculado com sucesso.");
    }//GEN-LAST:event_BOTAO_CRIAR___ActionPerformed

    private void BOTAO_VER_DADOS___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_VER_DADOS___ActionPerformed
        if (apolice == null){
            JOptionPane.showMessageDialog(this, "Você não preencheu nenhum apólice a ser calculado");
        } else {
            JOptionPane.showMessageDialog(this, apolice.imprimir());
        }
    }//GEN-LAST:event_BOTAO_VER_DADOS___ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(lista2ex1_swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista2ex1_swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista2ex1_swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista2ex1_swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lista2ex1_swing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAO_CRIAR___;
    private javax.swing.JButton BOTAO_SAIR___;
    private javax.swing.JButton BOTAO_VER_DADOS___;
    private javax.swing.JComboBox<String> comboSEXO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtIDADE;
    private javax.swing.JTextField txtNOME;
    private javax.swing.JTextField txtNUMERO;
    private javax.swing.JTextField txtVALORAUTOMOVEL;
    // End of variables declaration//GEN-END:variables
}
