package aula3008;

//1) Receba o peso de 2 elefantes e escreva se cada um deles tem o peso valido para viajar no caminhão para um espetaculo
//do circo de Umuarama. Considere peso valido entre 2000 e 5000 kg.

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite o peso do primeiro elefante: ");
        double pesoElefanteUm = Ler.nextDouble();
        if (pesoElefanteUm >= 2000 && pesoElefanteUm <= 5000) {
            System.out.println("Peso do primeiro valido!");
        } else {
            System.out.println("Peso do primeiro elefante invalido");
        }
        System.out.println("Digite o peso do segundo elefante: ");
        double pesoElefanteDois = Ler.nextDouble();
        if (pesoElefanteDois >= 2000 && pesoElefanteDois <= 5000) {
            System.out.println("Peso do segundo valido!");
        } else {
            System.out.println("Peso do segundo elefante invalido");
        }
    }
}
