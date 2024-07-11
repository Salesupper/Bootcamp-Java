package sintaxeBasica;

public class OperadorTernario {
    public static void main(String[] args) {
        int a,b,nota;
        a = 5;
        b = 6;
        nota = 6;

        /*if (a == b){
            resultado = true;
        }else {
            resultado = false;
        }*/

        /*operador ternario simplifica o código
        mas so funciona quando o resultado é true ou false */

        String resultado = a==b ? "verdadeiro" : "falso";
        int result = a==b ? 1 : 0;

        // if,else if e else em um só
        var media = nota >= 7 ? "aprovado" : nota >= 5 && nota < 7 ? "recuperação" : "reprovado";

        System.out.println(media);
        System.out.println(resultado);
        System.out.println(result);
    }
}
