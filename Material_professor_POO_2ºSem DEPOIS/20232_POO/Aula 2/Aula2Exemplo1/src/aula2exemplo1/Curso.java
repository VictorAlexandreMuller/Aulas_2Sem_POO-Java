/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2exemplo1;

import java.util.UUID;

/**
 *
 * @author rafae
 */
public class Curso {
    private String nome;
    private int duracao;
    private UUID codigo;
    
    public Curso(UUID codigo){
        this.codigo = codigo;
    }    
    public Curso(){
        
    }
    public Curso(UUID codigo, String nome, int duracao){
        this(codigo);
        this.nome = nome;
        this.duracao = duracao;        
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public int getDuracao(){
        return duracao;
    }
    public void setCodigo(UUID codigo){
        this.codigo = codigo;
    }
    public UUID getCodigo(){
        return codigo;
    }
    
    public String imprimir(){
         return "Código: " + codigo +
                 "\nNome: " + nome + 
                 "\nDuração: " + duracao;
    }
}
