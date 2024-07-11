package sintaxeBasica.televisao;

public class Tv {
    boolean ligada=false;
    int canal=1, volume=10;

    // construtor
/*    public Tv() {
//        this.volume = -1;
//        this.ligada = false;
//        this.canal = 0;
      }*/

    public void ligar(){
        if (!ligada){
            ligada = true;
            System.out.println("tv ligada");
        }else {
            System.out.println("a tv já está ligada");
        }
    }

    public void desligar(){
        if (ligada){
            ligada = false;
            System.out.println("tv desligada");
        }else {
            System.out.println("a tv já está desligada");
        }
    }

    public void subirVolume(){
        volume++;
        System.out.println("volume: "+ volume);
    }

    public void descerVolume(){
        if (volume <= 0){
            System.out.println("volume inválido");
        }else {
            volume--;
            System.out.println("volume: "+ volume);
        }
    }

    public void subirCanal(){
        canal++;
        System.out.println("canal: "+ canal);
    }

    public void mudarCanal(int channel){
        if (channel > 0) {
            canal = channel;
            System.out.println("canal: "+ canal);
        }else {
            System.out.println("canal inválido");
        }
    }
}
