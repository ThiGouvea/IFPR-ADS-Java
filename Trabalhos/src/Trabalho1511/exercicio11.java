package Trabalho1511;
import java.util.Scanner;

//11. Crie um algoritmo que leia um número inteiro e mostre na tela de 1 até o número  informado. Por exemplo:
//Se o número informado for 4, mostre na tela: 1 2 3 4
//Se o número informado for 7, mostre na tela: 1 2 3 4 5 6 7

public class exercicio11 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = Ler.nextInt();
        int contador = 1;

        while (contador <= numero) {
            System.out.print(contador + " ");
            contador++;
        }
    }
}
