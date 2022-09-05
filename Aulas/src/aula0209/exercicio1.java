package aula0209;

//1. Crie um algoritmo que receba duas notas de um aluno, calcule a média e mostre se ele está aprovado,
//reprovado ou exame. Considere a média para aprovação 70 e para exame entre
//40 e 70. Se o aluno ficar com nota inferior a 40 ele está reprovado.

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota: ");
        double primeiraNota = Ler.nextDouble();
        System.out.println("Digite o valor da segunda nota: ");
        double segundaNota = Ler.nextDouble();

        double mediaNotas = (primeiraNota + segundaNota) / 2;

        if (mediaNotas >= 70 ) {
            System.out.println("Aluno aprovado.");
        } else if (mediaNotas >= 40 && mediaNotas < 70){
            System.out.println("Aluno esta de exame.");
        } else {
            System.out.println("Aluno reprovado");
        }

    }
}
