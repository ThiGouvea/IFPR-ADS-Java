package Trabalho0107;

import java.util.Scanner;

//10. Crie um algoritmo para calcular a área de um círculo. Área = 3,1416 * raio * raio

public class exercicio10 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o raio:");
        double raio = Ler.nextDouble();

        System.out.println("A area do circulo eh: " + (3.1416 * raio * raio));
    }
}
