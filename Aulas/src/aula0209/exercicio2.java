    package aula0209;

//2. Crie um algoritmo que receba duas notas de um aluno (1 trabalho + 1 prova),
//calcule a média ponderada e mostre se ele está aprovado, reprovado ou exame.
//O trabalho deve ter peso 3 e a prova peso 7. Considere a média para aprovação 6.0 e para
//exame entre 3.0 e 6.0. Se o aluno ficar com nota inferior a 3.0 ele está reprovado.

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite o valor do trabalho: ");
        double notaTrabalho = Ler.nextDouble();
        System.out.println("Digite o valor da prova");
        double notaProva = Ler.nextDouble();

        double mediaPonderada = (notaTrabalho * 3 + notaProva * 7) / (3 + 7);

        if (mediaPonderada >= 6.0 ) {
            System.out.println("Aluno aprovado.");
        } else if (mediaPonderada >= 3.0 && mediaPonderada < 6.0){
            System.out.println("Aluno esta de exame.");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
