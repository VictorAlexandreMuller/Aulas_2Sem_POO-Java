/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1exemplo1;

import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Main {

    public static void main(String[] args) {
        int opc = 0;
        String ra, nome, curso;
        Aluno aluno = null;
        
        while(opc != 3){
            opc = Integer.parseInt(
                    JOptionPane.showInputDialog("Informe a opção:\n"
            +"1 - Cadastrar\n2 - Mostrar\n3 - Sair"));
            switch (opc) {
                case 1:
                    ra = JOptionPane.showInputDialog("RA:");
                    nome = JOptionPane.showInputDialog("Nome:");
                    curso = JOptionPane.showInputDialog("Curso:");
                    aluno = new Aluno();
                    aluno.setCurso(curso);
                    aluno.setNome(nome);
                    aluno.setRa(ra);
                    break;
                case 2: 
                    if(aluno != null)
                        JOptionPane.showMessageDialog(null, 
                                                   aluno.imprimir());
                    break;
                case 3:                    
                    break;
                default:
                JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }
        
    }
    
}
