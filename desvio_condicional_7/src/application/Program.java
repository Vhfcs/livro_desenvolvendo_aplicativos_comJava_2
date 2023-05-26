package application;

import javax.swing.*;
public class Program {
    static String A;
    public static void main(String[] args) {
        String A = JOptionPane.showInputDialog(null, "Digite o valor de X:");
        double x = Double.parseDouble(A);
        if (x == 9){
            x = Math.sqrt(x);
            String st = "A raiz quadrada de X ="+x;
            JOptionPane.showMessageDialog(null, st, "Resultado da comparação: ", 1);
        }
        else {
            x = Math.pow(x,2);
            String st = "O valor de valor de X elevado ao quadrado = "+x;
            JOptionPane.showMessageDialog(null, st, "Resultado da comparação", 1);
        }
        System.exit(0);
    }
}