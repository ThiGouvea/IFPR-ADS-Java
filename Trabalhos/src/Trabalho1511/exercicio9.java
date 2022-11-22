package Trabalho1511;
import java.util.Scanner;

//9. Crie um programa que receba 10 números Double e, ao final, mostre a soma dos números.

public class exercicio9 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        double numero = 0;
        int contador = 1;
        double somatoria = 0;

        while (contador <= 10) {
            System.out.println("Digite o " + contador + "° numero");
            numero = Ler.nextDouble();
            somatoria += numero;
            contador++;
        }
        System.out.println("A soma dos numeros digitados é " + somatoria);
    }
}
