package exrevisaoprovaac2fabio;

// Classe Funcionário Mensalista.
/*
A utilização do "extends" após o nome da classe "FuncionarioMensalista"
    declara que haverá uma relação de herança entre as duas classes.

Dessa forma, os atributos do objeto "Funcionario" poderão ser herdados
    pelo objeto "FuncionarioMensalista".
*/
public class FuncionarioMensalista extends Funcionario{
    
    // Encapsulamento das informações "salario e desconto" para serem utilizadas do Objeto com o Construtor.
    // Neste caso também não há associação das classes.
    private double salario;
    private double desconto;

    
    
    
    // O fato de existir mais de uma forma de construtor indica uma sobrecarga de construtores.
    // A sobrecarga de métodos também é considerada um dos tipos de Polimorfismo, Ad Hoc Sobrecarga.
    // Construtor vazio. Instancia um objeto sem parâmetros.
    public FuncionarioMensalista() {
    }

    // Construtor com os parâmetros encapsulados. Instancia um objeto com os atributos descritos dentro dos parenteses.
    public FuncionarioMensalista(double salario, double desconto, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
        this.desconto = desconto;
    }
    
    
    
    // Gets e Sets...
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    
    // O fato de existir mais de um método indica uma sobrecarga de métodos nesta classe.
    // Método publico de nome "calcularSalario" do tipo double.
    
    // O fato da classe FuncionarioMensalista "estender" a classe Funcionario faz com que
    //     seja possível a criação de Sobreposição de Métodos (Overrides), ou seja, 
    //     o método da classe filho irá sobrepor o método da classe pai.
    // O fato de "calcularSalario()" ser um método abstrato na classe "Funcionario", torna a obrigatoriedade de criação deste método nesta classe.
    @Override
    public double calcularSalario(){
        return salario - desconto;
    }
    
    // Método publico de nome "imprimir" do tipo String.
    public String imprimir(){
        return super.imprimir()
                + "\n"
                + "Salário bruto: " + salario
                + "\n"
                + "Descontos: " + desconto
                + "\n"
                + "Salário Líquido: " + calcularSalario();
    }
}
