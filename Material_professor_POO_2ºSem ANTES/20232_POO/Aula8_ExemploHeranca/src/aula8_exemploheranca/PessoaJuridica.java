/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8_exemploheranca;

/**
 *
 * @author rafae
 */
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

    @Override
    public boolean validarDocumento() {
        return cnpj.length() == 14;
    }
    
}
