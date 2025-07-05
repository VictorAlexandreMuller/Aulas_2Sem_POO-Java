package aula8_exemploheranca;

public class Pessoa {
    private String email;
    private String celular;
    
    public Pessoa(){}

    public Pessoa(String email, String celular) {
        this.email = email;
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Celular: " + celular + "\nE-Mail: " + email;
    }

    
}
