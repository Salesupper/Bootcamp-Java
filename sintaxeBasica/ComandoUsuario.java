package sintaxeBasica;

import java.util.Scanner;

public class ComandoUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite o nome: ");
        String nome = leitor.next();

        System.out.println("digite o sobrenome: ");
        String sobrenome = leitor.next();

        System.out.println("digite a idade: ");
        int idade = leitor.nextInt();

        /* digitar no terminal com virgula ou colocar:
        .useLocale(Locale.US);
        após o (System.in)*/

        System.out.println("digite a altura: ");
        float altura = leitor.nextFloat();

        leitor.close();

        System.out.println("nome: "+ nome);
        System.out.println("sobrenome: "+ sobrenome);
        System.out.println("idade: "+ idade);
        System.out.println("altura: "+ altura);
    }
}
