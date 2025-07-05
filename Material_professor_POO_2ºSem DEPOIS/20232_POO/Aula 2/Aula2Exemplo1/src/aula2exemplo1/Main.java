/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2exemplo1;

import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Curso curso1 = new Curso(UUID.randomUUID());
        curso1.setNome("Análise e Desenvolvimento de Sistemas");
        curso1.setDuracao(5);
        JOptionPane.showMessageDialog(null, 
                                       curso1.imprimir());
    }
    
}
