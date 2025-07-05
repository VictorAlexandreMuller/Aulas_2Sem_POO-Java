/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

/**
 *
 * @author rafae
 */
public class Pessoa {
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getCPF(){
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String imprimir(){
        return "CPF: " + cpf + 
                "\nNome: " + nome+
                "\nSexo: " + sexo +
                "\nIdade: " + idade;
    }
}
