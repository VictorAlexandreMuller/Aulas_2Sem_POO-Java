package classes;

public class Funcionario extends Pessoa {
    private int numeroCracha;
    private double salario;

    public Funcionario() {
        
    }

    public Funcionario(int numeroCracha, double salario, String nome, String cpf) {
        super(nome, cpf);
        this.numeroCracha = numeroCracha;
        this.salario = salario;

    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double bonificacao() {
        return (salario * 0.1);
    }
    
    @Override
    public String toString() {
        return "Nome do Funcionário: " + getNome()
                + "\n"
                + "CPF: " + getCpf()
                + "\n"
                + "Nº Crachá: " + numeroCracha
                + "\n"
                + "Salário: " + salario;
    }
    
    
}
