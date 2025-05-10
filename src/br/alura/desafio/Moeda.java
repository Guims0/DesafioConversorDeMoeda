package br.alura.desafio;

import java.util.Map;


public class Moeda {
    private Map< String , Double> conversion_rates;
    private String base_code;
    private String palavraChave;


    public String getPalavraChave() {
        return palavraChave;
    }

    public String getBase_code() {
        return base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }


}
