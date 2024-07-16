package poo.heranca;

public class Usuario {
    public static void main(String[] args) {
       Whatsapp wts = new Whatsapp();
       Telegram tlg = new Telegram();

       System.out.println("Whatsapp");
       wts.enviarMsg();
       wts.receberMsg();

       System.out.println("\nTelegram");
       tlg.enviarMsg();
       tlg.receberMsg();
    }
}
