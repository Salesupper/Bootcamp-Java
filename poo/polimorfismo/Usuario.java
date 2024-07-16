package poo.polimorfismo;

import poo.polimorfismo.app.ServicoMsg;
import poo.polimorfismo.app.Telegram;
import poo.polimorfismo.app.Whatsapp;

public class Usuario {
    public static void main(String[] args) {
        ServicoMsg sm = null;
        String appSelecionado = "zap";

        if(appSelecionado.equals("zap"))
            sm = new Whatsapp();
        else if (appSelecionado.equals("tlg"))
            sm = new Telegram();

        sm.enviarMsg();
        sm.receberMsg();
    }
}
