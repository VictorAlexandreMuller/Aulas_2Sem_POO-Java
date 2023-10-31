package forms;

import dao.CategoriaProdutoDAO;
import entity.CategoriaProduto;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import utils.TableModelCreator;

public class ListarCategoria extends javax.swing.JInternalFrame {

    private static ListarCategoria myInstance;
    private int idSelecionado = 0;
    
    public ListarCategoria() {
        initComponents();
    }
    
    

    public static ListarCategoria getInstance() {
        if (myInstance == null) {
            myInstance = new ListarCategoria();
        }
        return myInstance;
    }
    
    
    
    public void atualizarTabela(){
        
        List<String> colunasVisiveis = new ArrayList<>
        (Arrays.asList("id", "descricao"));
        
        try{
            List<CategoriaProduto>lista = new CategoriaProdutoDAO().selecionarTodos();
            TableModel model = TableModelCreator.createTableModel(CategoriaProduto.class, lista, colunasVisiveis);
            jTable1.setModel(model);
        } catch(Exception e){
        System.err.println(e.getMessage());
    }
    }
    
    
    // Não apagar este comentário: Propriedade Enable dos botoes Editar e Excluir são desmarcadas
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNOVO = new javax.swing.JButton();
        btnEXCLUIR = new javax.swing.JButton();
        btnEDITAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(" Listar Categorias");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        btnNOVO.setText("Novo");
        btnNOVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOVOActionPerformed(evt);
            }
        });

        btnEXCLUIR.setText("Excluir");
        btnEXCLUIR.setEnabled(false);
        btnEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRActionPerformed(evt);
            }
        });

        btnEDITAR.setText("Editar");
        btnEDITAR.setEnabled(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNOVO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNOVO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOVOActionPerformed
        CadastrarCategoria categ = new CadastrarCategoria(null, true);
        categ.setVisible(true);
    }//GEN-LAST:event_btnNOVOActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        atualizarTabela();
    }//GEN-LAST:event_formInternalFrameActivated

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        jTable1.addMouseListener(new MouseAdapter() {
            
            int previousClickCount = 0;
            
            public void mouseClicked(MouseEvent e) {
                
                if (e.getClickCount() == 1 && e.getClickCount() != previousClickCount) {
                    JTable source = (JTable) evt.getSource();
                    int row = source.rowAtPoint(evt.getPoint());
                    int column = jTable1.convertColumnIndexToView(jTable1.getColumn("Id ").getModelIndex());
                    idSelecionado = Integer.parseInt(source.getModel().getValueAt(row, column) + "");
                    btnEDITAR.setEnabled(true);
                    btnEXCLUIR.setEnabled(true);
                    
                } else if (e.getClickCount() == 2){
                    JTable source = (JTable) e.getSource();
                    int row = source.getSelectedRow();
                    int column = jTable1.convertColumnIndexToView(jTable1.getColumn("Id ").getModelIndex());
                    String s = source.getModel().getValueAt(row, column) + "";
                    JOptionPane.showMessageDialog(null, s);
                    
                }
            }
        });

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        // TODO add your handling code here:
        
        if(JOptionPane.showConfirmDialog(this, "Confirma a exclusão?", "Atenção", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            CategoriaProdutoDAO cDAO = new CategoriaProdutoDAO();
            CategoriaProduto c = cDAO.selecionarPorCodigo(idSelecionado);
            cDAO.excluir(c);
            JOptionPane.showMessageDialog(this, "Excluído!");
            atualizarTabela();
        }
        
    }//GEN-LAST:event_btnEXCLUIRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEDITAR;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnNOVO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
