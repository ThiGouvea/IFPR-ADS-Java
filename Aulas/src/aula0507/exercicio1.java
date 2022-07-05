package aula0507;

//1 Crie um programa que calcule a area de um circulo. Receba o valor do raio do circulo e aplique a formula:
//area = 3.14159 * (raio * raio)

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        double raio = ler.nextDouble();

        double area = 3.14159 * (raio * raio);

        System.out.println("A area do circulo é: " + area);
    }
}
