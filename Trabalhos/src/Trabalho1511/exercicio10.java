package Trabalho1511;
import java.util.Scanner;

// 10. Crie um programa que calcule o fatorial de um número recebido do usuário.
// Por exemplo:  Se o número informado for 5, o fatorial será: 5*4*3*2*1 = 120

public class exercicio10 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int numero = Ler.nextInt();
        int numero_final = numero;
        int fatorial = numero;
        numero--;

        while (numero > 0) {
            fatorial *= numero;
            numero--;
        }
        System.out.println("O fatorial de " + numero_final + " é " + fatorial);
    }
}
