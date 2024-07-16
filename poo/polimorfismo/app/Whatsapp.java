package poo.polimorfismo.app;

public class Whatsapp extends ServicoMsg {
    @Override
    public void enviarMsg(){
        validarConexao();
        System.out.println("mensagem enviada pelo whatsapp");
    }

    @Override
    public void receberMsg(){
        System.out.println("mensagem recebida no whatsapp");
    }
}
