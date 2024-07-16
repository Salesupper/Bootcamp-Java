package poo.heranca;

public class ServicoMensagem {
    public void enviarMsg() {
        validarConexao();
        System.out.println("mensagem enviada");
        salvarHistoricoMsg();
    }

    public void receberMsg() {
        System.out.println("mensagem recebida");
    }

    private void validarConexao() {
        System.out.println("validando conexão");
    }

    private void salvarHistoricoMsg(){
        System.out.println("salvando histórico");
    }
}
