/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7exemploassociacao;

import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;
    
    public Curso(){
        alunos = new ArrayList<>();
    }

    public Curso(int codigo, String nome, int cargaHoraria) {
        this();
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    public void inserirAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void removerAluno(int index){
        alunos.remove(index);
    }
    
    public String imprimir(){
        return "Código: " + codigo+ " | Nome: " + nome; 
    }

    public String imprimirCompleto(){
        String dados = imprimir() + "\nAlunos:\n";
        for(Aluno a : alunos){
            dados += a.imprimir() + "\n";
        }
        return dados;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
}
