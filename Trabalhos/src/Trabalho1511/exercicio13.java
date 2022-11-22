package Trabalho1511;
import java.util.Scanner;

//13. Crie um algoritmo que calcule o fatorial de um número recebido do usuário.
//Por exemplo: Se o número informado for 5, o fatorial será: 5*4*3*2*1 = 120.

public class exercicio13 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Digite um numero para saber o fatorial");
        int numero = Ler.nextInt();
        int fatorial = numero;

        do {
            numero--;
            fatorial *= numero;
        } while (numero > 1);
        System.out.println(fatorial);
    }
}
