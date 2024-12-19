package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> protudoSet;

    public CadastroProdutos() {
        this.protudoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quantidade){
        protudoSet.add(new Produto(nome,cod,preco,quantidade));

    }
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(protudoSet);
        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPreco .addAll(protudoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("alface", 1212,3.14,2);
        cadastroProdutos.adicionarProduto("tomate", 1234,6.12,8);
        cadastroProdutos.adicionarProduto("cebola", 1232,4.16,9);
        cadastroProdutos.adicionarProduto("batata", 1243,5,5);



        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }


}
