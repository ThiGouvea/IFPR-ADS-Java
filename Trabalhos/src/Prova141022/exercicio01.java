package Prova141022;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = ler.next();
        System.out.println("Digite a primeira nota: ");
        double primeiraNota = ler.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double segundaNota = ler.nextDouble();
        double mediaNotas = (primeiraNota + segundaNota) / 2;

        if (mediaNotas >= 6.5) {
            System.out.println("O aluno " + nomeAluno + " esta aprovado!");
        } else if (mediaNotas < 6.5 && mediaNotas >= 4) {
            System.out.println("O aluno " + nomeAluno + " esta de exame!");
        } else {
            System.out.println("O aluno " + nomeAluno + " esta reprovado!");
        }


    }
}
