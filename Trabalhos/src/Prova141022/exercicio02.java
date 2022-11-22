package Prova141022;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = ler.next();
        System.out.println("Digite sua idade: ");
        double idade = ler.nextDouble();


        if (idade < 16) {
            System.out.println(nome + " = Não eleitor");
        } else if (idade >= 18 && idade < 65) {
            System.out.println(nome + " = Eleitor obrigatorio");
        } else {
            System.out.println(nome + " = Eleitor facultativo");
        }


    }
}






















