package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumeros(int numero){
        this.listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : listaNumeros)
            soma += numero;
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        for (Integer numero : listaNumeros)
            if (numero > maior) {
                maior = numero;
            }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;
        for (Integer numero : listaNumeros)
            if (numero < menor) {
                menor = numero;
            }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(this.listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumeros(2);
        somaNumeros.adicionarNumeros(4);
        somaNumeros.adicionarNumeros(14);
        somaNumeros.adicionarNumeros(12);
        somaNumeros.adicionarNumeros(-4);
        somaNumeros.adicionarNumeros(3);

        System.out.println("Numeros Adicionados:");
        somaNumeros.exibirNumeros();

        System.out.println("a soma dos numeros é" + somaNumeros.calcularSoma());

        System.out.println("o numero maior da lista é:" + somaNumeros.encontrarMaiorNumero());

        System.out.println("o numero menor encontrado na lista é de:" + somaNumeros.encontrarMenorNumero());
    }
}
