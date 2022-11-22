package Trabalho1511;
import java.util.Scanner;

//16. Crie um programa que leia uma quantidade desconhecida de números e conte quantos deles  estão nos
// seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve  terminar quando for
// lido um número negativo.

public class exercicio16 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        double numero;
        int entre_0e25 = 0;
        int entre_26e50 = 0;
        int entre_51e75 = 0;
        int entre_76e100 = 0;
        int mais_100 = 0;

        while (true) {
        System.out.println("Digite um numero");
        numero = Ler.nextDouble();
        if (numero < 0) {
            break;
        } else {
            if (numero > 0 && numero <= 25) {
                entre_0e25++;
            } else if (numero > 25 && numero <= 50){
                entre_26e50++;
            } else if (numero > 50 && numero <= 75) {
                entre_51e75++;
            } else if (numero > 75 && numero <= 100) {
                entre_76e100++;
            } else {
                mais_100++;
            }
        }
        }
        System.out.println("[0 - 25] = " + entre_0e25);
        System.out.println("[26-50] = " + entre_26e50);
        System.out.println("[51-75] = " + entre_51e75);
        System.out.println("[76-100] = " + entre_76e100);
        System.out.println("[> 100] = " + mais_100);
    }
}
