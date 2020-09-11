package FigurasMoveis;

import java.text.MessageFormat;

public class PontoMovel implements Movel{
    private int x, y, velX, velY;

    public PontoMovel(int x, int y, int velX, int velY) {
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
    }

    @Override
    public String toString() {
        String retorno = "PontoMovel[x={0}, y={1}, velX={2}, velY={3}]";
        Object[] args = {this.x, this.y, this.velX, this.velY};
        return new MessageFormat(retorno).format(args);
    }

    @Override
    public void moverParaCima() {
        this.y += velY;
    }

    @Override
    public void moverParaBaixo() {
        this.y -= velY;
    }

    @Override
    public void moverParaEsquerda() {
        this.x -= velX;
    }

    @Override
    public void moverParaDireita() {
        this.x += velX;
    }
}