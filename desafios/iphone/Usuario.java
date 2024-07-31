package desafios.iphone;

import desafios.iphone.funcoes.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone tel = new Iphone();

        tel.atender();
        tel.ligar("11940028922");
        tel.correioVoz();
        System.out.println();
        tel.selecionarMusica("Let me know");
        tel.pausar();
        tel.tocar();
        System.out.println();
        tel.adicionarNovaAba("www.google.com");
        tel.exibirPagina();
        tel.atualizarPagina();


    }
}
