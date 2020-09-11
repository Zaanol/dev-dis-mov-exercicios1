package cartas;

/**
 * Classe para utilização de classe de geometria, com cálculos e validações
 *
 * @author willian.zanol
 * Data: 10/09/2020
 */
public class CartasTeste {
    public static void main(String[] args) {
        try{
            Baralho baralho = new Baralho();
            baralho.embaralhar();
            baralho.distribuir();
            baralho.distribuir();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
