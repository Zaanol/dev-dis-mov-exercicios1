package geometria;

import java.text.MessageFormat;

public class Quadrado extends Retangulo {
    protected double lado;

    public Quadrado(){
    }

    public Quadrado(double lado) {
        super(lado, lado);
        this.lado = lado;
    }

    public Quadrado(double lado, String cor, boolean preenchido) {
        super(lado, lado, cor, preenchido);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        String retorno = "*Quadrado [lado={0}, cor={1}, preenchido={2}]*";
        Object[] args = {this.lado, this.cor, this.preenchido};
        return new MessageFormat(retorno).format(args);
    }
}