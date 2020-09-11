package FigurasMoveis;

import java.text.MessageFormat;

public class CirculoMovel implements Movel {
    private int raio;
    private PontoMovel centro;

    public CirculoMovel(int x, int y, int velX, int velY, int raio) {
        this.centro = new PontoMovel(x, y, velX, velY);
        this.raio = raio;
    }

    @Override
    public String toString() {
        String retorno = "CírculoMovel[raio={0}, {1}";
        Object[] args = {this.raio, this.centro};
        return new MessageFormat(retorno).format(args);
    }

    @Override
    public void moverParaCima() {
        this.centro.moverParaCima();
        System.out.println("\nMovendo para cima\n" + this);
    }

    @Override
    public void moverParaBaixo() {
        this.centro.moverParaBaixo();
        System.out.println("\nMovendo para baixo\n" + this);
    }

    @Override
    public void moverParaEsquerda() {
        this.centro.moverParaEsquerda();
        System.out.println("\nMovendo para esquerda\n" + this);
    }

    @Override
    public void moverParaDireita() {
        this.centro.moverParaDireita();
        System.out.println("\nMovendo para direita\n" + this);
    }
}