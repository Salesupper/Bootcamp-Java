package avancado.get_set;

public class Escola {
    public static void main(String[] args) {
        Aluno a = new Aluno();

        a.setNome("Roberval");
        a.setIdade(17);

        String name = a.getNome();
        int age = a.getIdade();
        System.out.println(name+" "+age);
    }
}
