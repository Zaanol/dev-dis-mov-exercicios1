package FigurasMoveis;

import java.text.MessageFormat;

public class RetanguloMovel implements Movel {
    private PontoMovel superiorEsquerda, inferiorDireita;

    public RetanguloMovel(int x1, int y1,int x2, int y2, int velX, int velY) {
        this.superiorEsquerda = new PontoMovel(x1, y1, velX, velY);
        this.inferiorDireita = new PontoMovel(x2, y2, velX, velY);
    }

    @Override
    public String toString() {
        String retorno = "RetânguloMovel[SuperiorEsquerda={0}, InferiorDireita{1}";
        Object[] args = {this.superiorEsquerda, this.inferiorDireita};
        return new MessageFormat(retorno).format(args);
    }

    @Override
    public void moverParaCima() {
        this.superiorEsquerda.moverParaCima();
        this.inferiorDireita.moverParaCima();
        System.out.println("\nMovendo para cima\n" + this);
    }

    @Override
    public void moverParaBaixo() {
        this.superiorEsquerda.moverParaBaixo();
        this.inferiorDireita.moverParaBaixo();
        System.out.println("\nMovendo para baixo\n" + this);
    }

    @Override
    public void moverParaEsquerda() {
        this.superiorEsquerda.moverParaEsquerda();
        this.inferiorDireita.moverParaEsquerda();
        System.out.println("\nMovendo para esquerda\n" + this);
    }

    @Override
    public void moverParaDireita() {
        this.superiorEsquerda.moverParaDireita();
        this.inferiorDireita.moverParaDireita();
        System.out.println("\nMovendo para direita\n" + this);
    }
}