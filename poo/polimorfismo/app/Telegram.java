package poo.polimorfismo.app;

public class Telegram extends ServicoMsg {
    @Override
    public void enviarMsg(){
        validarConexao();
        System.out.println("mensagem enviada pelo telegram");
    }

    @Override
    public void receberMsg(){
        System.out.println("mensagem recebida no telegram");
    }
}
