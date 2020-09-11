package retangulo;

public class Retangulo {
    private float comprimento = 1, largura = 1;

    public Retangulo() {
    }

    public Retangulo(float perimetro, float area) throws Exception {
        setComprimento(perimetro);
        setArea(area);
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws Exception {
        if(comprimento <= 0) throw new Exception("Erro: O perímetro é menor ou igual a zero.");
        this.comprimento = comprimento;
    }

    public float getArea() {
        return largura;
    }

    public void setArea(float area) throws Exception {
        if(area <= 0) throw new Exception("Erro: A área é menor ou igual a zero.");
        this.largura = area;
    }

    public float calculaPerimetro(){
        return (this.comprimento * 2) + (this.largura * 2);
    }

    public float calculaArea(){
        return (this.comprimento * this.largura);
    }

    @Override
    public String toString() {
        return "Área: " + calculaArea() +
                "\nPerímetro: " + calculaPerimetro();
    }
}