package classes;

public class Aluno extends Pessoa {
    private String ra;
    private Disciplina disciplina;

    public Aluno() {
    }

    public Aluno(String ra, Disciplina disciplina, String nome, String cpf) {
        super(nome, cpf);
        this.ra = ra;
        this.disciplina = disciplina;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "RA: " + ra + " || Nome do Aluno: " + getNome() + " || CPF: " + getCpf();
    }
    
}
