package ex1lista4_ac2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ex1lista4_AC2 {

    public static void main(String[] args) {
        ArrayList<Aluno> listaAluno = new ArrayList<>();
        int opc = 0;
        String ra, nome, curso, anoConclusao;
        
        while(opc != 3){
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Inserir Aluno\n" +
                    "2 - Exibir Alunos\n" +
                    "3 - Sair"));
            
            switch (opc){
                case 1: // VERIFICAR TODOS ABAIXO
                    opc = Integer.parseInt(JOptionPane.showInputDialog("Tipo:\n" + "1 - Graduação" + "2 - Pós Graduação"));
                    ra = JOptionPane.showInputDialog("RA");
                    nome = JOptionPane.showInputDialog("Nome");
                    curso = JOptionPane.showInputDialog("Curso");
                    listaPessoa.add(new PessoaFisica(nomeRazao, cpfCnpj, email, celular));
                    if(opc == 1){
                        anoConclusao = JOptionPane.showInputDialog("Curso");
                    } else{
                        anoConclusao = JOptionPane.showInputDialog("Curso");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
        
    }
    
}
