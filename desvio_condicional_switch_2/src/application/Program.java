package application;

import javax.swing.*;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        char es;

        String st = "Escolha um planeta: " +
                "\nMercúrio (a)"+
                "\nVênus (b)"+
                "\nTerra (c)"+
                "\nMarte (d)"+
                "\nJúpiter (e)"+
                "\nSaturno (f)"+
                "\nUrano (g)"+
                "\nNetuno (h)"+
                "\nPlutão (i)";

        String a = JOptionPane.showInputDialog(null, st);

        es = a.charAt(0);
        switch (es) {
            case 'a': st = Planetas.mercurio;
                break;
            case 'b': st = Planetas.venus;
                break;
            case 'c': st = Planetas.terra;
                break;
            case 'd': st = Planetas.marte;
                break;
            case 'e': st = Planetas.jupiter;
                break;
            case 'f': st = Planetas.saturno;
                break;
            case 'g': st = Planetas.urano;
                break;
            case 'h': st = Planetas.netuno;
                break;
            case 'i': st = Planetas.plutao;
                break;
            default: st = "Planeta inexistente!";
        }
        String ms = "Dados astronômicos dos planetas: ";
        JOptionPane.showMessageDialog(null, st, ms, 1);
        System.exit(0);
    }
}