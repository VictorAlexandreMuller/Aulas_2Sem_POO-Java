package aula8_exemploheranca;

//Classe abstrata, não pode ser instanciada, se não da erro
public abstract class Pessoa {
    private String email;
    private String celular;
    
    public Pessoa(){}

    public Pessoa(String email, String celular) {
        this.email = email;
        this.celular = celular;
    }
    
    // método abstrato que OBRIGA a pessoa física e jurídica a terem esse método
    public abstract boolean validarDocumento();

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
        return "Celular: " + celular + "\nE-mail: " +email;
    }
    
    
    
    public String imprimir(){
        return "Celular: " + celular + "\nE-mail: " +email;
    }
    
}
