package classes;

import java.util.ArrayList;

public class Disciplina {
    private int codigo;
    private String nome;
    private ArrayList<Aluno> alunos;

    public Disciplina() {
        alunos = new ArrayList<>();
    }

    public Disciplina(int codigo, String nome) {
        this();
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void removeAluno(Aluno aluno){
        alunos.remove(aluno);
    } 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public String imprimir(){
        return "Código: " + codigo
                + "\n"
                + "Nome da Disciplina: " + nome;
    }  
    
    @Override
    public String toString() {
        String dados = imprimir()
                + "\nAlunos:\n";
        for (Aluno a : alunos) {
            dados += a.toString() + "\n";

        }
        return dados;
    }
    
}
