package aula3exercicio1;

public class Pessoa {
    private String CPF;
    private String Nome;
    private char Sexo;
    private int Idade;
    
    
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    
    public String getCPF(){
        return CPF;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public void setIdade(int Idade){
        this.Idade = Idade;
    }
    
    public int getIdade(){
        return Idade;
    }
    
    public void setSexo(char Sexo){
        this.Sexo = Sexo;
    }
    
    public char getSexo(){
        return Sexo;
    }
    
    public String imprimir(){
        return "CPF: " + CPF +
                "\nNome: " + Nome +
                "\nIdade: " + Idade +
                "\nSexo: " + Sexo;
    }
    
}