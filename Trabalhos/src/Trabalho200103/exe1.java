package Trabalho200103;
import javax.swing.JOptionPane;

/*
1) Receba do usuário via JOptionPane (interface visual) um número qualquer. Mostre do número 1 ao número informado.

Ex. Número informado: 7
Saída: 1 2 3 4 5 6 7

OBS: Crie uma validação para não permitir que o usuário informe um número menor que 1.

 */

public class exe1 {
    public static void main(String[] args ) {
        int numeroInt = -1;
        while (numeroInt < 1) {
            String numero = JOptionPane.showInputDialog("Informe um numero");
            numeroInt = Integer.parseInt(numero);
        }

        for (int contador = 1; contador <= numeroInt; contador++) {
            System.out.print(contador + " ");
        }
    }
}
