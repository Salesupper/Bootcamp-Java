package poo.abstracao;

public class Telegram extends ServicoMensagem {

    @Override
    public void enviarMsg(){
        System.out.println("mensagem enviada pelo telegram");
    }

    @Override
    public void receberMsg(){
        System.out.println("mensagem recebida no telegram");
    }

}
