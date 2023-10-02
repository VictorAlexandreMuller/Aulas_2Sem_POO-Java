package aula8_heranca;

public class PessoaJuridica extends Pessoa{
    private String razao;
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String razao, String cnpj, String email, String ceular) {
        super(email, ceular);
        this.razao = razao;
        this.cnpj = cnpj;
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
    
    public String imprimir(){
        return "Razão: " + razao +
               "\nCnpj: " + cnpj +
               "\nE-mail: " + getEmail() +
               "\nCelular: " + getCeular();
    }
    
}
