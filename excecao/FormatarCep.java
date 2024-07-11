package excecao;

public class FormatarCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("8376526");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcecao e) {
            System.out.println("o cep não tem 8 digitos");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoExcecao {
        if (cep.length() != 8)
            throw new CepInvalidoExcecao();

        return "83.765-267";
    }
}