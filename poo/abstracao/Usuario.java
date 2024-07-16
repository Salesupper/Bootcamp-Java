package poo.abstracao;

public class Usuario {
    public static void main(String[] args) {
        Whatsapp zap = new Whatsapp();
        Telegram tlg = new Telegram();

        zap.enviarMsg();
        zap.receberMsg();

        tlg.enviarMsg();
        tlg.receberMsg();
    }
}
