package Trabalho0107;

import java.util.Scanner;

//15. Faça um algoritmo que receba o nome e 4 notas de um aluno. O algoritmo deve calcular a média, em que
//MEDIA = (NOTA1 + NOTA2 + NOTA3 + NOTA4) / 4, e mostrar uma mensagem com o nome e a média do aluno.Ex.
//<nome do aluno>, sua média é <média>
//Pedro, sua média é 8,5

public class exercicio15 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = Ler.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = Ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = Ler.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = Ler.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = Ler.nextDouble();

        System.out.println(nomeAluno + ", sua media eh " + ((nota1 + nota2 + nota3 + nota4) / 4));
    }
}
