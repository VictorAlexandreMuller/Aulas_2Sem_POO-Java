/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula7exemploassociacao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        /*
        1 - Inserir Curso
        2 - Inserir Aluno
        3 - Remover Aluno
        4 - Mostrar Cursos
        5 - Mostrar alunos do curso
        6 - Sair
        */
        
        int opc = 0;
        ArrayList<Curso> cursos = new ArrayList<>();
        int cod, ch;
        String nome,msg,ra;
        Curso cursoSelecionado = null;
        
        while(opc != 6){
            opc = Integer.parseInt(JOptionPane.
                    showInputDialog("Menu\n"+
                            "1 - Cadastrar Curso\n" +
                            "2 - Cadastrar Aluno\n"
                            + "3 - Remover Aluno\n"
                            + "4 - Mostrar Cursos\n"
                            + "5 - Mostrar aluno de um curso\n"
                            + "6 - Sair"));
            
            if(opc == 2 || opc == 3 || opc == 5){
                //buscar curso
                msg = "";
                for(Curso c : cursos){
                    msg += c.imprimir() +"\n";
                }
                cod = Integer.parseInt(JOptionPane.
                     showInputDialog(msg +
                                "\nDigite o código do curso:"));
                for(Curso c : cursos){
                    if(c.getCodigo() == cod)
                        cursoSelecionado = c;
                }
                if(cursoSelecionado == null)
                    continue;
            }
            
            switch (opc) {
                case 1:   
                    cod = Integer.parseInt(
                            JOptionPane.showInputDialog("Código"));
                    nome = JOptionPane.showInputDialog("Nome");
                    ch = Integer.parseInt(JOptionPane.showInputDialog("CH"));
                    
                    cursos.add(new Curso(cod,nome,ch));
                    break;
                    case 2:
                        ra = JOptionPane.showInputDialog("RA");
                        nome = JOptionPane.showInputDialog("Nome");
                        cursoSelecionado.inserirAluno(
                                new Aluno(ra,nome)
                        );
                    break;
                    case 3:  
                        ra = JOptionPane.showInputDialog(
                           cursoSelecionado.imprimirCompleto()
                                +"\nDigite o ra:");
                        for (int i = 0; 
                      i < cursoSelecionado.getAlunos().size(); i++)
                        {
                            Aluno a = cursoSelecionado.getAlunos().get(i);
                                if(a.getRa().equals(ra)) 
                                    cursoSelecionado.removerAluno(i);
                        }
                    break;
                    case 4: 
                        msg = "";
                        for(Curso c : cursos){
                            msg += c.imprimir() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, msg);
                    break;
                    case 5: 
                        JOptionPane.showMessageDialog(null, 
                                cursoSelecionado.imprimirCompleto());
                    break;
                    case 6:                    
                    break;
                default:
                    JOptionPane.
                        showMessageDialog(null,"Opção Inválida!");
            }
        }
        
    }
    
}
