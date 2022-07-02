package Trabalho0107;

import java.util.Scanner;

//9. Crie um algoritmo para calcular o IMC de uma pessoa. IMC = peso/altura²

public class exercicio9 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = Ler.nextDouble();
        System.out.println("Digite sua altura:");
        double altura = Ler.nextDouble();

        System.out.println("Seu IMC eh: " + (peso / (altura * altura)));
    }
}
