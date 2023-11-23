package model;

import java.io.Serializable;

public class Motorista implements Serializable {

    private int id;
    private String nome;

    public Motorista() {
    }

    public Motorista(String nome) {
        this.nome = nome;
    }

    public Motorista(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Motorista(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
