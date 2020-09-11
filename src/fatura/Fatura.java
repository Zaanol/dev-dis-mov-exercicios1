package fatura;

public class Fatura {
    private String codFatura;
    private String descFatura;
    private int qtdComprada;
    private double preco;

    public Fatura() {
    }

    public Fatura(String codFatura, String descFatura, int qtdComprada, double preco) {
        this.codFatura = codFatura;
        this.descFatura = descFatura;
        this.qtdComprada = qtdComprada;
        this.preco = preco;
    }

    public String getCodFatura() {
        return codFatura;
    }

    public void setCodFatura(String codFatura) {
        this.codFatura = codFatura;
    }

    public String getDescFatura() {
        return descFatura;
    }

    public void setDescFatura(String descFatura) {
        this.descFatura = descFatura;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double totalFaturado() {
        return this.qtdComprada * this.preco;
    }

    @Override
    public String toString() {
        return "Código: " + this.codFatura +
                "\nDescrição: " + this.descFatura +
                "\nTotal: R$ " + totalFaturado();
    }
}
