package exercicios;

import java.util.Scanner;

public class LimiteSaques {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double limiteDiario = scan.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; i < limiteDiario; i++) {
            double valorSaque = scan.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                limiteDiario -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f%n",limiteDiario);
            }
        }
        scan.close();
    }
}
