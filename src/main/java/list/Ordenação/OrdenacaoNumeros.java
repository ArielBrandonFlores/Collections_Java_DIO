package main.java.list.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicinoarNumeros(int numero) {
        this.listaNumeros.add(numero);
    }

    public void ondenarAscendente() {
        List<Integer> numeroAscendete = new ArrayList<>(this.listaNumeros);
        Collections.sort(numeroAscendete);
        System.out.println("Lista ordenada de forma ascendente:" + numeroAscendete);

    }

    public void ondenardescendente() {
        List<Integer> numerodescendete = new ArrayList<>(this.listaNumeros);
        Collections.sort(numerodescendete, Collections.reverseOrder());
        System.out.println("Lista ordenada de forma descendente:" + numerodescendete);
    }

    public void exibirNumeors(){
        System.out.println(this.listaNumeros);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicinoarNumeros(4);
        ordenacaoNumeros.adicinoarNumeros(2);
        ordenacaoNumeros.adicinoarNumeros(6);
        ordenacaoNumeros.adicinoarNumeros(1);
        ordenacaoNumeros.adicinoarNumeros(9);
        ordenacaoNumeros.adicinoarNumeros(-12);

        ordenacaoNumeros.exibirNumeors();
        ordenacaoNumeros.ondenarAscendente();
        ordenacaoNumeros.ondenardescendente();
    }
}