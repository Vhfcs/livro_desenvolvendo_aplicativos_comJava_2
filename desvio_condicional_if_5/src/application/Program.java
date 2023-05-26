package application;

import javax.swing.*;
public class Program {
    static String A, B;
    public static void main(String[] args) {
        String C = "Linguagem Java";
        String A = JOptionPane.showInputDialog(null, "Digite a primeira letra:");
        String B = JOptionPane.showInputDialog(null, "Digite a primeira letra:");
            if(C.startsWith(A) && C.endsWith(B)){
                String st = ("A expressão começa com "+A+" e termina com "+B);
                JOptionPane.showMessageDialog(null, st, "Resultado da comparação", 1);
            }
            String ts = ("A frase e "+"\" "+C+"\"" );
            JOptionPane.showMessageDialog(null, ts, "Fim da comparação", 1);
            System.exit(0);
    }
}