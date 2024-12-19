package main.java.set.Pesquisa;

import java.security.PrivateKey;
import java.util.Formattable;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefaSet;

    public ListaTarefas() {
        this.listaTarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefaSet.add(new Tarefa(descricao));
    }

    public void tarefaParaRemover(String descricao){
        Tarefa tarefaRemover =  null;
        for (Tarefa tarefa: listaTarefaSet){
            if (tarefa.getDescrição().equalsIgnoreCase(descricao));
            tarefaRemover = tarefa;
            break;
        }
        listaTarefaSet.remove(tarefaRemover);
    }

    public void exibirTarefa(){
        System.out.println(listaTarefaSet);
    }

    public int contarTarefas(){
        return listaTarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidade(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa: listaTarefaSet){
            if (tarefa.isTarefaConcluida()){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPèndentes(){
        Set<Tarefa> tarefaPendente = new HashSet<>();
        for (Tarefa tarefa : listaTarefaSet){
            if (!tarefa.isTarefaConcluida()){
                tarefaPendente.add(tarefa);
            }
        }
        return tarefaPendente;
    }
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefa : listaTarefaSet){
            if (tarefa.getDescrição().equalsIgnoreCase(descricao)){
                tarefa.setTarefaConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : listaTarefaSet) {
            if (t.getDescrição().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isTarefaConcluida()) {
                tarefaParaMarcarComoPendente.setTarefaConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefa(){
        if (listaTarefaSet.isEmpty()){
            System.out.println("Está vazia lista de tarefas");
        }else {
            listaTarefaSet.clear();
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefa();

        // Removendo uma tarefa
        listaTarefas.tarefaParaRemover("Fazer exercícios físicos");
        listaTarefas.exibirTarefa();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPèndentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidade());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefa();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefa();
        listaTarefas.exibirTarefa();
    }
}



