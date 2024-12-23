package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos>{
    //atributos
    private String nome;
    private Long matricula;
    private double media;

    public Alunos(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos aluno)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public int compareTo(Alunos aluno) {
        return nome.compareTo(aluno.getNome());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}

class ComparatorNota implements Comparator<Alunos> {
    @Override
    public int compare(Alunos o1, Alunos o2) {
        return Double.compare(o1.getMedia(), o2.getMedia());
    }
}