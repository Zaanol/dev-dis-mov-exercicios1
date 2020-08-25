package fatura;

/**
 * Classe para popular objeto Fatura e calcular o total da fatura
 *
 * @author willian.zanol
 * Data: 24/08/2020
 */
public class FaturaTeste {
    public static void main(String[] args) {
        if(args.length == 4){
            try{
                String codFatura = args[0];
                String descFatura = args[1];
                int qtdComprada = Integer.parseInt(args[2]);
                double preco = Double.parseDouble(args[3]);

                System.out.println(new Fatura(codFatura, descFatura, qtdComprada, preco));
            }catch (Exception e){
                System.err.println("ERRO - Falha na conversão de valores e cálculos");
            }
        }else{
            System.err.println("ERRO - Ausência ou quantidade incorreta de parâmetros");
        }
    }
}
