package aula2309;

public class aula {
    public static void main(String[] args) {

        String codigoGrupo = "PROD@VINHO";

        if (codigoGrupo.equalsIgnoreCase("PROD2vinho")) {
            System.out.println("valida desconto");
        } else {
            System.out.println("Não valida desconto");
        }
    }
}
