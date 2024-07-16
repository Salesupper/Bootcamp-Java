package avancado.construtores;

public class Sistema {
    public static void main(String[] args) {
        Pessoa rafa = new Pessoa("Rafael","22-12");

        String name = rafa.nome;
        String cpf = rafa.getCpf();

        rafa.setEndereco("rua 15 de setembro");
        String rua = rafa.getEndereco();

        System.out.println(name +" mora na "+rua+" e seu cpf é "+cpf);
    }
}
