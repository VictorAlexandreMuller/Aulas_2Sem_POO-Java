/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1exemplo1;

/**
 *
 * @author rafae
 */
public class Aluno {

    private String ra;
    private String nome;
    private String curso;

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public String imprimir() {
        return "RA: " + ra
                + "\nNome: " + nome
                + "\nCurso: " + curso;
    }
}
