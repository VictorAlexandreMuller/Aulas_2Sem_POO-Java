package aula10_ex1lista5_ac2;

public class Retangulo extends FormaGeometrica {

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    public String toString() {
        return "Área do retângulo abaixo: "
                + "\nLargura: " + largura
                + "\nAltura: " + altura
                + "\nÁrea: " + calcularArea();
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
