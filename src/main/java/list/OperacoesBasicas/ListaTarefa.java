package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int objterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de Tarefas é de:" +listaTarefa.objterNumeroTotalTarefas() );

        listaTarefa.adicionarTarefa("tarefa1");
        listaTarefa.adicionarTarefa("tarefa2");
        listaTarefa.adicionarTarefa("tarefa3");

        System.out.println("O numero total de Tarefas é de:" +listaTarefa.objterNumeroTotalTarefas() );

        listaTarefa.removerTarefa("tarefa1");
        System.out.println("O numero total de Tarefas é de:" +listaTarefa.objterNumeroTotalTarefas() );

        listaTarefa.obterDescricoesTarefas();
        System.out.println("O numero total de Tarefas é de:" +listaTarefa.objterNumeroTotalTarefas() );
    }
}
