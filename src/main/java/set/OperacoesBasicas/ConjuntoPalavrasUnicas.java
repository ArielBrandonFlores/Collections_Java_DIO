package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        conjuntoPalavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (conjuntoPalavrasSet.contains(palavra)){
            conjuntoPalavrasSet.remove(palavra);
        }
    }
    public boolean verificarPalavra(String palavra){
        return conjuntoPalavrasSet.contains(palavra);
    }

    public  void exibirPalavras(){
        System.out.println(conjuntoPalavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("palavra");
        conjuntoPalavrasUnicas.adicionarPalavra("abacaxi");
        conjuntoPalavrasUnicas.adicionarPalavra("cabeça");
        conjuntoPalavrasUnicas.adicionarPalavra("olho");
        conjuntoPalavrasUnicas.adicionarPalavra("coluna");

        conjuntoPalavrasUnicas.exibirPalavras();
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("abacaxi"));
        conjuntoPalavrasUnicas.removerPalavra("olho");
        conjuntoPalavrasUnicas.exibirPalavras();
    }
}
