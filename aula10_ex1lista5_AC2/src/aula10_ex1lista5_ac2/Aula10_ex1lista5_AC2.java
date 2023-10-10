package aula10_ex1lista5_ac2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aula10_ex1lista5_AC2 {

    public static void main(String[] args) {
        ArrayList<FormaGeometrica> listaDeFormas = new ArrayList<>();
        int opc = 0;
        double altura, largura, raio;

        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Inserir e calcular área.\n"
                    + "2 - Mostrar todas as formas insetidas.\n"
                    + "3 - Sair"));

            switch (opc) {
                case 1:
                    opc = Integer.parseInt(JOptionPane.showInputDialog(
                            "Qual área deseja calcular? \n"
                            + "1 - Área do Círculo\n"
                            + "2 - Área do Retângulo"));

                    if (opc == 1) {
                        raio = Double.parseDouble(JOptionPane.showInputDialog("Raio:"));
                        listaDeFormas.add(new Circulo(raio));
                    } else {
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
                        largura = Double.parseDouble(JOptionPane.showInputDialog("Largura:"));
                        listaDeFormas.add(new Retangulo(largura, altura));
                    }
                    break;

                case 2:
                    String msg = "";
                    for (FormaGeometrica p : listaDeFormas) {
                        if (p instanceof Circulo) {
                            msg += p.toString() + "\n--------------------------------\n";
                        } else {
                            msg += p.toString() + "\n--------------------------------\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

        }
    }
}
