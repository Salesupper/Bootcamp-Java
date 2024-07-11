package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;
        boolean continuar = true;

        while (continuar){
            System.out.println("1.Depositar\n2.Sacar\n3.Consultar Saldo\n0.Encerrar");

            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    double deposito = scan.nextDouble();
                    saldo += deposito;
                    System.out.printf("Saldo atual: %.1f%n",saldo);
                    break;
                case 2:
                    double saque = scan.nextDouble();
                    if (saldo < saque) System.out.println("Saldo insuficiente.");
                    else{
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f%n",saldo);
                    };
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f%n",saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scan.close();
    }
}
