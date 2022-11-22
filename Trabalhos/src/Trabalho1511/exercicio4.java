package Trabalho1511;
import java.util.Scanner;

//4. Crie um programa para receber 5 números inteiros. Para cada número informado mostre
//se ele é positivo, negativo ou zero.

public class exercicio4 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int numero;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o " + i + "° numero inteiro");
            numero = Ler.nextInt();
            if (numero > 0 ) {
                System.out.println("Numero positivo");
            } else if (numero < 0) {
                System.out.println("Numero negativo");
            }else {
                System.out.println("Numero zero");
            }
        }
    }
}
