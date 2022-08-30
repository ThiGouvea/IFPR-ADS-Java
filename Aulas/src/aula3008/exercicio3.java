package aula3008;

//3) Crie um programa que receba 2 numeros. Mostre qual e o maior e qual o menor. Se forem iguais mostre uma mensagem
// mostrando que são iguais.

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double numeroUm = Ler.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numeroDois = Ler.nextDouble();

        if (numeroUm > numeroDois) {
            System.out.println("O primeiro numero é maior que o segundo.");
        } if (numeroDois > numeroUm) {
            System.out.println("O segundo numero é maior que o segundo.");
        } if (numeroUm == numeroDois) {
            System.out.println("Os dois numeros são iguais");
        }


    }
}
