package geometria;

import java.text.MessageFormat;

public class Circulo extends Forma{
    protected double raio;

    public Circulo(){
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio, String cor, boolean preenchido) {
        super(cor, preenchido);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(this.raio, 2));
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        String retorno = "*Círculo [raio={0}, cor={1}, preenchido={2}]*";
        Object[] args = {this.raio, this.cor, this.preenchido};
        return new MessageFormat(retorno).format(args);
    }
}