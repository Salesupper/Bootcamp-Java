package sintaxeBasica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);

            System.out.println("digite o nome: ");
            String nome = leitor.next();

            System.out.println("digite o sobrenome: ");
            String sobrenome = leitor.next();

            System.out.println("digite a idade: ");
            int idade = leitor.nextInt();

            System.out.println("digite a altura: ");
            float altura = leitor.nextFloat();

            leitor.close();

            System.out.println("nome: " + nome);
            System.out.println("sobrenome: " + sobrenome);
            System.out.println("idade: " + idade);
            System.out.println("altura: " + altura);

        }catch (InputMismatchException e){
            System.out.println("idade e altura precisam ser numéricos, a altura precisa ser com virgula");
        }
    }
}
