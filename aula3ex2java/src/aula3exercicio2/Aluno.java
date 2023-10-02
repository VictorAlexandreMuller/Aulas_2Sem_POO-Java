package aula3exercicio2;

public class Aluno {
    private String RA;
    private String Nome;
    private float AC1;
    private float AC2;
    private float AG;
    private float AF;
    
    public void setRA(String RA){
        this.RA = RA;
    }
    
    public String getRA(){
        return RA;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getAC1() {
        return AC1;
    }

    public void setAC1(float AC1) {
        this.AC1 = AC1;
    }

    public float getAC2() {
        return AC2;
    }

    public void setAC2(float AC2) {
        this.AC2 = AC2;
    }

    public float getAG() {
        return AG;
    }

    public void setAG(float AG) {
        this.AG = AG;
    }

    public float getAF() {
        return AF;
    }

    public void setAF(float AF) {
        this.AF = AF;
    }

    public float calcularMedia(){
        float media = ((AC1*0.15f) + (AC2*0.30f) + (AG*0.10f) + (AF*0.45f));
        return media;
    }
    
    public String verificarAprovacao(){
        if (calcularMedia() >= 5){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
    public String imprimir(){
    return "RA: " + RA +
           "\nNome: " + Nome +
           "\nAC1: " + AC1 +
           "\nAC2: " + AC2 +
           "\nAG: " + AG +
           "\nAF: " + AF +
           "\nMédia: " + calcularMedia() +
           "\nSituação: " + verificarAprovacao();
    }
    
}