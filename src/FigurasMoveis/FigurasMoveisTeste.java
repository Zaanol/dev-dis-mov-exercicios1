package FigurasMoveis;

/**
 * Classe para movimentação de formas
 *
 * @author willian.zanol
 * Data: 10/09/2020
 */
public class FigurasMoveisTeste {
    public static void main(String[] args) {
        if(args.length >= 6){
            try{
                String forma = args[0];
                if(!forma.equalsIgnoreCase("c")
                        && !forma.equalsIgnoreCase("r"))
                            throw new Exception("Erro: O primeiro parâmetro deve ser 'c' ou 'r'.");

                if(forma.equalsIgnoreCase("c")){
                    if(args.length != 6) throw new Exception("Erro: A forma selecionada foi C porém não possui os 5 valores esperados.");
                    int raio = Integer.parseInt(args[1]);
                    int x = Integer.parseInt(args[2]);
                    int y = Integer.parseInt(args[3]);
                    int velX = Integer.parseInt(args[4]);
                    int velY = Integer.parseInt(args[5]);

                    CirculoMovel circulo = new CirculoMovel(x, y, velX, velY, raio);
                    System.out.println(circulo);

                    circulo.moverParaCima();
                    circulo.moverParaDireita();
                    circulo.moverParaBaixo();
                    circulo.moverParaEsquerda();

                }

                if(forma.equalsIgnoreCase("r")){
                    if(args.length != 7) throw new Exception("Erro: A forma selecionada foi R porém não possui os 6 valores esperados.");
                    int x1 = Integer.parseInt(args[1]);
                    int y1 = Integer.parseInt(args[2]);
                    int x2 = Integer.parseInt(args[3]);
                    int y2 = Integer.parseInt(args[4]);
                    int velX = Integer.parseInt(args[5]);
                    int velY = Integer.parseInt(args[6]);

                    RetanguloMovel retangulo = new RetanguloMovel(x1, y1, x2, y2, velX, velY);
                    System.out.println(retangulo);

                    retangulo.moverParaCima();
                    retangulo.moverParaDireita();
                    retangulo.moverParaBaixo();
                    retangulo.moverParaEsquerda();
                }
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }else{
            System.err.println("ERRO - Ausência ou quantidade incorreta de parâmetros");
        }
    }
}
