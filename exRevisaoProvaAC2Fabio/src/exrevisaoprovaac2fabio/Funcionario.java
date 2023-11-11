package exrevisaoprovaac2fabio;

/*
    Classe abstrata Funcionário.
    A classe abstrata é uma classe modelo que servirá apenas de molde para as demais que a estenderem (subclasses).
    A classe abstrata sempre será uma superclasse e nunca poderá ser instanciada.
    Ela também obriga a implementação de todos os métodos abstratos pelas subclasses.
*/
public abstract class Funcionario {
    
    /* 
     Neste caso não há associação das classes, pois nenhuma das outra classe foi utilizada como atributo.
     Caso existisse uma associação de classe, isso indicaria que esta classe teria alguma relação com a outra.
     Exemplo 1 de Associação de Classe:
          private Endereco endereco; <----- Neste caso haveria uma classe molde própria de Endereços com
                                            atributos "rua, número, bairro, etc..." que faria relação a esta classe Funcionário.
     Exemplo 2 de Associação de Classe:
          private List<Telefone> telefones; <----- Neste caso haveria uma lista de telefones para cada funcionário.
    */
    
    // Encapsulamento das informações "numeroCracha, nome, setor e funcao" para serem utilizadas do Objeto com o Construtor.
    private int numeroCracha;
    private String nome;
    private String setor;
    private String funcao;
    
    

    // O fato de existir mais de uma forma de construtor indica uma sobrecarga de construtores.
    // A sobrecarga de métodos também é considerada um dos tipos de Polimorfismo, Ad Hoc Sobrecarga.
    // Construtor vazio. Instancia um objeto sem parâmetros.
    public Funcionario() {
    }
    
    // Construtor com os parâmetros encapsulados. Instancia um objeto com os atributos descritos dentro dos parenteses.
    public Funcionario(int numeroCracha, String nome, String setor, String funcao) {
        this.numeroCracha = numeroCracha;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }
    
    
    // Gets e Sets...
    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    
    
    // Abaixo, o fato de existir mais de um método indica uma sobrecarga de métodos nesta classe.
    // O método abstrato não pode ser instanciado e gera a obrigatoriedade de implementação nas subclasses.
    // Método publico de nome "calcularSalario" do tipo double.
    public abstract double calcularSalario();
    
    
    // Método publico de nome "imprimir" do tipo String.
    public String imprimir(){
        return "Nome: " + nome
                + "\n"
                + "Nº Crachá: " + numeroCracha
                + "\n"
                + "Setor: " + setor
                + "\n"
                + "Função: " + funcao;
    }

}
