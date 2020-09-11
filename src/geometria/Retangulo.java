package geometria;

import java.text.MessageFormat;

public class Retangulo extends Forma{
    protected double base, altura;

    public Retangulo(){
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(String cor, boolean preenchido, double base, double altura) {
        super(cor, preenchido);
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double base, double altura, String cor, boolean preenchido) {
        super(cor, preenchido);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return this.base * this.altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (this.base + this.altura);
    }

    @Override
    public String toString() {
        String retorno = "*Retangulo [base={0}, altura={1}, cor={2}, preenchido={3}]*";
        Object[] args = {this.base, this.altura, this.cor, this.preenchido};
        return new MessageFormat(retorno).format(args);
    }
}