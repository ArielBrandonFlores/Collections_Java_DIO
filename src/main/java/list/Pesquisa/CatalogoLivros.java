package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("1984", "George Orwell", 1949);
        catalogo.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
        catalogo.adicionarLivro("O Caminho para Wigan Pier", "George Orwell", 1937);
        catalogo.adicionarLivro("Na Pior em Paris e Londres", "George Orwell", 1933);
        catalogo.adicionarLivro("A Filha do Reverendo", "George Orwell", 1935);
        catalogo.adicionarLivro("Mantenha o Sistema", "George Orwell", 1936);
        catalogo.adicionarLivro("Um Pouco de Ar, Por Favor!", "George Orwell", 1939);
        catalogo.adicionarLivro("Como Morrem os Pobres e Outros Ensaios", "George Orwell", 1950);

        // Adicionando livros de outros autores
        catalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
        catalogo.adicionarLivro("O Alquimista", "Paulo Coelho", 1988);
        catalogo.adicionarLivro("A Moreninha", "Joaquim Manuel de Macedo", 1844);
        catalogo.adicionarLivro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        catalogo.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);

        // Testando pesquisa por autor
        System.out.println(catalogo.pesquisaPorAutor("George Orwell"));

        // Testando pesquisa por intervalo de anos
        System.out.println(catalogo.pesquisaPorIntervaloAnos(1948 , 1950));

        // Testando pesquisa por título
        System.out.println(catalogo.pesquisarPorTitulo("O Pequeno Príncipe"));
    }
}

