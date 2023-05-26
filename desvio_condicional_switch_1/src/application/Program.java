package application;

import javax.swing.*;
public class Program {
    public static void main(String[] args) {
        int escolha; // criar a String dessa forma facilita a formatação da mensagem

        String st = "Escolha um sabor: "+
                "\nAbacaxi = 1"+
                "\nAbacate = 2"+
                "\nAbóbora = 3"+
                "\nChocolate = 4"+
                "\nCoco = 5"+
                "\nLaranja = 6"+
                "\nMorango = 7"+
                "\nTangerina = 8";

        String a = JOptionPane.showInputDialog(null, st);
        escolha = Integer.parseInt(a);

        switch (escolha){
            case 1: st = "Abacaxi" ; break;
            case 2: st = "Abacate" ; break;
            case 3: st = "Abobóra" ; break;
            case 4: st = "Chocolate" ; break;
            case 5: st = "Coco" ; break;
            case 6: st = "Laranja" ; break;
            case 7: st = "Morango" ; break;
            case 8: st = "Tangerina" ; break;
            default: st="Inexistente!";
        }
        String ms = "Sorveteria do Zé:";
        String mss = "Sabor escolhilo: ";

        JOptionPane.showMessageDialog(null, mss+st,ms,1);

        System.exit(0);

    }
}