package geometria;

/**
 * Classe para utilização de classe de geometria, com cálculos e validações
 *
 * @author willian.zanol
 * Data: 10/09/2020
 */
public class GeometriaTeste {
    public static void main(String[] args) {
        if(args.length == 4){
            try{
                double raioCirculo = Double.parseDouble(args[0]);
                double baseRetangulo = Double.parseDouble(args[1]);
                double alturaRetangulo = Double.parseDouble(args[2]);
                double ladoQuadrado = Double.parseDouble(args[3]);

                Circulo circulo = new Circulo(raioCirculo);
                Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);
                Quadrado quadrado = new Quadrado(ladoQuadrado);

                System.out.println("Testes realizados\n");
                System.out.println("Área Círculo: " + circulo.getArea());
                System.out.println("Perímetro Círculo: " + circulo.getPerimetro());

                System.out.println("Área Retângulo: " + retangulo.getArea());
                System.out.println("Perímetro Retângulo: " + retangulo.getPerimetro());

                System.out.println("Área Quadrado: " + quadrado.getArea());
                System.out.println("Perímetro Quadrado: " + quadrado.getPerimetro());
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }else{
            System.err.println("ERRO - Ausência ou quantidade incorreta de parâmetros");
        }
    }
}
