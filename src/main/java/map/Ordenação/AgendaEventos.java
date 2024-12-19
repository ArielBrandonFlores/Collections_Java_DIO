package main.java.map.Ordenação;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate,Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap =new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome,atracao);
        eventoMap.put(data,evento);
    }
    public void exibirAgenda(){
        Map<LocalDate,Evento> eventoTreeMapMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMapMap);
    }
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate,Evento> eventoTreeMapMap = new TreeMap<>(eventoMap);
    for (Map.Entry<LocalDate, Evento>entry : eventoTreeMapMap.entrySet()){
        if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
            System.out.println("O próximo evento: " +entry.getValue()+"acontecera na data: "+ entry.getKey());
            break;
        }
    }

}

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2020, Month.DECEMBER,12), "aaa", "a");
        agendaEventos.adicionarEvento(LocalDate.of(2022,Month.JULY,12), "bbb", "b");
        agendaEventos.adicionarEvento(LocalDate.of(2023,Month.JUNE,12), "ccc", "c");
        agendaEventos.adicionarEvento(LocalDate.of(2024,Month.JANUARY,12), "ddd", "d");
        agendaEventos.adicionarEvento(LocalDate.of(2025,Month.SEPTEMBER,12), "eee", "e");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }




}
