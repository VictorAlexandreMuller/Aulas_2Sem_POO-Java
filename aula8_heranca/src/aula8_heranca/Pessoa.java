package aula8_heranca;

public class Pessoa {
    private String email;
    private String celular;

    public Pessoa() {
    }

    public Pessoa(String email, String ceular) {
        this.email = email;
        this.celular = ceular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCeular() {
        return celular;
    }

    public void setCeular(String ceular) {
        this.celular = ceular;
    }

    
}
