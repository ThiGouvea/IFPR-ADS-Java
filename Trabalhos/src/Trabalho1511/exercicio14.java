package Trabalho1511;
import java.util.Scanner;

//14. Crie um programa que receba salário de funcionários de uma empresa. O programa deve  parar de receber informações
// quando for informado -1. Ao final, mostre:
//a. O total gasto com salário com todos os funcionários;
//b. A média salarial dos funcionários da empresa;
//c. O maior e o menor salário.

public class exercicio14 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        double salario = 0;
        double total = 0;
        double media = 0;
        double maior = 0;
        double menor = -1;
        int contador = 0;

        do {
            System.out.println("Informe o salario (-1 para parar)");
            salario = Ler.nextDouble();
            if (menor == -1) {
                menor = salario;
            }
            if (salario != -1) {
                total += salario;
                contador++;
                if (salario > maior) {
                    maior = salario;
                } else if (salario < menor) {
                    menor = salario;
                }

            }
        } while (salario != -1);
        media = total / contador;
        System.out.println("O total gasto com salarios é de " + total);
        System.out.println("A media de salarios é de " + media);
        System.out.println("O menor salario é " + menor);
        System.out.println("O maior salario é " + maior);
    }
}
