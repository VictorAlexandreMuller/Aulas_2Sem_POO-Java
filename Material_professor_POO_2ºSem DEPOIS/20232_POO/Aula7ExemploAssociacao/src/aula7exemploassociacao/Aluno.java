/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7exemploassociacao;

/**
 *
 * @author rafae
 */
public class Aluno {
    private String ra;
    private String nome;

    public Aluno() {
    }

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String imprimir(){
        return ra + " - " +nome;
    }
    
    
}
