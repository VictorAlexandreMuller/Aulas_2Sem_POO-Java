/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula9_exemplosobrescrita;

/**
 *
 * @author rafae
 */
public class ImovelNovo extends Imovel{
    private double valorAdicional;

    public ImovelNovo() {
    }

    public ImovelNovo(double valorAdicional, 
            int codigo, String endereco, double valor) {
        super(codigo, endereco, valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor: " + 
                calcularValorImovel();
    }

    @Override
    public double calcularValorImovel() {
        return getValor() + valorAdicional;
    }
    

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    
}
