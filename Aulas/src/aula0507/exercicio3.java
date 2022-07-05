package aula0507;

//3 Crie um programa que receba o salario bruto e o valor de desconto e mostra o salario liquido do funcionario

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do salario bruto: ");
        double salarioBruto = ler.nextDouble();
        System.out.println("Digite o valor do desconto: ");
        double desconto = ler.nextDouble();

        System.out.println("O valor do salario liquido é: " + (salarioBruto - desconto));
    }
}
