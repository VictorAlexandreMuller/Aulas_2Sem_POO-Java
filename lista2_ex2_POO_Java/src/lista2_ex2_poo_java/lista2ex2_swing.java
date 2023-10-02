package lista2_ex2_poo_java;

import javax.swing.JOptionPane;

public class lista2ex2_swing extends javax.swing.JFrame {

    public lista2ex2_swing() {
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
        BOTAO_CADASTRAR_VENDEDOR___ = new javax.swing.JButton();
        BOTAO_CALCULAR_COMISSAO___ = new javax.swing.JButton();
        BOTAO_SAIR___ = new javax.swing.JButton();
        txtCODIGO = new javax.swing.JTextField();
        txtNOME = new javax.swing.JTextField();
        txtVALORVENDA = new javax.swing.JTextField();
        txtPORCENTAGEMDESCONTO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDESCONTO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Vendedor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel3.setText("% Comissão");

        jLabel4.setText("Valor Venda");

        BOTAO_CADASTRAR_VENDEDOR___.setText("Cadastrar Vendedor");
        BOTAO_CADASTRAR_VENDEDOR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_CADASTRAR_VENDEDOR___ActionPerformed(evt);
            }
        });

        BOTAO_CALCULAR_COMISSAO___.setText("Calcular Comissão");
        BOTAO_CALCULAR_COMISSAO___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_CALCULAR_COMISSAO___ActionPerformed(evt);
            }
        });

        BOTAO_SAIR___.setText("Sair");
        BOTAO_SAIR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_SAIR___ActionPerformed(evt);
            }
        });

        jLabel5.setText("Desconto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BOTAO_CADASTRAR_VENDEDOR___, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAO_SAIR___, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAO_CALCULAR_COMISSAO___, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel5))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCODIGO, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(txtNOME)
                    .addComponent(txtVALORVENDA)
                    .addComponent(txtPORCENTAGEMDESCONTO)
                    .addComponent(txtDESCONTO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVALORVENDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPORCENTAGEMDESCONTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDESCONTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(BOTAO_CADASTRAR_VENDEDOR___)
                .addGap(18, 18, 18)
                .addComponent(BOTAO_CALCULAR_COMISSAO___)
                .addGap(18, 18, 18)
                .addComponent(BOTAO_SAIR___)
                .addGap(20, 20, 20))
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

    private Vendedor vendedor;
    
    private void BOTAO_CADASTRAR_VENDEDOR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_CADASTRAR_VENDEDOR___ActionPerformed
        vendedor = new Vendedor();
        vendedor.setCodigo(Integer.parseInt(txtCODIGO.getText()));
        vendedor.setNome(txtNOME.getText());
        vendedor.setPercentualComissao(Double.parseDouble(txtPORCENTAGEMDESCONTO.getText()));
        JOptionPane.showMessageDialog(this, "O vendedor foi cadastrado com sucesso.");
    }//GEN-LAST:event_BOTAO_CADASTRAR_VENDEDOR___ActionPerformed

    private void BOTAO_CALCULAR_COMISSAO___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_CALCULAR_COMISSAO___ActionPerformed
        double valorVenda = Double.parseDouble(txtVALORVENDA.getText());
        double desconto = Double.parseDouble(txtDESCONTO.getText());
        if (vendedor == null){
            JOptionPane.showMessageDialog(this, "Não é possível calcular a comissão, pois não há nenhum vendedor cadastrado");
        } else{
            JOptionPane.showMessageDialog(this, vendedor.imprimir(valorVenda, desconto));
        }
    }//GEN-LAST:event_BOTAO_CALCULAR_COMISSAO___ActionPerformed

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
            java.util.logging.Logger.getLogger(lista2ex2_swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista2ex2_swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista2ex2_swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista2ex2_swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lista2ex2_swing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAO_CADASTRAR_VENDEDOR___;
    private javax.swing.JButton BOTAO_CALCULAR_COMISSAO___;
    private javax.swing.JButton BOTAO_SAIR___;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCODIGO;
    private javax.swing.JTextField txtDESCONTO;
    private javax.swing.JTextField txtNOME;
    private javax.swing.JTextField txtPORCENTAGEMDESCONTO;
    private javax.swing.JTextField txtVALORVENDA;
    // End of variables declaration//GEN-END:variables
}
