package retangulo;

import fatura.Fatura;

/**
 * Classe para utilização de classe de retângulo, com cálculos e validações
 *
 * @author willian.zanol
 * Data: 10/09/2020
 */
public class RetanguloTeste {
    public static void main(String[] args) {
        if(args.length == 2){
            try{
                float comprimento = Float.parseFloat(args[0]);
                float largura = Float.parseFloat(args[1]);

                System.out.println(new Retangulo(comprimento, largura));
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }else{
            System.err.println("ERRO - Ausência ou quantidade incorreta de parâmetros");
        }
    }
}
