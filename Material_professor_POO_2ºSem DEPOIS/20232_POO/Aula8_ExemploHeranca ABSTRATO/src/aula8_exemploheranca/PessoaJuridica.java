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

    @Override
    public String toString() {
        return "CNPJ: " + cnpj +
                "\nRazão Social: "+ razao+"\n"+
                super.toString();
    }
    

    
    @Override
    public String imprimir(){
        return "CNPJ: " + cnpj +
                "\nRazão Social: "+ razao+
                super.imprimir();
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
    
    //Retorno do abstrato Pai (Pessoa)
    @Override
    public boolean validarDocumento(){
        return cnpj.length() ==11;
    }
    
}
