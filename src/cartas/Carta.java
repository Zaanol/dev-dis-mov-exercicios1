package cartas;

public class Carta {
    private String naipe, valor;

    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor.substring(0, 1).toUpperCase() + valor.substring(1).toLowerCase()
                + " de " + naipe.substring(0, 1).toUpperCase() + naipe.substring(1).toLowerCase();
    }
}