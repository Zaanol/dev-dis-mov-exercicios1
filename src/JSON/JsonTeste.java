package JSON;

import fatura.Fatura;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para importar arquivo JSON e calcular preço das faturas
 *
 * @author willian.zanol
 * Data: 10/09/2020
 */
public class JsonTeste {
    public static void main(String[] args) {
        try{
            if(args.length == 1){
                JSONParser parser = new JSONParser();
                JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(args[0]));
                JSONArray jsonArray = (JSONArray) jsonObject.get("faturas");
                List<Fatura> faturas = new ArrayList<>();

                for(int i = 0; i < jsonArray.size(); i++){
                    Fatura fatura = new Fatura();
                    JSONObject json = (JSONObject) jsonArray.get(i);
                    fatura.setCodFatura(json.get("codigo").toString());
                    fatura.setDescFatura(json.get("descricao").toString());
                    fatura.setQtdComprada(Integer.parseInt(json.get("quantidade").toString()));
                    fatura.setPreco(Double.parseDouble(json.get("preco").toString()));

                    faturas.add(fatura);
                }

                double totalFaturas = faturas.stream().mapToDouble(Fatura::getPreco).sum();
                System.out.println("Total das faturas: R$ " + totalFaturas + " (" + faturas.size() + " faturas)");
            }else{
                System.err.println("ERRO - Ausência ou quantidade incorreta de parâmetros");
            }
        }catch (Exception e){
            System.err.println("Erro ao importar/ler arquivo JSON.");
        }
    }
}