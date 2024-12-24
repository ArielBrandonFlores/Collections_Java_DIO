package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        contagemPalavrasMap.remove(palavra);
    }
    public void exibirContagemPalavras(){
        System.out.println(contagemPalavrasMap);
    }
    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Java",8);
        contagemPalavras.adicionarPalavra("Python",2);
        contagemPalavras.adicionarPalavra("JavaScript",6);
        contagemPalavras.adicionarPalavra("C#",10);
        contagemPalavras.exibirContagemPalavras();
        System.out.println(contagemPalavras.encontrarPalavrasMaisFrequente());
        contagemPalavras.removerPalavra("C#");
        contagemPalavras.exibirContagemPalavras();
        System.out.println(contagemPalavras.encontrarPalavrasMaisFrequente());
    }


}
