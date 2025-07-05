package aula8_exemploheranca;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;
    
    public PessoaFisica(){}
    
    public PessoaFisica(String nome, String cpf, 
                        String email, String celular){
        super(email, celular);
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // O Override executa o método do filho e não o método do pai quando imprimir
    @Override
    public String toString() {
        return "CPF: " + cpf +
                "\nNome: " + nome + "\n" +
                super.toString(); //executa o metodo do pai
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
