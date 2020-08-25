package calculapi;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Classe para calcular o PI de acordo com maior denominador passado
 * como parâmetro e verifica a porcentagem de acerto de acordo com o PI real
 *
 * @author willian.zanol
 * Data: 24/08/2020
 */
public class CalculaPI {
    public static void main(String[] args) {
        if(args.length == 1){
            try{
                Double piCalculado = calculaPI(Integer.parseInt(args[0]));

                System.out.println("O valor de pi é: " + piCalculado);
                System.out.println("Erro: " + verificaAcerto(piCalculado)  + "%");
            }catch (Exception e){
                System.err.println("ERRO - Falha na conversão de valores e cálculos");
            }
        }else{
            System.err.println("ERRO - Ausência ou quantidade incorreta de parâmetros");
        }
    }

    private static Double calculaPI(int maiorDenominador){
        double pi = 1.00;
        double divisor = 1.00;

        boolean menos = true;
        for(int i = 3; i < maiorDenominador; i++){
            if(i % 2 == 0) continue;

            pi = (menos) ? pi - (divisor / i) : pi + (divisor / i);
            menos = !menos;
        }

        return 4 * pi;
    }

    private static double verificaAcerto(Double piCalculado){
        double erro = (piCalculado * 100.00 / Math.PI) - 100.00;
        erro = (erro > 0 ? erro : erro * -1);

        return new BigDecimal(erro).setScale(6, RoundingMode.HALF_EVEN).doubleValue();
    }
}