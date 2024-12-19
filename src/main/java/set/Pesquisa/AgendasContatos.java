package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendasContatos {
    private Set<Contato> contatoSet;

    public AgendasContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome,int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatoSet){
            if (contato.getNome().startsWith(nome)){
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet){
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setTelefone(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendasContatos agendasContatos = new AgendasContatos();

        agendasContatos.adicionarContato("Ariel", 1111974250);
        agendasContatos.adicionarContato("Jamielly", 1110090823);
        agendasContatos.adicionarContato("Julha", 111192342);
        agendasContatos.adicionarContato("Rafael", 1111956787);

        agendasContatos.exibirContatos();
        System.out.println(agendasContatos.pesquisaPorNome("Julha"));
        agendasContatos.exibirContatos();
        agendasContatos.atualizarNumeroContato("Rafael",123);
        agendasContatos.exibirContatos();

    }

}
