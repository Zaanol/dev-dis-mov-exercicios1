package populacaomundial;

/**
 * Classe para determinar a quantidade aproximada da população
 * mundial do ano informado como parâmetro
 *
 * @author willian.zanol
 * Data: 24/08/2020
 */
public class PopulacaoMundial {
    public static void main(String[] args) {
        if(args.length == 1){
            try{
                System.out.println(52735305L * Long.parseLong(args[0]) + 7807202375L);
            }catch (Exception e){
                System.err.println("ERRO - Falha na conversão de valores e cálculos");
            }
        }else{
            System.err.println("ERRO - Ausência ou quantidade incorreta de parâmetros");
        }
    }
}