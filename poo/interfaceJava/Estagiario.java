package poo.interfaceJava;

import poo.interfaceJava.copiadora.Xerox;
import poo.interfaceJava.digitalizadora.Digitalizadora;
import poo.interfaceJava.digitalizadora.Scaner;
import poo.interfaceJava.impressora.Impressora;
import poo.interfaceJava.impressora.Laserjet;
import poo.interfaceJava.multi.Multifuncional;

public class Estagiario {
    public static void main(String[] args) {
        Xerox x = new Xerox();
        Multifuncional m = new Multifuncional();
        Digitalizadora s = new Scaner();

        x.copiar();
        s.digitalizar();
        System.out.println("");
        m.imprimir();
        m.digitalizar();
        m.copiar();

    }
}
