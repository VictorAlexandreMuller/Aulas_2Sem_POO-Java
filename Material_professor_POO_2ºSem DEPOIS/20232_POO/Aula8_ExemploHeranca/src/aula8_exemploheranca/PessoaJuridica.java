package aula8_exemploheranca;

public class PessoaJuridica extends Pessoa {
    private String razao;
    private String cnpj;
    
    public PessoaJuridica(){}  
    
    public PessoaJuridica(String razao, String cnpj,
            String email, String celular){
        super(email, celular);
        this.cnpj = cnpj;
        this.razao = razao;
    }
    
    // O Override executa o método do filho e não o método do pai quando imprimir
    @Override
    public String toString() {
        return "CNPJ: " + cnpj +
                "\nRazão Social: " + razao + "\n" +
                super.toString(); //executa o metodo do pai
    }
    
    

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
