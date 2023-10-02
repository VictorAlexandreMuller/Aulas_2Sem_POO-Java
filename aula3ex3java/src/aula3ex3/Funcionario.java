package aula3ex3;

public class Funcionario {
    private int Cracha;
    private String Nome;
    private char TipoVinculo;
    private float ValorHora;
    private float QtdeHora;
    private float Salario;
    private float ValorDesconto;

    public int getCracha() {
        return Cracha;
    }
    public void setCracha(int Cracha) {
        this.Cracha = Cracha;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public char getTipoVinculo() {
        return TipoVinculo;
    }
    public void setTipoVinculo(char TipoVinculo) {
        this.TipoVinculo = TipoVinculo;
    }

    public float getValorHora() {
        return ValorHora;
    }
    public void setValorHora(float ValorHora) {
        this.ValorHora = ValorHora;
    }

    public float getQtdeHora() {
        return QtdeHora;
    }
    public void setQtdeHora(float QtdeHora) {
        this.QtdeHora = QtdeHora;
    }

    public float getSalario() {
        return Salario;
    }
    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public float getValorDesconto() {
        return ValorDesconto;
    }
    public void setValorDesconto(float ValorDesconto) {
        this.ValorDesconto = ValorDesconto;
    }
    
    public float CalcularValorSalario(){
        if (TipoVinculo == 'H'){
            return ValorHora * QtdeHora - ValorDesconto;
        } else
            return Salario - ValorDesconto;
    }
        
    public String imprimir(){
        if (TipoVinculo == 'H'){
            return "Crachá: " + Cracha +
                   "\nNome: " + Nome +
                   "\nTipo Vínculo: " + TipoVinculo +
                   "\nSalário: " + ValorHora * QtdeHora +
                   "\nDesconto: " + ValorDesconto +
                   "\nValor a Receber: " + CalcularValorSalario();
        } else 
            return "Crachá: " + Cracha +
                   "\nNome: " + Nome +
                   "\nTipo Vínculo: " + TipoVinculo +
                   "\nSalário: " + Salario +
                   "\nDesconto: " + ValorDesconto +
                   "\nValor a Receber: " + CalcularValorSalario();
    }
    
}