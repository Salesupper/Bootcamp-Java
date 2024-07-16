package poo.abstracao;

public class Whatsapp extends ServicoMensagem{

    @Override
    public void enviarMsg(){
        System.out.println("mensagem enviada pelo whatsapp");
    }

    @Override
    public void receberMsg(){
        System.out.println("mensagem recebida no whatsapp");
    }
}
