package Trabalho160323;

import java.util.Scanner;

public class exercicios {
    public static void Exercicio1 (double numero) {
        System.out.println("A metade do numero é: " + numero / 2 );
        System.out.println("O dobro do numero é: " + numero * 2);
        System.out.println("O triplo do numero é: " + numero * 3);
    }
    public static void Exercicio2 (int numero) {
        System.out.println("A tabuada do numero " + numero + " é:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }

    public static void Exercicio3 (String nome) {
        System.out.println("IFPR - INSTITUTO FEDERAL DO PARANÁ\n" +
                "Bem-vindo, " + nome);
    }

    public static void Exercicio4 (int numero) {
        String numerosRomanos = "IVX";
        if (numero <= 3) {
            for (int i = 0; i < numero; i++) {
                System.out.print(numerosRomanos.charAt(0));
            }
        } else if (numero == 4) {
            System.out.print(numerosRomanos.charAt(0) + "" + numerosRomanos.charAt(1));
        } else if (numero >= 5 & numero <= 8) {
            System.out.print(numerosRomanos.charAt(1));
            numero = numero - 5;
            for (int i = 0; i < numero; i++) {
                System.out.print(numerosRomanos.charAt(0));
            }
        } else if (numero == 9) {
            System.out.print(numerosRomanos.charAt(0) + "" + numerosRomanos.charAt(2));
        } else {
            System.out.println(numerosRomanos.charAt(2));
        }
    }

    public static String Exercicio5 (int numero) {
        String numerosRomanos = "IVX";
        String numeroRomanoRetorno = "";
        if (numero <= 3) {
            for (int i = 0; i < numero; i++) {
                numeroRomanoRetorno += (numerosRomanos.charAt(0) + "");
            }
        } else if (numero == 4) {
            numeroRomanoRetorno = numerosRomanos.charAt(0) + "" + numerosRomanos.charAt(1);
        } else if (numero >= 5 & numero <= 8) {
            numeroRomanoRetorno = numerosRomanos.charAt(1) + "";
            numero = numero - 5;
            for (int i = 0; i < numero; i++) {
                numeroRomanoRetorno += numerosRomanos.charAt(0) + "";
            }
        } else if (numero == 9) {
            numeroRomanoRetorno = numerosRomanos.charAt(0) + "" + numerosRomanos.charAt(2);
        } else {
            numeroRomanoRetorno = numerosRomanos.charAt(2) + "";
        }
        return numeroRomanoRetorno;
    }

    public static double Exercicio6 (double numero1, double numero2, double numero3) {
        double maiorNumero = numero1;
        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        } if (numero3 > maiorNumero) {
            maiorNumero = numero3;
        }
        return maiorNumero;
    }

    public static double Exercicio7 (double numero1, double numero2) {
        double menorNumero = numero1;
        if (numero2 < menorNumero) {
            menorNumero = numero2;
        }
        return menorNumero;
    }

    public static double Exercicio8 (double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public static double Exercicio9 (double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static double Exercicio10 (int numero1, int numero2) {
        int somatoria = 0;
        for (int i = numero1; i <= numero2; i++) {
            somatoria += i;
        }
        return somatoria;
    }

    public static double Exercicio11 (int numero) {
        int fatorial = 1;
        int fatorialAntigo = 1;

        if (numero == 0) {
            return 1;
        }

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorialAntigo * i;
            fatorialAntigo = fatorial;
        }
        return fatorial;
    }

    public static String Exercicio12 (int numero) {
        int termoAntigo = 0;
        int termoNovo = 1;
        int termo = 0;
        int somatoria = 1;
        String sequencia = "0, 1";

        if (numero == 0) {
            System.out.println("0");
            return "Sequencia: " + sequencia + "\nSoma: " + "0";
        } else if (numero == 1) {
            System.out.println("0, 1");
            return "Sequencia: " + sequencia + "\nSoma: " + somatoria;
        }

        for (int i = 0; i < numero - 2; i++) {
            termo = termoAntigo + termoNovo;
            termoAntigo = termoNovo;
            termoNovo = termo;
            somatoria += termo;
            sequencia += ", " + termo;
        }
        return "Sequencia: " + sequencia + "\nSoma: " + somatoria;

    }



    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println(Exercicio5(i));
        }
        System.out.println(Exercicio6(1, 3, 2));
        System.out.println(Exercicio7(1, -23));
        System.out.println(Exercicio8(2, 4, 5));

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = ler.next();
            System.out.println("Digite a primeira nota: ");
            double nota1 = ler.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = ler.nextDouble();

            System.out.println("Digite a terceira nota: ");
            double nota3 = ler.nextDouble();

            System.out.println("Digite a quarta nota: ");
            double nota4 = ler.nextDouble();

            Exercicio3(nome);
            System.out.println("A media da sua nota é: ");
            System.out.println(Exercicio9(nota1, nota2, nota3, nota4));
        }
        System.out.println(Exercicio10(5, 10));
        System.out.println(Exercicio11(5));
        System.out.println(Exercicio12(10));
    }
}
