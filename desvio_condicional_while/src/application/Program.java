package application;
import javax.swing.*;
import java.awt.*;
import java.util.Locale;


public class Program {
    public static double saldo = 0.0;
    public static double saldo2 = 0.0;
    public static double saldo3 = 0.0;
    public static double limite = 0.0;
    public static double resto = 0.0;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String C = JOptionPane.showInputDialog(null, "Limite do Cheque especial");
        C = C.replace(',','.');
        limite = Double.parseDouble(C);
        limite = limite;
        String B = JOptionPane.showInputDialog(null, "Digite o valor do Saldo anterior");
        B = B.replace(',','.');
        saldo = Double.parseDouble(B);

        while (saldo > limite) {
            System.out.println(".");
            String A = JOptionPane.showInputDialog(null, "Digite o valor do saque:");
            A = A.replace(',', '.');
            double saque = Double.parseDouble(A);
            saldo2 = saldo - saque;
            saldo2 *= 100;
            saldo2 = Math.ceil(saldo2);
            saldo2 /= 100;
            resto = -limite + saldo2;
            resto *= 100;
            resto = Math.ceil(resto);
            resto /= 100;

            if (resto < 0.0) {
                JOptionPane.showMessageDialog(null, "Operação não permitida!\n"+"Você estourou o limite!", "Atualização de Saldo", 1);
                System.exit(0);
            }
            String st = ("Saldo anterior: R$" +saldo+
                    "\nEste saque: R$" +saque+
                    "\nSaldo final: R$" +saldo2+
                    "\nLimite de crédito: R$" +(-limite)+
                    "\n "+
                    "\nVocê ainda tem: R$" +resto);
            JOptionPane.showMessageDialog(null, st, "Atualizacão de saldo", 1);
            saldo = saldo2;

            if (resto == 0.0){
                JOptionPane.showMessageDialog(null,"Fim do programa"+ "\nseu crédito acabou!", "Atualização de saldo",1);
            }
        System.exit(0);
        }

    }
}