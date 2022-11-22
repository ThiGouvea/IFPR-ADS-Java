package Trabalho1511;
import java.util.Scanner;

//15. Crie um programa que fique lendo números até que o usuário digite 0 (condição de parada).  Mostre:
//a) a média aritmética dos valores recebidos (com exceção do 0)
//b) quantos números foram digitados (com exceção do 0)
//c) a quantidade de valores positivos e negativos
//d) o percentual de valores positivos e negativos

public class exercicio15 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        double numero;
        double somatoria = 0;
        double media;
        int quantidade_digitados = 0;
        int positivos = 0;
        int negativos = 0;
        double porcentagem_positivos;
        double porcentagem_negativos;

        while (true) {
            System.out.println("Digite um numero (0 para parar):");
            numero = Ler.nextDouble();
            if (numero == 0) {
                break;
            } else {
                somatoria += numero;
                quantidade_digitados++;
                if (numero > 0) {
                    positivos++;
                } else {
                    negativos++;
                }
            }
        }
        media = somatoria / quantidade_digitados;
        porcentagem_positivos = (positivos * 100) / quantidade_digitados;
        porcentagem_negativos = (negativos * 100) / quantidade_digitados;

        System.out.println("A media é " + media);
        System.out.println("A quantidade de numeros digitados é " + quantidade_digitados);
        System.out.println("A quantidade de positivos é " + positivos);
        System.out.println("A quantidade de negativos é " + negativos);
        System.out.println("A porcentagem de positivos é " + porcentagem_positivos);
        System.out.println("A porcentagem de negativos é " + porcentagem_negativos);
    }
}
