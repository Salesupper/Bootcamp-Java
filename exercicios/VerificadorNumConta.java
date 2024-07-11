package exercicios;

import java.util.Scanner;

public class VerificadorNumConta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            String numeroConta = scan.nextLine();

            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scan.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
