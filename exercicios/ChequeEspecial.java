package exercicios;

import java.util.Scanner;

public class ChequeEspecial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double saldo = scan.nextDouble();
        double saque = scan.nextDouble();

        // Define um limite para o cheque especial
        final double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else {
            if (saque > saldo + 500){
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            } else {
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            }
        }
        scan.close();
    }
}
