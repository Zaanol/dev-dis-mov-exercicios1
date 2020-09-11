package cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    List<Carta> monte = new ArrayList<>();
    private int cartaAtual;
    private int TOTAL_DE_CARTAS = 52;
    private String[] VALORES = {"Ás", "Dois", "Três", "Quatro", "Cinco",
            "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
    private String[] NAIPES = {"Paus", "Ouros", "Copas", "Espadas"};

    public Baralho() {
        for(String valor : VALORES){
            for(String naipe : NAIPES){
                monte.add(new Carta(naipe, valor));
            }
        }
    }

    public void embaralhar() throws Exception {
        System.out.println("\nEmbaralhando o monte!\n");
        if(monte.size() == 0) throw new Exception("Erro: Não existe cartas no baralho.");

        Collections.shuffle(monte);
        cartaAtual = 0;
    }

    public void distribuir() throws Exception {
        if(cartaAtual > monte.size()) throw new Exception("Nenhuma carta no baralho! Fim de jogo!");
        System.out.println("Distribuindo " + monte.get(cartaAtual));

        cartaAtual++;
    }
}