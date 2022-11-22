package Trabalho1511;
import java.util.Scanner;

//5. Crie um programa que receba 4 notas de um aluno e, ao final, mostre qual foi a média  obtida e se o
//aluno está aprovado ou reprovado. Considere a média 7.

public class exercicio5 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        double somatoria = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Informe a " + i + "° nota");
            nota = Ler.nextInt();
            somatoria += nota;
        }
        media = somatoria / 4;
        if (media >= 7 ) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
