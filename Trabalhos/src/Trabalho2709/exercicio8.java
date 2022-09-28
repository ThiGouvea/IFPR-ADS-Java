package Trabalho2709;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double pesoNoPlanetaEscolhido;
        double pesoNaTerra;
        int planetaEscolhido;

        System.out.println("Digite seu peso:");
        pesoNaTerra = ler.nextDouble();

        System.out.print(
                "\n No Planeta Gravidade" +
                        "\n 1 Mercúrio 0,37" +
                        "\n 2 Vênus    0,88 " +
                        "\n 3 Marte    0,38" +
                        "\n 4 Júpiter  2,64" +
                        "\n 5 Saturno  1,15" +
                        "\n 6 Urano    1,17");

        System.out.println("\n \n De acordo com os planetas acima digite o numero do planeta que desejaria" +
                "\n saber seu peso se estivesse nele:");

        planetaEscolhido = ler.nextInt();
        if (planetaEscolhido == 1 ) {
            pesoNoPlanetaEscolhido = (pesoNaTerra / 10) * 0.37;
            System.out.println("O planeta escolhido foi Mercurio e seu peso nele seria: " + pesoNoPlanetaEscolhido + " Kg");
        }else if (planetaEscolhido == 2 ) {
            pesoNoPlanetaEscolhido = (pesoNaTerra / 10) * 0.88;
            System.out.println("O planeta escolhido foi Venus e seu peso nele seria: " + pesoNoPlanetaEscolhido + " Kg");
        }else if (planetaEscolhido == 3 ) {
            pesoNoPlanetaEscolhido = (pesoNaTerra / 10) * 0.38;
            System.out.println("O planeta escolhido foi Marte e seu peso nele seria: " + pesoNoPlanetaEscolhido + " Kg");
        }else if (planetaEscolhido == 4 ) {
            pesoNoPlanetaEscolhido = (pesoNaTerra / 10) * 2.64;
            System.out.println("O planeta escolhido foi Jupiter e seu peso nele seria: " + pesoNoPlanetaEscolhido + " Kg");
        }else if (planetaEscolhido == 5 ) {
            pesoNoPlanetaEscolhido = (pesoNaTerra / 10) * 1.15;
            System.out.println("O planeta escolhido foi Saturno e seu peso nele seria: " + pesoNoPlanetaEscolhido + " Kg");
        }else if (planetaEscolhido == 6 ) {
            pesoNoPlanetaEscolhido = (pesoNaTerra / 10) * 1.17;
            System.out.println("O planeta escolhido foi Urano e seu peso nele seria: " + pesoNoPlanetaEscolhido + " Kg");
        } else {
            System.out.println("Escolha de planeta invalida");
        }
    }
}
