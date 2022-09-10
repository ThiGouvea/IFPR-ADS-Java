package alula0909;

//2) Crie um programa que recema o nome e a idade de uma pessoa e mostre qual a classe eleitoral dele.
//IDADE                                     CLASSE ELEITORAL
//<16                                       Não eleitor
//A partir de 18 e menor que 65             Eleitor
//De 16 até 17 e maior que 65               Eleitor Facultativo

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = Ler.next();
        System.out.println("Digite sua idade: ");
        int idade = Ler.nextInt();

        if (idade < 16){
            System.out.println(nome + ", com idade de " + idade + " se classifica como 'Não eleitor'");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println(nome + ", com idade de " + idade + " se classifica como 'Eleitor'");
        }else {
            System.out.println(nome + ", com idade de " + idade + " se classifica como 'Eleitor facultativo'");
        }


    }
}
