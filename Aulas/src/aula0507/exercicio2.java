package aula0507;

//2 Crie um programa que calcule o volume de um tambor. Receba do usuario o raio e altura do tambor, aplique a formula
// e mostre o resultado volume = 3.14159 * raio^2 * h

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        double raio = ler.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = ler.nextDouble();

        System.out.println("O volume do cilindro é: " + (3.14159 * (raio * raio) * altura));
    }
}
