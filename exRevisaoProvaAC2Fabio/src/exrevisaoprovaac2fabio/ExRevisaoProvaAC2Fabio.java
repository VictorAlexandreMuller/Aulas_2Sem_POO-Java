package exrevisaoprovaac2fabio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExRevisaoProvaAC2Fabio {

    public static void main(String[] args) {
        
        // Criação de uma ArrayList referente ao OBJETO Funcionario chamada de "listaFuncionario".
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        
        // "int opc = 0" representa um exemplo de Polimorfismo Ad Hoc de Coerção implícita.
        // Também poderia ser escrita como "opc = (int) 0", sendo considerada Ad Hoc Coerção explícita.
        int opc = 0;
        
        String nome, setor, funcao;
        int numeroCracha, qtDeHoras;
        double valorHora, salario, desconto;
        
        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Inserir Funcionario\n"
                    + "2 - Exibir Funcionarios\n"
                    + "3 - Sair"));
            
            switch (opc) {
                case 1:
                    opc = Integer.parseInt(JOptionPane.showInputDialog(
                            "Tipo:" + "\n"
                            + "1 - Funcionario Horista\n"
                            + "2 - Funcionário Mensalista"));
                    nome = JOptionPane.showInputDialog("Nome:");
                    setor = JOptionPane.showInputDialog("Setor:");
                    funcao = JOptionPane.showInputDialog("Função:");
                    numeroCracha = Integer.parseInt(JOptionPane.showInputDialog("Nº do Crachá:"));
                    if (opc == 1) {
                        qtDeHoras = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas trabalhadas:"));
                        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor por cada hora trabalhada:"));
                        
                        // Neste caso, a "listaFuncionario" aceita dois tipos de objeto: "FuncionarioHorista" e "FuncionarioMensalista".
                        // Dessa forma, pode-se considerar este exemplo um Polimorfismo Universal de Inclusão.
                        listaFuncionario.add(new FuncionarioHorista(qtDeHoras, valorHora, numeroCracha, nome, setor, funcao));
                        
                    } else {
                        salario = Double.parseDouble(JOptionPane.showInputDialog("Salário Bruto:"));
                        desconto = Double.parseDouble(JOptionPane.showInputDialog("Valor de Descontos:"));
                        
                        // Neste caso, a "listaFuncionario" aceita dois tipos de objeto: "FuncionarioHorista" e "FuncionarioMensalista".
                        // Dessa forma, pode-se considerar este exemplo um Polimorfismo Universal de Inclusão.
                        listaFuncionario.add(new FuncionarioMensalista(salario, desconto, numeroCracha, nome, setor, funcao));
                    };
                    break;
                    
                case 2:
                    String msg = "";
                    for (Funcionario f : listaFuncionario) {
                        if (f instanceof FuncionarioHorista) {
                            msg += f.imprimir() + "\n--------------------------------\n";
                        } else {
                            msg += f.imprimir() + "\n--------------------------------\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                    
                case 3:
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida.");
            }
        }
    }
    
}
