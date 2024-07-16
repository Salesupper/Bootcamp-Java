package poo.polimorfismo.app;

public abstract class ServicoMsg {
    // metodos abstratos
    public abstract void enviarMsg();
    public abstract void receberMsg();

    //protected
    protected void validarConexao(){
        System.out.println("validando conexão...");
    }
}
