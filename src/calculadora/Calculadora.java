package calculadora;

/**
 * Classe para calcular a soma, produto, diferença,
 * divisão e verificar qual é maior entre dois números
 *
 * @author willian.zanol
 * Data: 24/08/2020
 */
public class Calculadora {
    public static void main(String[] args) {
        if(args.length == 2){
            try{
                int a = Integer.parseInt(args[0]),
                    b = Integer.parseInt(args[1]);

                System.out.println("Soma: " + soma(a, b));
                System.out.println("Produto: " + produto(a, b));
                System.out.println("Diferença: " + diferenca(a, b));
                System.out.println("Divisão: " + divisao(a, b));
                System.out.println(verificarMaior(a, b));
            }catch (Exception e){
                System.err.println("ERRO - Falha na conversão de valores e cálculos");
            }
        }else{
            System.err.println("ERRO - Ausência ou quantidade incorreta de parâmetros");
        }
    }

    private static int soma(int a, int b){
        return a + b;
    }

    private static int produto(int a, int b){
        return a * b;
    }

    private static int diferenca(int a, int b){
        return a - b;
    }

    private static float divisao(int a, int b){
        return Float.valueOf(a) / b;
    }

    private static String verificarMaior(int a, int b){
        if(a == b) return "Esses números são iguais";
        int maior = (a >= b) ? a : b;
        return maior + " é maior";
    }
}