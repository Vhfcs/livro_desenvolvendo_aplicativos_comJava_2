import javax.swing.*;
public class Main {
    static int x;
    public static void main(String[] args) {
        for (x = 1; x <= 10; x++){
            String A = JOptionPane.showInputDialog(null, "Digite um nome: ");
            String y = String.valueOf(x);
            System.out.println(y+" "+A);
        }
        System.out.println("");
        System.exit(0);
    }
}