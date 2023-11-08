package aula11_lista6_ac2;

import javax.swing.JOptionPane;

public class Aula11_lista6_AC2 {

    public static void main(String[] args) {
        
        // Exemplo do método estático na prática
        
        double taxaInicial = Conta.getVALORTAXA();

        ContaPoupanca.setVALORTAXA(0.02);
                
        JOptionPane.showMessageDialog(
                null,
                "Taxa inicial: " + taxaInicial
                + "\n"
                + "Nova taxa de Conta Poupança: " + ContaPoupanca.getVALORTAXA()
        );
    }
    
}
