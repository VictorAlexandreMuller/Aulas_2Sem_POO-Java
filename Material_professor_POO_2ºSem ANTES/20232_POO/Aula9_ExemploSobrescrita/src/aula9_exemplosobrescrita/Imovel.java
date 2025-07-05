/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula9_exemplosobrescrita;

/**
 *
 * @author rafae
 */
public class Imovel {
    private int codigo;
    private String endereco;
    private double valor;

    public Imovel() {
    }

    public Imovel(int codigo, String endereco, double valor) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\nEndereço: " +
                endereco;
    }

    public double calcularValorImovel(){
        return valor;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
