package aula6_poo_associacao;

import javax.swing.JOptionPane;

public class Aula6_POO_Associacao {

    public static void main(String[] args) {
        // Cria 2 cursos
        Curso c1 = new Curso(1, "ADS", 2400);
        Curso c2 = new Curso(2, "Engenharia", 5800);
        
        // Cria alunos do curso ADS
        Aluno a1 = new Aluno("0001", "Rafael");
        c1.inserirAluno(a1);
        a1 = new Aluno("0002", "José");
        c1.inserirAluno(a1);
        
        // Cria alunos do curso Engenharia
        a1 = new Aluno("0003", "Maria");
        c2.inserirAluno(a1);
        
        // Mostrar dados dos cursos
        JOptionPane.showMessageDialog(null, c1.imprimirCompleto());
        JOptionPane.showMessageDialog(null, c2.imprimirCompleto());
        
    }
    
}
