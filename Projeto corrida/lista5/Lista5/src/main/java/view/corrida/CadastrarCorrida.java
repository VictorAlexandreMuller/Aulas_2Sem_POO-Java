package view.corrida;

import dao.CorridaDAO;
import dao.MotoristaDAO;
import dao.UsuarioDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Corrida;
import model.Motorista;
import model.Usuario;

public class CadastrarCorrida extends javax.swing.JInternalFrame {

    public CadastrarCorrida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        origem = new javax.swing.JTextField();
        destino = new javax.swing.JTextField();
        comboBoxUsuario = new javax.swing.JComboBox<>();
        comboBoxMotorista = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Corrida");

        jLabel1.setText("Nova corrida");

        jLabel2.setText("Usuário:");

        jLabel3.setText("Motorista:");

        jLabel4.setText("Origem:");

        jLabel5.setText("Destino:");

        comboBoxUsuario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                comboBoxUsuarioAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        comboBoxMotorista.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                comboBoxMotoristaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton1.setText("Criar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(origem)
                            .addComponent(destino)
                            .addComponent(comboBoxUsuario, 0, 166, Short.MAX_VALUE)
                            .addComponent(comboBoxMotorista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(origem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxUsuarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_comboBoxUsuarioAncestorAdded
        UsuarioDAO userDAO = new UsuarioDAO();
        ArrayList<Usuario> usuarios = userDAO.selecionar();

        this.comboBoxUsuario.removeAll();

        for (Usuario u : usuarios) {
            this.comboBoxUsuario.addItem(u);
        }
    }//GEN-LAST:event_comboBoxUsuarioAncestorAdded

    private void comboBoxMotoristaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_comboBoxMotoristaAncestorAdded
        MotoristaDAO motoristaDAO = new MotoristaDAO();
        ArrayList<Motorista> motoristas = motoristaDAO.selecionar();

        this.comboBoxMotorista.removeAll();

        for (Motorista m : motoristas) {
            this.comboBoxMotorista.addItem(m);
        }
    }//GEN-LAST:event_comboBoxMotoristaAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CorridaDAO corridaDAO = new CorridaDAO();
        Usuario user = (Usuario) this.comboBoxUsuario.getSelectedItem();
        Motorista driver = (Motorista) this.comboBoxMotorista.getSelectedItem();
        String origemValue = this.origem.getText();
        String destinoValue = this.destino.getText();

        Corrida corridaNew = new Corrida(user, origemValue, destinoValue, driver);
        corridaDAO.inserir(corridaNew);

        if (corridaNew != null) {
            JOptionPane.showMessageDialog(null, "Corrida cadastrada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Tente novamente!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Motorista> comboBoxMotorista;
    private javax.swing.JComboBox<Usuario> comboBoxUsuario;
    private javax.swing.JTextField destino;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField origem;
    // End of variables declaration//GEN-END:variables
}
