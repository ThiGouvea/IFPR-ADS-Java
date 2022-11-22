package Trabalho1511;
import java.util.Scanner;

//19. Crie um sistema de login. O usuário deve ser “java” e a senha “123”. Conte o número de  tentativas erradas.
// Caso a pessoa informar as credenciais corretas, mostre a mensagem “Logado  com sucesso”, caso a pessoa errar
//3 vezes, saia do sistema.

public class exercicio19 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        String login = "java";
        String senha = "123";
        String usuario = "";
        String senha_digitada = "";
        int tentativas = 0;

        while (true) {
            System.out.println("Digite o nome de usuario: ");
            usuario = Ler.next();
            System.out.println("Digite a senha: ");
            senha_digitada = Ler.next();
            if (usuario.equals(login) && senha_digitada.equals(senha)) {
                System.out.println("Logado com sucesso");
                break;
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
