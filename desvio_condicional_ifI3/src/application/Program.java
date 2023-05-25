package application;

import javax.swing.*;
public class Program {

    static String A, B;
    public static void main(String[] args) {
        String A = JOptionPane.showInputDialog(null, "Digite um nome: ");
        String B = JOptionPane.showInputDialog(null, "Digite outro nome: ");
        if (A.equals(B)){
            String st = "As duas palavras são iguais "+A+" e "+B;
            JOptionPane.showMessageDialog(null, st, "Resultado da comparação", 1);
        }
        System.exit(0);
    }
}
