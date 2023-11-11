package classes;

public class Atendente extends Funcionario {
    private String setor;
    private String funcao;

    public Atendente() {
    }

    public Atendente(String setor, String funcao, int numeroCracha, double salario, String nome, String cpf) {
        super(numeroCracha, salario, nome, cpf);
        this.setor = setor;
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public double bonificacao() {
        return (getSalario() * 0.15);
    }
    
    @Override
    public String toString() {
        return "Nome do Atendente: " + getNome()
                + "\n"
                + "CPF: " + getCpf()
                + "\n"
                + "Nº Crachá: " + getNumeroCracha()
                + "\n"
                + "Setor: " + setor
                + "\n"
                + "Função: " + funcao
                + "\n"
                + "Salário: " + getSalario();
    }
}
