package lista2_ex2_poo_java;

public class Vendedor {
    private int Codigo;
    private String Nome;
    private double percentualComissao;

    public Vendedor() {
    }

    public Vendedor(int Codigo, String Nome, double percentualComissao) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.percentualComissao = percentualComissao;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    
    
    
    public double calcularPagamentoComissao(double valorVenda){
        return valorVenda * percentualComissao/100;
    }

    public double calcularPagamentoComissao(double valorVenda, double desconto){
        return calcularPagamentoComissao(valorVenda) - desconto;
    }
    
    
    
    
    public String imprimir(double valorVenda, double desconto){
        return "Codigo: " + Codigo + 
               "\nNome: " + Nome + 
               "\nValor Venda: " + valorVenda + 
               "\n% Comissão: " + percentualComissao + 
               "\nDesconto: " + desconto + 
               "\nValor a Pagar: " + calcularPagamentoComissao(valorVenda, desconto);
    }
}
