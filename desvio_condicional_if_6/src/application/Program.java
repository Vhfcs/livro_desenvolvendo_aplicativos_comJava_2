package application;

import javax.swing.*;
public class Program {
    public static void main(String[] args) {
        String A = JOptionPane.showInputDialog(null, "Digite o valor de X:");
        int x = Integer.parseInt(A);

        if (x<10){
            if (x>4){
                if (x!=7){
                    String st = "X menor do que 10 \n maior do que 4 \n mas diferente de 7";
                    JOptionPane.showMessageDialog(null, st, "Resultado da comparação", 1);
                }
            }
        }
        String ts = ("X = "+"\" "+x+"\"");
        JOptionPane.showMessageDialog(null, ts, "Fim da comparação", 1);
        System.exit(0);
    }
}