package Trabalho1511;
import java.util.Scanner;

//2. Crie um programa que receba 5 números do usuário e mostre o dobro de cada número.

public class exercicio2 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        double numero;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "° numero");
            numero = Ler.nextDouble();
            System.out.println("O dobro do numero é " + (numero * 2));
        }


    }

}
