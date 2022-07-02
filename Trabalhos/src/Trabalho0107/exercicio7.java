package Trabalho0107;

import java.util.Scanner;

//7. Crie um algoritmo que calcule a área de um retângulo. O algoritmo deve receber o tamanho da base e altura.

public class exercicio7 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o tamanho da base: ");
        double base = Ler.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = Ler.nextDouble();

        System.out.println("A area do retangulo eh:\n" + (base * altura));
    }
}
