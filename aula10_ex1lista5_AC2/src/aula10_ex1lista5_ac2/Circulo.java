package aula10_ex1lista5_ac2;

public class Circulo extends FormaGeometrica {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.1415 * (raio * raio);
    }

    public String toString() {
        return "Área do círculo abaixo: "
                + "\nRaio: " + raio
                + "\nValor de Pi: 3,1415"
                + "\nÁrea: " + calcularArea();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
