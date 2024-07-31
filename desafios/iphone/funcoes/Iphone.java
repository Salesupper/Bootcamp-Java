package desafios.iphone.funcoes;

public class Iphone {
    private String musica;
    private String pagina;

    //telefone
    public void ligar(String numero){
        System.out.println("ligando para: "+ numero);
    }

    public void atender(){
        System.out.println("chamada atendida");
    }

    public void correioVoz(){
        System.out.println("correio voz");
    }

    //musica
    public void tocar(){
        System.out.println("tocando: "+ musica);
    }

    public void pausar(){
        System.out.println("musica pausada");
    }

    public void selecionarMusica(String music){
        musica = music;
        tocar();
    }

    //web
    public void exibirPagina(){
        System.out.println(pagina);
    }

    public void adicionarNovaAba(String site){
        pagina = site;
    }

    public void atualizarPagina(){
        System.out.println("reloading...");
    }
}
