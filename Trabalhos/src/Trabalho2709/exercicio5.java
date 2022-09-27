package Trabalho2709;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();

        if (numero % 3 ==0) {
            System.out.println("O numero é divisivel por 3 ");
        } else {
            System.out.println("O numero não é divisivel por 3");
        }

    }
}
