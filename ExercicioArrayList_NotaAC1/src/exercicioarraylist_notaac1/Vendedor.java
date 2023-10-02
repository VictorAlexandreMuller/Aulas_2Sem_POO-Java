package exercicioarraylist_notaac1;

public class Vendedor {
    private int codigo;
    private String nome;
    private String funcao;
    private double salario;

    public Vendedor() {
    }

    public Vendedor(int codigo, String nome, String funcao, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public Vendedor(int codigo) {
        this.codigo = codigo;
    }

    public Vendedor(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Vendedor(int codigo, String nome, String funcao) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcao = funcao;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalarioLiquido(double porcentagemComissao, double desconto){
        return salario + (salario * porcentagemComissao/100) - desconto;
    }
}
