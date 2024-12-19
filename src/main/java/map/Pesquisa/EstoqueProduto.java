package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod,String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto produto : estoqueProdutosMap.values()){
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisC(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto produto: estoqueProdutosMap.values()){
            if (produto.getPreco() > maiorPreco){
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }
        return  produtoMaisCaro;
    }

    public Produto obterProdutoMenorPreco(){
        Produto produtoMenorPreco = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto produto: estoqueProdutosMap.values()){
            if (produto.getPreco() < menorPreco){
                menorPreco = produto.getPreco();
                produtoMenorPreco = produto;
            }
        }
        return  produtoMenorPreco;
    }

    public double obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        int maiorQuantidade = 0;
        double valorTotalEstoque = 0;
        for (Produto produto : estoqueProdutosMap.values()){
            if (produto.getQuantidade() > maiorQuantidade){
                maiorQuantidade = produto.getQuantidade();
                valorTotalEstoque = maiorQuantidade * produto.getPreco();

            }
        }
        return valorTotalEstoque;
    }


    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.adicionarProduto(11,"aa",3,13.4);
        estoqueProduto.adicionarProduto(10,"bb",7,1.4);
        estoqueProduto.adicionarProduto(12,"cc",4,5.4);
        estoqueProduto.adicionarProduto(14,"dd",1,7.4);
        estoqueProduto.adicionarProduto(15,"ee",8,8.4);

        estoqueProduto.exibirProduto();
        System.out.println("O Produto mais caro é: " + estoqueProduto.obterProdutoMaisC());
        System.out.println("O valor total do estoque é:" + estoqueProduto.calcularValorTotalEstoque());
        System.out.println("O Produto de Menor Preço é: " + estoqueProduto.obterProdutoMenorPreco());
        System.out.println("O Produto de maior quantidade e valor total: " + estoqueProduto.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
