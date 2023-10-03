package aula9_sobrescritademetodo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aula9_sobrescritaDeMetodo {

    public static void main(String[] args) {

        // Explicação da linha abaixo:
        // Crie uma ArrayList de <Imovel> chamada listaImoveis = Construtor
        ArrayList<Imovel> listaImoveis = new ArrayList<>();

        int opc = 0;

        String endereco;
        int codigo;
        double valor, valorDesconto, valorAdicional;

        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.
                    showInputDialog("1 - Inserir Imovel\n"
                            + "2 - Exibir Imóveis\n"
                            + "3 - Sair"));
            switch (opc) {
                case 1:
                    opc = Integer.parseInt(JOptionPane.
                            showInputDialog("Tipo:\n"
                                    + "1 - Novo\n"
                                    + "2 - Velho"));
                    if (opc == 1) {
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Código"));
                        endereco = JOptionPane.showInputDialog("Endereço");
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Imóvel"));
                        valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Valor Adicional"));

                        listaImoveis.add(new ImovelNovo(valorAdicional, codigo, endereco, valor));
                    } else {
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Código"));
                        endereco = JOptionPane.showInputDialog("Endereço");
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Imóvel"));
                        valorDesconto = Double.parseDouble(JOptionPane.showInputDialog("Valor do Desconto"));

                        listaImoveis.add(new ImovelVelho(valorDesconto, codigo, endereco, valor));
                    }
                    break;
                case 2:
                    String msg = "";
                    for (Imovel p : listaImoveis) {
                        msg += p
                                + "\n ---------------------- \n";

                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
    }

}
