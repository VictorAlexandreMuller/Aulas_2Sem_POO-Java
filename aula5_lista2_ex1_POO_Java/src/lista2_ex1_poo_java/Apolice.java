package lista2_ex1_poo_java;

public class Apolice {
    private int Numero;
    private String Nome;
    private int Idade;
    private char Sexo;
    private double valorAutomovel;

    public Apolice() {
    }

    public Apolice(int Numero, String Nome, int Idade, char Sexo, double valorAutomovel) {
        this.Numero = Numero;
        this.Nome = Nome;
        this.Idade = Idade;
        this.Sexo = Sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
    
    public double calcularValor(){
        if (Sexo == 'M' && Idade <= 25){
            return valorAutomovel * 10/100;
        } if (Sexo == 'M' && Idade > 25){
            return valorAutomovel * 5/100;
        } if (Sexo == 'F'){
            return valorAutomovel * 2/100;
        }
        return calcularValor();
    }
        
    public String imprimir() {
        return "Número: " + Numero +
               "\nNome: " + Nome +
               "\nIdade: " + Idade +
               "\nSexo: " + Sexo +
               "\nValor Automível: " + valorAutomovel +
               "\nValor Apólice: " + calcularValor();
    }
    
}
