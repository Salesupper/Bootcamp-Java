package poo.interfaceJava.multi;

import poo.interfaceJava.copiadora.Copiadora;
import poo.interfaceJava.impressora.Impressora;
import poo.interfaceJava.digitalizadora.Digitalizadora;

public class Multifuncional implements Copiadora,Impressora,Digitalizadora{
    @Override
    public void copiar() {
        System.out.println("copiando multi");
    }

    @Override
    public void imprimir(){
        System.out.println("imprimindo multi");

    }

    @Override
    public void digitalizar() {
        System.out.println("digitalizando multi");
    }
}
