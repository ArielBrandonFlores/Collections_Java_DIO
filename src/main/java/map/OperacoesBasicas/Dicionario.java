package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    public void  adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        dicionarioMap.remove(palavra);
    }
    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }
    public String pesquisarPorPalavra(String palavra){
        String chavePalavra = null;
        if (!dicionarioMap.isEmpty()){
            chavePalavra = dicionarioMap.get(palavra);
        }
        return chavePalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Fé","acreditar em algo");
        dicionario.adicionarPalavra("medo","temer algo");
        dicionario.adicionarPalavra("Felicidade","estar alegre");
        dicionario.adicionarPalavra("raiva","querer fazer o mal");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("raiva");
        dicionario.exibirPalavras();
        dicionario.pesquisarPorPalavra("Felicidade");
    }


}
