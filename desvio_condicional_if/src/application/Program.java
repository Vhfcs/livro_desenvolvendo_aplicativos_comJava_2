package application;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        double x;
        double y;

        String X = JOptionPane.showInputDialog(null, "Digite o valor de X: ");
        String Y = JOptionPane.showInputDialog(null, "Digite o valor de y: ");
        x = Double.parseDouble(X);
        y = Double.parseDouble(Y);
        if (x==y){
            String st = "São iguais!";
            JOptionPane.showMessageDialog(null, st, "Resultado da comparação:", 1);
        }

        if (x != y){
            String st = "São diferentes!";
            JOptionPane.showMessageDialog(null, st, "Resultado da comparação:", 1);
        }
        System.exit(0);

    }
}