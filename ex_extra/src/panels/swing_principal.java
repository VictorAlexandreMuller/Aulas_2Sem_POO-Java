package panels;

import classes.Aluno;
import classes.Atendente;
import classes.Disciplina;
import classes.Funcionario;
import classes.Pessoa;
import classes.Professor;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class swing_principal extends javax.swing.JFrame {
    
    
    public swing_principal() {
        initComponents();
    }
    
    ArrayList<Pessoa> lstPessoas = new ArrayList<>();
    ArrayList<Disciplina> lstDisciplinas = new ArrayList<>();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_inserir_Disciplina = new javax.swing.JButton();
        btn_inserir_Professor = new javax.swing.JButton();
        btn_inserir_Atendente = new javax.swing.JButton();
        btn_inserir_Aluno = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_Atribuir_DiscpAoProf = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_Mostrar_Pessoas = new javax.swing.JButton();
        btn_Mostrar_Disciplinas = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_Atribuir_Bonificacao = new javax.swing.JButton();
        btn_Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "INSERIR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        btn_inserir_Disciplina.setBackground(new java.awt.Color(204, 255, 204));
        btn_inserir_Disciplina.setText("Disciplina");
        btn_inserir_Disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserir_DisciplinaActionPerformed(evt);
            }
        });

        btn_inserir_Professor.setBackground(new java.awt.Color(204, 255, 204));
        btn_inserir_Professor.setText("Professor");
        btn_inserir_Professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserir_ProfessorActionPerformed(evt);
            }
        });

        btn_inserir_Atendente.setBackground(new java.awt.Color(204, 255, 204));
        btn_inserir_Atendente.setText("Atendente");
        btn_inserir_Atendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserir_AtendenteActionPerformed(evt);
            }
        });

        btn_inserir_Aluno.setBackground(new java.awt.Color(204, 255, 204));
        btn_inserir_Aluno.setText("Aluno");
        btn_inserir_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserir_AlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_inserir_Disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_inserir_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_inserir_Atendente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_inserir_Aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inserir_Disciplina)
                    .addComponent(btn_inserir_Professor)
                    .addComponent(btn_inserir_Atendente)
                    .addComponent(btn_inserir_Aluno))
                .addGap(14, 14, 14))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "ADICIONAR DISCIPLINA AO PROFESSOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        btn_Atribuir_DiscpAoProf.setBackground(new java.awt.Color(204, 255, 204));
        btn_Atribuir_DiscpAoProf.setText("Atribuir");
        btn_Atribuir_DiscpAoProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Atribuir_DiscpAoProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(btn_Atribuir_DiscpAoProf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Atribuir_DiscpAoProf)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "MOSTRAR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        btn_Mostrar_Pessoas.setBackground(new java.awt.Color(204, 255, 204));
        btn_Mostrar_Pessoas.setText("Pessoas");
        btn_Mostrar_Pessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mostrar_PessoasActionPerformed(evt);
            }
        });

        btn_Mostrar_Disciplinas.setBackground(new java.awt.Color(204, 255, 204));
        btn_Mostrar_Disciplinas.setText("Disciplinas");
        btn_Mostrar_Disciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Mostrar_DisciplinasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btn_Mostrar_Pessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btn_Mostrar_Disciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mostrar_Pessoas)
                    .addComponent(btn_Mostrar_Disciplinas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "APLICAR BONIFICAÇÃO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        btn_Atribuir_Bonificacao.setBackground(new java.awt.Color(204, 255, 204));
        btn_Atribuir_Bonificacao.setText("Atribuir");
        btn_Atribuir_Bonificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Atribuir_BonificacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btn_Atribuir_Bonificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Atribuir_Bonificacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Sair.setBackground(new java.awt.Color(204, 255, 204));
        btn_Sair.setText("Sair");
        btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btn_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Sair)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_SairActionPerformed

    private void btn_inserir_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserir_AlunoActionPerformed
        String nome, cpf, ra;
        Disciplina disciplina = null;
        Aluno aluno = null;
        
        nome = JOptionPane.showInputDialog("Nome do Aluno:");
        cpf = JOptionPane.showInputDialog("CPF do Aluno:");
        ra = JOptionPane.showInputDialog("RA do Aluno:");
        
        String nomeDisciplina = JOptionPane.showInputDialog("Disciplina do Aluno:");
        
        for (Disciplina d : lstDisciplinas) {
            if (d.getNome().equals(nomeDisciplina)) {
                disciplina = d;
                break;
            }
        }
        
        if (disciplina != null) {

            aluno = new Aluno(ra, disciplina, nome, cpf);
            disciplina.addAluno(aluno);
                
        lstPessoas.add(new Aluno(ra, disciplina, nome, cpf));
        
        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(this, "Disciplina não encontrada.");
        }
        
    }//GEN-LAST:event_btn_inserir_AlunoActionPerformed

    private void btn_inserir_AtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserir_AtendenteActionPerformed
        String nome, cpf, setor, funcao;
        int numeroCracha;
        double salario;
        
        nome = JOptionPane.showInputDialog("Nome do Atendente:");
        cpf = JOptionPane.showInputDialog("CPF do Atendente:");
        numeroCracha = Integer.parseInt(JOptionPane.showInputDialog("Nº Crachá do Atendente:"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do Atendente:"));
        setor = JOptionPane.showInputDialog("Setor do Atendente:");
        funcao = JOptionPane.showInputDialog("Função do Atendente");
        
        lstPessoas.add(new Atendente(setor, funcao, numeroCracha, salario, nome, cpf));
        
        JOptionPane.showMessageDialog(this, "Atendente cadastrado com sucesso.");
        
    }//GEN-LAST:event_btn_inserir_AtendenteActionPerformed

    private void btn_inserir_ProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserir_ProfessorActionPerformed
        String nome, cpf, urlLattes;
        int numeroCracha;
        double salario;
        
        
        nome = JOptionPane.showInputDialog("Nome do Professor:");
        cpf = JOptionPane.showInputDialog("CPF do Professor:");
        numeroCracha = Integer.parseInt(JOptionPane.showInputDialog("Nº Crachá do Professor:"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do Professor:"));
        urlLattes = JOptionPane.showInputDialog("URL Lattes do Professor:");
        
        lstPessoas.add(new Professor(urlLattes, numeroCracha, salario, nome, cpf));
        
        JOptionPane.showMessageDialog(this, "Professor cadastrado com sucesso.");
        
    }//GEN-LAST:event_btn_inserir_ProfessorActionPerformed

    private void btn_inserir_DisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserir_DisciplinaActionPerformed
        int codigo;
        String nome;
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Código:"));
        nome = JOptionPane.showInputDialog("Nome da Disciplina:");
        
        lstDisciplinas.add(new Disciplina(codigo, nome));
    
        JOptionPane.showMessageDialog(this, "Disciplina cadastrada com sucesso.");
        
    }//GEN-LAST:event_btn_inserir_DisciplinaActionPerformed

    private void btn_Atribuir_DiscpAoProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Atribuir_DiscpAoProfActionPerformed
        
        Professor professor = new Professor();
        Disciplina disciplina = null;
        
        String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina:");
        String nomeProfessor = JOptionPane.showInputDialog("Nome do Professor:");
                
        for (Disciplina d : lstDisciplinas) {
            if (d.getNome().equals(nomeDisciplina)) {
                disciplina = d;
                break;
            }
        }
        
        for (Iterator<Pessoa> it = lstPessoas.iterator(); it.hasNext();) {
            Professor p = (Professor) it.next();
            if (p.getNome().equals(nomeProfessor)) {
                professor = p;
                break;
            }
        }
        
        if (disciplina != null && professor != null) {

            professor.addDisciplina(disciplina);
        
        JOptionPane.showMessageDialog(this, "Disciplina atribuida corretamente ao professor.");
        } else {
            JOptionPane.showMessageDialog(this, "Disciplina ou Professor não encontrados.");
        }
        
    }//GEN-LAST:event_btn_Atribuir_DiscpAoProfActionPerformed

    private void btn_Mostrar_PessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mostrar_PessoasActionPerformed
        String msg = "";
        for (Pessoa p : lstPessoas) {

            msg += p.toString() + "\n--------------------------------\n";

        }
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_btn_Mostrar_PessoasActionPerformed

    private void btn_Mostrar_DisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Mostrar_DisciplinasActionPerformed
        
        String msg = "";
        for (Disciplina d : lstDisciplinas) {

            msg += d.toString() + "\n--------------------------------\n";

        }
        JOptionPane.showMessageDialog(null, msg);

    }//GEN-LAST:event_btn_Mostrar_DisciplinasActionPerformed

    private void btn_Atribuir_BonificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Atribuir_BonificacaoActionPerformed

        int numCracha = Integer.parseInt(JOptionPane.showInputDialog("Por favor, informe o Crachá do funcionário:"));

        boolean encontrado = false;

        for (Pessoa pessoa : lstPessoas) {

            if (pessoa instanceof Professor) {
                Professor professor = (Professor) pessoa;
                if (professor.getNumeroCracha() == numCracha) {
                    JOptionPane.showMessageDialog(this, "Bonificação do Professor: " + professor.bonificacao());
                    encontrado = true;
                    break;
                }
            } else if (pessoa instanceof Atendente) {
                Atendente atendente = (Atendente) pessoa;
                if (atendente.getNumeroCracha() == numCracha) {
                    JOptionPane.showMessageDialog(this, "Bonificação do Atendente: " + atendente.bonificacao());
                    encontrado = true;
                    break;
                }
            } else if (pessoa instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) pessoa;
                if (funcionario.getNumeroCracha() == numCracha) {
                    JOptionPane.showMessageDialog(this, "Bonificação do Funcionário: " + funcionario.bonificacao());
                    encontrado = true;
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Crachá não encontrado.");
            }

        }


    }//GEN-LAST:event_btn_Atribuir_BonificacaoActionPerformed
    
    
    
    
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
            java.util.logging.Logger.getLogger(swing_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(swing_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(swing_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(swing_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new swing_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Atribuir_Bonificacao;
    private javax.swing.JButton btn_Atribuir_DiscpAoProf;
    private javax.swing.JButton btn_Mostrar_Disciplinas;
    private javax.swing.JButton btn_Mostrar_Pessoas;
    private javax.swing.JButton btn_Sair;
    private javax.swing.JButton btn_inserir_Aluno;
    private javax.swing.JButton btn_inserir_Atendente;
    private javax.swing.JButton btn_inserir_Disciplina;
    private javax.swing.JButton btn_inserir_Professor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
