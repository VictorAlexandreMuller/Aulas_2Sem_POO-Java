package aula9_sobrescritademetodo;

public class ImovelVelho extends Imovel{
    private double valorDesconto;

    public ImovelVelho() {
    }

    public ImovelVelho(double valorDesconto, int codigo, String endereco, double valor) {
        super(codigo, endereco, valor);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    @Override
    public double calcularValorImovel(){
        return super.calcularValorImovel() - valorDesconto;
    }

    @Override
    public String toString() {
        return "Imóvel Velho:" + "\n" +
               super.toString() +
               "\nValor: " + calcularValorImovel();
    }
    
}
