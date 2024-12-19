package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarCotato(String nome, int telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public  void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarCotato("Ariel",892266);
        agendaContatos.adicionarCotato("Jami",823713);
        agendaContatos.adicionarCotato("Erica",892436);
        agendaContatos.adicionarCotato("Julha",387456);
        agendaContatos.adicionarCotato("Miguel",8284676);
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Julha");
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Jami"));
    }

}
