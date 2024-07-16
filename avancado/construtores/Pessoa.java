package avancado.construtores;

public class Pessoa {
    String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }
}
