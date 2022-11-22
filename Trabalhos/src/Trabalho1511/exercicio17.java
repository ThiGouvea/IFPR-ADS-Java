package Trabalho1511;
import java.util.Scanner;

//17. Foi realizada uma pesquisa no Paraná e coletados os dados de altura e sexo (0=masculino,  1=feminino) das pessoas
// entrevistadas. Faça um programa que leia N dados de habitantes (até  que seja informado um número negativo para a
// altura) e mostre no final: a) a maior e a menor  altura encontrada; b) a média de altura das mulheres; c) a média de
// altura da população; d) o  percentual de homens na população.

public class exercicio17 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int masculino = 0;
        int feminino = 0;
        int total_populacao = 0;
        int sexo;
        double altura;
        double maior_altura = 0;
        double menor_altura = 100;
        double somatoria_altura_mulheres = 0;
        double somatoria_alturas = 0;

        while (true) {
            System.out.println("Informe a altura da pessoa pesquisada: ");
            altura = Ler.nextDouble();
            if (altura < 0) {
                break;
            } else {
                if (altura > maior_altura) {
                    maior_altura = altura;
                }
                if (altura < menor_altura) {
                    menor_altura = altura;
                }
                somatoria_alturas += altura;
            }
            System.out.println("Informe o sexo da pessoa pesquisada (0=masculino, 1=feminino):");
            sexo = Ler.nextInt();
            while (sexo > 1 || sexo < 0) {
                System.out.println("Somente numeros 1 ou 0 (0=masculino, 1=feminino)");
                sexo = Ler.nextInt();
            }
            total_populacao++;
            if (sexo == 1) {
                somatoria_altura_mulheres += altura;
                feminino++;
            } else {
                masculino++;
            }

        }
        System.out.println("Maior altura = " + maior_altura);
        System.out.println("Menor altura = " + menor_altura);
        double media_altura_mulheres = somatoria_altura_mulheres / feminino;
        System.out.println("A media de altura das mulheres = " + media_altura_mulheres);
        double media_altura_populacao = somatoria_alturas / total_populacao;
        System.out.println("A media de altura da população = " + media_altura_populacao);
        double percentual_homens = (masculino * 100) / total_populacao;
        System.out.println("O percentual de homens = " + percentual_homens);

    }
}
