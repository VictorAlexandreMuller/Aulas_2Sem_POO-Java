package ex1lista4_ac2;

public class AlunoPosGraduacao extends Aluno{
    private String anoConclusaoGraduacao;

    public AlunoPosGraduacao() {
    }

    public AlunoPosGraduacao(String anoConclusaoGraduacao, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }
    
    @Override
    public String toString() {
        return "Aluno de Pós Graduação: " + "\n" +
                "\nRA: " + getRa() + 
                "\nNome: " + getNome() +
                "\nCurso: " + getCurso() +
                "\nConcluiu o Ensino Médio em: " + anoConclusaoGraduacao;
    }
    
}
