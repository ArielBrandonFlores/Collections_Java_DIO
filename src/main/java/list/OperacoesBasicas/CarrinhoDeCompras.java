package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Itens> comprasCarrinho;

    public CarrinhoDeCompras(){
        this.comprasCarrinho = new ArrayList<>();
    }

    public void adicionarIten(String nome, double preco, int quantidade){
        comprasCarrinho.add(new Itens(nome, preco, quantidade));
    }

    public void removerItens(String nome){
        List<Itens> itensParaRemover = new ArrayList<>();
        for (Itens Item : comprasCarrinho){
            if (Item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(Item);
            }
        }
        comprasCarrinho.removeAll(itensParaRemover);
    }

    public double calcularTotal() {
        double total = 0;
        for (Itens item : comprasCarrinho) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }
    public void exibirCarrinho() {
        for (Itens item : comprasCarrinho) {
            System.out.println(item);
        }
    }
        public static void main(String[] args) {
            CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
            carrinho.adicionarIten("Banana", 2.5, 3);
            carrinho.adicionarIten("Maçã", 4.0, 5);
            carrinho.adicionarIten("Laranja", 3.0, 6);

            System.out.println("Carrinho antes da remoção:");
            carrinho.exibirCarrinho();

            // Calculando o total antes de remover itens
            double totalAntes = carrinho.calcularTotal();
            System.out.println("\nTotal do carrinho: R$ " + totalAntes);

            // Remover todas as "Bananas"
            carrinho.removerItens("Banana");

            System.out.println("\nCarrinho após remoção:");
            carrinho.exibirCarrinho();

            // Calculando o total após remover itens
            double totalDepois = carrinho.calcularTotal();
            System.out.println("\nTotal do carrinho após remoção: R$ " + totalDepois);
        }

}
