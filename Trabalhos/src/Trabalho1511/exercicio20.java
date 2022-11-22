package Trabalho1511;
import java.util.Scanner;

//20. Modifique o exercício anterior para fazer um CAIXA ELETRÔNICO. Após logado, o  usuário deve informar o valor que
// ele deseja sacar. Na sequência, mostre a quantidade mínima  de notas que serão dadas ao usuário
// (possíveis notas: 100, 50, 20, 10, 5 e 2).
//Validações:
//a) O sistema deve limitar o saque a R$1500.
//b) Verificar se o valor informado para saque é válido ou não, por exemplo, R$11 não é possível  sacar, pois não
// tem nota de R$1.

public class exercicio20 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        String login = "java";
        String senha = "123";
        String usuario = "";
        String senha_digitada = "";
        int tentativas = 0;
        double valor_saque;
        double valor_restante;
        int notas_100 = 0;
        int notas_50 = 0;
        int notas_20 = 0;
        int notas_10 = 0;
        int notas_5 = 0;
        int notas_2 = 0;

        while (true) {
            System.out.println("Digite o nome de usuario: ");
            usuario = Ler.next();
            System.out.println("Digite a senha: ");
            senha_digitada = Ler.next();
            if (usuario.equals(login) && senha_digitada.equals(senha)) {
                System.out.println("Logado com sucesso");
                System.out.println("Digite o valor que deseja sacar:");
                System.out.println("Notas disponiveis (100, 50, 20, 10, 5 e 2)");
                System.out.print("Valor: R$ ");
                valor_saque = Ler.nextDouble();
                while (valor_saque > 1500 || valor_saque < 0) {
                    System.out.println("Saque limitado á um valor maior que R$ 0 e menor que R$ 1500");
                    System.out.print("Valor: R$ ");
                    valor_saque = Ler.nextDouble();
                }
                valor_restante = valor_saque;
                while (valor_restante >= 100) {
                    valor_restante -= 100;
                    notas_100++;
                }
                while (valor_restante >= 50) {
                    valor_restante -= 50;
                    notas_50++;
                }
                while (valor_restante >= 20) {
                    valor_restante -= 20;
                    notas_20++;
                }
                while (valor_restante >= 10) {
                    valor_restante -= 10;
                    notas_10++;
                }
                while (valor_restante >= 5) {
                    valor_restante -= 5;
                    notas_5++;
                }
                while (valor_restante >= 2) {
                    valor_restante -= 2;
                    notas_2++;
                }
                if (valor_restante != 0) {
                    System.out.println("Não foi possivel retirar o valor de R$ " + valor_saque + " com as notas disponiveis");
                    continue;
                } else {
                    System.out.println("Saque realizado com sucesso:");
                    System.out.println(notas_100 +" notas de R$ 100");
                    System.out.println(notas_50 +" notas de R$ 50");
                    System.out.println(notas_20 +" notas de R$ 20");
                    System.out.println(notas_10 +" notas de R$ 10");
                    System.out.println(notas_5 +" notas de R$ 5");
                    System.out.println(notas_2 +" notas de R$ 2");
                }
            } else {
                tentativas++;
                System.out.println("Senha ou login errado, digite novamente");
                System.out.println("Numero de tentativas erradas " + tentativas + "/3");
                if (tentativas >= 3) {
                    System.out.println("Muitas tentativas erradas, saida automatica do sistema");
                    break;
                }
            }
        }

    }
}
