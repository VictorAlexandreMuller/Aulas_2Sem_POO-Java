package classes;

import java.util.ArrayList;

public class Professor extends Funcionario {
    private String urlLattes;
    private ArrayList<Disciplina> disciplinas;

    public Professor() {
        disciplinas = new ArrayList<>();
    }

    public Professor(String urlLattes, int numeroCracha, double salario, String nome, String cpf) {
        super(numeroCracha, salario, nome, cpf);
        this.urlLattes = urlLattes;
        this.disciplinas = new ArrayList<>();
    }
    
    public double bonificacao(){
        return (getSalario() * 1.0);
    }
    
    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    
    public void removeDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }

    public String getUrlLattes() {
        return urlLattes;
    }

    public void setUrlLattes(String urlLattes) {
        this.urlLattes = urlLattes;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String imprimir() {
        return "Nome do Professor: " + getNome()
                + "\n"
                + "CPF: " + getCpf()
                + "\n"
                + "Nº Crachá: " + getNumeroCracha()
                + "\n"
                + "URL Lattes: " + urlLattes
                + "\n"
                + "Salário: " + getSalario();
    }

    @Override
    public String toString() {
        String dados = imprimir() + "\nDisciplinas:\n";
        for (Disciplina d : disciplinas) {
            dados += d.imprimir() + "\n";

        }
        return dados;
    }
    
    
    
}
