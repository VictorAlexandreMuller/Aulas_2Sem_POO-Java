package exrevisaoprovaac2fabio;

// Classe Funcionário Horista.
/*
A utilização do "extends" após o nome da classe "FuncionarioHorista"
    declara que haverá uma relação de herança entre as duas classes.

Dessa forma, os atributos do objeto "Funcionario" poderão ser herdados
    pelo objeto "FuncionarioHorista".
*/
public class FuncionarioHorista extends Funcionario {
    
    // Encapsulamento das informações "qtDeHoras e valorHora" para serem utilizadas do Objeto com o Construtor.
    // Neste caso também não há associação das classes.
    private int qtDeHoras;
    private double valorHora;
    
    
    
    
    // O fato de existir mais de uma forma de construtor indica uma sobrecarga de construtores.
    // A sobrecarga de métodos também é considerada um dos tipos de Polimorfismo, Ad Hoc Sobrecarga.
    // Construtor vazio. Instancia um objeto sem parâmetros.
    public FuncionarioHorista() {
    }

    // Construtor com os parâmetros encapsulados. Instancia um objeto com os atributos descritos dentro dos parenteses.
    public FuncionarioHorista(int qtDeHoras, double valorHora, int numeroCracha, String nome, String setor, String funcao) {
        super(numeroCracha, nome, setor, funcao);
        this.qtDeHoras = qtDeHoras;
        this.valorHora = valorHora;
    }
    
    
    
    // Gets e Sets...
    public int getQtDeHoras() {
        return qtDeHoras;
    }

    public void setQtDeHoras(int qtDeHoras) {
        this.qtDeHoras = qtDeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    
    // O fato de existir mais de um método indica uma sobrecarga de métodos nesta classe.
    // Método publico de nome "calcularSalario" do tipo double.
    
    // O fato da classe FuncionarioHorista "estender" a classe Funcionario faz com que
    //     seja possível a criação de Sobreposição de Métodos (Overrides), ou seja, 
    //     o método da classe filho irá sobrepor o método da classe pai.
    // O fato de "calcularSalario()" ser um método abstrato na classe "Funcionario", torna a obrigatoriedade de criação deste método nesta classe.
    @Override
    public double calcularSalario(){
        return qtDeHoras * valorHora;
    }
    
    // Método publico de nome "imprimir" do tipo String.
    public String imprimir(){
        return super.imprimir()
                + "\n"
                + "Quantidade de Horas Trabalhadas: " + qtDeHoras
                + "\n"
                + "Valor por hora trabalhada: " + valorHora
                + "\n"
                + "Salario Horista: " + calcularSalario();
    }
}
