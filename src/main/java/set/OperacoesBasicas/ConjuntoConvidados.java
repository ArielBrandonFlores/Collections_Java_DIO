package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidade(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadePorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadoSet){
            if (convidado.getCodigoConvite() == codigoConvite);
            convidadoParaRemover = convidado;
            break;
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidade("Ariel",12345);
        conjuntoConvidados.adicionarConvidade("Sarah",123213);
        conjuntoConvidados.adicionarConvidade("Jamielly",123321);
        conjuntoConvidados.adicionarConvidade("Erica",567123);
        conjuntoConvidados.adicionarConvidade("Miguel",567765);
        conjuntoConvidados.adicionarConvidade("Vitor",234432);
        conjuntoConvidados.adicionarConvidade("Rafael",890987);
        conjuntoConvidados.adicionarConvidade("Julha",567876);


        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadePorCodigoConvite(123213);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidados");


    }


}
