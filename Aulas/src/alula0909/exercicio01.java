package alula0909;

//1) crie um programa que receba a idade de uma pessoa e informa a sua classe de idade conforme a tabela abaixo:
//IDADE               CLASSE DE IDADE
//0 a 14              Criança
//15 a 17             Adolescente
//18 a 24             Jovem
//25 a 64             Adulto
//>=65                Idoso

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = Ler.nextInt();

        if (idade <= 14) {
            System.out.println("Com idade de " + idade + " se classifica como 'Criança'");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("Com idade de " + idade + " se classifica como 'Adolescente'");
        } else if (idade >= 18 && idade <= 24) {
            System.out.println("Com idade de " + idade + " se classifica como 'Jovem'");
        } else if (idade >= 25 && idade <= 64) {
            System.out.println("Com idade de " + idade + " se classifica como 'Adulto'");
        } else {
            System.out.println("Com idade de " + idade + " se classifica como 'Idoso'");
        }



    }
}
