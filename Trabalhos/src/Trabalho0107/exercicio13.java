package Trabalho0107;

import java.util.Scanner;

//13. Faça um algoritmo que receba 2 notas de um aluno. O algoritmo deve calcular a média,
//em que MEDIA = (NOTA1 + NOTA2) / 2, e mostrar uma mensagem com a média do aluno.

public class exercicio13 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = Ler.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = Ler.nextDouble();

        System.out.println("A media do aluno foi: " + ((nota1 + nota2) / 2));

    }
}
