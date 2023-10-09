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
                    opc = Integer.parseInt(JOptionPane.showInputDialog(
                            "Tipo:" + "\n" + 
                            "1 - Graduação" + "\n" + 
                            "2 - Pós Graduação"));
                    ra = JOptionPane.showInputDialog("RA:");
                    nome = JOptionPane.showInputDialog("Nome:");
                    curso = JOptionPane.showInputDialog("Curso:");
                    if(opc == 1){
                        anoConclusao = JOptionPane.showInputDialog("Ano de conclusão do Ensino Médio:");
                        listaAluno.add(new AlunoGraduacao(anoConclusao, ra, nome, curso));
                    } else{
                        anoConclusao = JOptionPane.showInputDialog("Ano de conclusão da Graduação:");
                        listaAluno.add(new AlunoPosGraduacao(anoConclusao, ra, nome, curso));
                    }
                    
                    break;
                case 2:
                    String msg = "";
                    for(Aluno p : listaAluno){
                        if(p instanceof AlunoGraduacao){
                            msg += ((AlunoGraduacao) p).toString() + "\n-----------\n";
                        } else{
                        msg += ((AlunoPosGraduacao) p).toString() + "\n------------\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
        
    }
    
}
