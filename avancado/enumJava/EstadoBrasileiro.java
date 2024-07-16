package avancado.enumJava;

/*Em Java, o enum é utilizado para definir um conjunto
fixo de constantes. Ele é útil para representar valores que não mudam,
como dias da semana, meses do ano, estados de um semáforo, etc. Usando enum,
o código se torna mais legível e seguro, pois limita os valores possíveis e evita erros com valores inválidos.
Além disso, enum pode ter métodos, construtores e atributos, oferecendo funcionalidades adicionais.*/

public enum EstadoBrasileiro {
    SAO_PAULO("SP","São Paulo"),
    RIO_JANEIRO("RJ","Rio de Janeiro"),
    PIAUI("PI","Piaui"),
    MARANHAO("MA","Maranhão"),
    BAHIA("BA","Bahia");

    private String sigla;
    private String nome;

    private EstadoBrasileiro(String sigla,String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
