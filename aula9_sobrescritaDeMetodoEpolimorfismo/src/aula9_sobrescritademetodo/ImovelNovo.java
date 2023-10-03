package aula9_sobrescritademetodo;

public class ImovelNovo extends Imovel{
    private double valorAdicional;

    public ImovelNovo() {
    }

    public ImovelNovo(double valorAdicional, int codigo, String endereco, double valor) {
        super(codigo, endereco, valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    @Override
    public double calcularValorImovel(){
        return getValor() + valorAdicional;
    }
    
    @Override
    public String toString() {
        return "Imóvel Novo:" + "\n" +
               super.toString() +
               "\nValor: " + calcularValorImovel();
    }
    
}
