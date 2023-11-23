package model;

import java.io.Serializable;

public class Usuario implements Serializable{

    private int id;
    private String login;
    private String senha;
    private int codigo;
    private String nome;

    public Usuario() {
    }

    public Usuario(String login, String senha, int codigo, String nome) {
        this.login = login;
        this.senha = senha;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Usuario(int id, String login, String senha, int codigo, String nome) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        return this.getNome();
    }
}
