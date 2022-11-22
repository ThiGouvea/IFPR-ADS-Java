package Trabalho1511;
import java.util.Scanner;

//18. Uma rainha requisitou os serviços do empresário João, que exigiu o pagamento em grãos  de trigo da seguinte
// maneira: os grãos de trigo estariam dispostos em um tabuleiro de xadrez (8  linhas e 8 colunas), de tal forma que
// a primeira casa do tabuleiro tivesse um grão, e as casas  seguintes o dobro da anterior. Construa um algoritmo que
// calcule quantos grãos de trigo a Rainha  deverá pagar ao empresário João.

public class exercicio18 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        double numero = 1;

        for (int i = 1; i <= 64; i++) {
            numero *= 2;
        }
        System.out.println(numero);
    }
}
