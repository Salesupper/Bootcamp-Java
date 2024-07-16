package avancado.enumJava;

public class Ibge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getNome()+" "+e.getSigla());
        }
        System.out.println();
        EstadoBrasileiro eb = EstadoBrasileiro.BAHIA;
        System.out.println(eb.getNomeMaiusculo());

    }
}
