package view.principal;

import view.corrida.AlterarCorrida;
import view.corrida.CadastrarCorrida;
import view.corrida.ExcluirCorrida;
import view.corrida.VisualizaCorridas;
import view.corrida.VisualizarCorrida;
import view.motorista.AlterarMotorista;
import view.usuario.AlterarUsuario;
import view.usuario.CadastrarUsuario;
import view.usuario.ExcluirUsuario;
import view.usuario.VisualizarUsuario;
import view.usuario.VisualizarUsuarios;
import view.motorista.CadastroMotorista;
import view.motorista.ExcluirMotorista;
import view.motorista.VisualizarMotorista;
import view.motorista.VisualizarMotoristas;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CADASTRAR_USUARIO = new javax.swing.JMenuItem();
        ALTERAR_USUARIO = new javax.swing.JMenuItem();
        EXCLUIR_USUARIO = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        VISUALIZAR_TODOS_USUARIOS = new javax.swing.JMenuItem();
        VISUALIZAR_USUARIOS = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        NOVA_CORRIDA = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        cadastrarMOTORISTA = new javax.swing.JMenu();
        CADASTRAR_MOTORISTA = new javax.swing.JMenuItem();
        ALTERAR_MOTORISTA = new javax.swing.JMenuItem();
        EXCLUIR_MOTORISTA = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        VISUALIZAR_TODOS_MOTORISTAS = new javax.swing.JMenuItem();
        VISUALIZAR_INDIVIDUAL_MOTORISTA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1352, 870));

        jDesktopPane1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jMenu1.setText("Usuario");

        CADASTRAR_USUARIO.setText("Cadastrar");
        CADASTRAR_USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRAR_USUARIOActionPerformed(evt);
            }
        });
        jMenu1.add(CADASTRAR_USUARIO);

        ALTERAR_USUARIO.setText("Alterar");
        ALTERAR_USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTERAR_USUARIOActionPerformed(evt);
            }
        });
        jMenu1.add(ALTERAR_USUARIO);

        EXCLUIR_USUARIO.setText("Excluir");
        EXCLUIR_USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXCLUIR_USUARIOActionPerformed(evt);
            }
        });
        jMenu1.add(EXCLUIR_USUARIO);
        jMenu1.add(jSeparator2);

        VISUALIZAR_TODOS_USUARIOS.setText("Visualizar Todos");
        VISUALIZAR_TODOS_USUARIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VISUALIZAR_TODOS_USUARIOSActionPerformed(evt);
            }
        });
        jMenu1.add(VISUALIZAR_TODOS_USUARIOS);

        VISUALIZAR_USUARIOS.setText("Visualizar Individual");
        VISUALIZAR_USUARIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VISUALIZAR_USUARIOSActionPerformed(evt);
            }
        });
        jMenu1.add(VISUALIZAR_USUARIOS);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Corrida");

        NOVA_CORRIDA.setText("Cadastrar");
        NOVA_CORRIDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOVA_CORRIDAActionPerformed(evt);
            }
        });
        jMenu2.add(NOVA_CORRIDA);

        jMenuItem1.setText("Alterar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Excluir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator3);

        jMenuItem3.setText("Visualizar Todas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Visualizar Individual");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        cadastrarMOTORISTA.setText("Motorista");

        CADASTRAR_MOTORISTA.setText("Cadastrar");
        CADASTRAR_MOTORISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRAR_MOTORISTAActionPerformed(evt);
            }
        });
        cadastrarMOTORISTA.add(CADASTRAR_MOTORISTA);

        ALTERAR_MOTORISTA.setText("Alterar");
        ALTERAR_MOTORISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALTERAR_MOTORISTAActionPerformed(evt);
            }
        });
        cadastrarMOTORISTA.add(ALTERAR_MOTORISTA);

        EXCLUIR_MOTORISTA.setText("Excluir");
        EXCLUIR_MOTORISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXCLUIR_MOTORISTAActionPerformed(evt);
            }
        });
        cadastrarMOTORISTA.add(EXCLUIR_MOTORISTA);
        cadastrarMOTORISTA.add(jSeparator1);

        VISUALIZAR_TODOS_MOTORISTAS.setText("Visualizar Todos");
        VISUALIZAR_TODOS_MOTORISTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VISUALIZAR_TODOS_MOTORISTASActionPerformed(evt);
            }
        });
        cadastrarMOTORISTA.add(VISUALIZAR_TODOS_MOTORISTAS);

        VISUALIZAR_INDIVIDUAL_MOTORISTA.setText("Visualizar Individual");
        VISUALIZAR_INDIVIDUAL_MOTORISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VISUALIZAR_INDIVIDUAL_MOTORISTAActionPerformed(evt);
            }
        });
        cadastrarMOTORISTA.add(VISUALIZAR_INDIVIDUAL_MOTORISTA);

        jMenuBar1.add(cadastrarMOTORISTA);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CADASTRAR_USUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTRAR_USUARIOActionPerformed
        CadastrarUsuario userAdd = new CadastrarUsuario();
        this.jDesktopPane1.add(userAdd);
        userAdd.setVisible(true);
    }//GEN-LAST:event_CADASTRAR_USUARIOActionPerformed

    private void EXCLUIR_USUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXCLUIR_USUARIOActionPerformed
        ExcluirUsuario userDelete = new ExcluirUsuario();
        this.jDesktopPane1.add(userDelete);
        userDelete.setVisible(true);
    }//GEN-LAST:event_EXCLUIR_USUARIOActionPerformed

    private void VISUALIZAR_TODOS_MOTORISTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VISUALIZAR_TODOS_MOTORISTASActionPerformed
        VisualizarMotoristas visuNew = new VisualizarMotoristas();
        this.jDesktopPane1.add(visuNew);
        visuNew.setVisible(true);
    }//GEN-LAST:event_VISUALIZAR_TODOS_MOTORISTASActionPerformed

    private void CADASTRAR_MOTORISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTRAR_MOTORISTAActionPerformed
        CadastroMotorista MotoNew = new CadastroMotorista();
        this.jDesktopPane1.add(MotoNew);
        MotoNew.setVisible(true);
    }//GEN-LAST:event_CADASTRAR_MOTORISTAActionPerformed

    private void VISUALIZAR_USUARIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VISUALIZAR_USUARIOSActionPerformed
        VisualizarUsuario usersView = new VisualizarUsuario();
        this.jDesktopPane1.add(usersView);
        usersView.setVisible(true);
    }//GEN-LAST:event_VISUALIZAR_USUARIOSActionPerformed

    private void VISUALIZAR_TODOS_USUARIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VISUALIZAR_TODOS_USUARIOSActionPerformed
        VisualizarUsuarios userView = new VisualizarUsuarios();
        this.jDesktopPane1.add(userView);
        userView.setVisible(true);
    }//GEN-LAST:event_VISUALIZAR_TODOS_USUARIOSActionPerformed

    private void ALTERAR_USUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTERAR_USUARIOActionPerformed
        AlterarUsuario userChange = new AlterarUsuario();
        this.jDesktopPane1.add(userChange);
        userChange.setVisible(true);
    }//GEN-LAST:event_ALTERAR_USUARIOActionPerformed

    private void NOVA_CORRIDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOVA_CORRIDAActionPerformed
        CadastrarCorrida corridaNew = new CadastrarCorrida();
        this.jDesktopPane1.add(corridaNew);
        corridaNew.setVisible(true);
    }//GEN-LAST:event_NOVA_CORRIDAActionPerformed

    private void VISUALIZAR_INDIVIDUAL_MOTORISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VISUALIZAR_INDIVIDUAL_MOTORISTAActionPerformed
        VisualizarMotorista motoristaIndiv = new VisualizarMotorista();
        this.jDesktopPane1.add(motoristaIndiv);
        motoristaIndiv.setVisible(true);
    }//GEN-LAST:event_VISUALIZAR_INDIVIDUAL_MOTORISTAActionPerformed

    private void ALTERAR_MOTORISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALTERAR_MOTORISTAActionPerformed
        AlterarMotorista motoristaAlterar = new AlterarMotorista();
        this.jDesktopPane1.add(motoristaAlterar);
        motoristaAlterar.setVisible(true);
    }//GEN-LAST:event_ALTERAR_MOTORISTAActionPerformed

    private void EXCLUIR_MOTORISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXCLUIR_MOTORISTAActionPerformed
        ExcluirMotorista motoristaDelete = new ExcluirMotorista();
        this.jDesktopPane1.add(motoristaDelete);
        motoristaDelete.setVisible(true);
    }//GEN-LAST:event_EXCLUIR_MOTORISTAActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        VisualizaCorridas corridas = new VisualizaCorridas();
        this.jDesktopPane1.add(corridas);
        corridas.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AlterarCorrida alterarCorrida = new AlterarCorrida();
        this.jDesktopPane1.add(alterarCorrida);
        alterarCorrida.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        VisualizarCorrida visualizarCorrida = new VisualizarCorrida();
        this.jDesktopPane1.add(visualizarCorrida);
        visualizarCorrida.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ExcluirCorrida excluirCorrida = new ExcluirCorrida();
        this.jDesktopPane1.add(excluirCorrida);
        excluirCorrida.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ALTERAR_MOTORISTA;
    private javax.swing.JMenuItem ALTERAR_USUARIO;
    private javax.swing.JMenuItem CADASTRAR_MOTORISTA;
    private javax.swing.JMenuItem CADASTRAR_USUARIO;
    private javax.swing.JMenuItem EXCLUIR_MOTORISTA;
    private javax.swing.JMenuItem EXCLUIR_USUARIO;
    private javax.swing.JMenuItem NOVA_CORRIDA;
    private javax.swing.JMenuItem VISUALIZAR_INDIVIDUAL_MOTORISTA;
    private javax.swing.JMenuItem VISUALIZAR_TODOS_MOTORISTAS;
    private javax.swing.JMenuItem VISUALIZAR_TODOS_USUARIOS;
    private javax.swing.JMenuItem VISUALIZAR_USUARIOS;
    private javax.swing.JMenu cadastrarMOTORISTA;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
