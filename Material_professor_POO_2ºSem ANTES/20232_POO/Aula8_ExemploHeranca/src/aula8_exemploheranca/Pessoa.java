/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8_exemploheranca;

/**
 *
 * @author rafae
 */
public abstract class Pessoa {
    private String email;
    private String celular;
    
    public Pessoa(){}

    public Pessoa(String email, String celular) {
        this.email = email;
        this.celular = celular;
    }
    
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
