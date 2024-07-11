package sintaxeBasica.televisao;

public class Usuario {
    public static void main(String[] args) {
        Tv tv = new Tv();

        System.out.println(tv.canal);
        System.out.println(tv.ligada);
        System.out.println(tv.volume);

        tv.ligar();
        tv.ligar();
        tv.mudarCanal(5);
        tv.subirCanal();
        tv.descerVolume();
        tv.subirVolume();
    }
}