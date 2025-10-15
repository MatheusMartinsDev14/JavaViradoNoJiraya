package Desafios.Logica.Atividade4;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {
    private List<String> tarefas = new ArrayList<>();

    public void adicionarTarefa(String tarefa) {
        if (tarefa == null || tarefa.trim().isEmpty()) {
            System.out.println("A tarefa não pode ser vazia.");
            return;
        }
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        System.out.println("Lista de Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + " - " + tarefas.get(i));
        }
    }

    public void removerTarefa(String tarefa) {
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas para remover.");
            return;
        }
        if (tarefas.remove(tarefa)) {
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void buscarTarefa(String palavraChave) {
        if (palavraChave == null || palavraChave.trim().isEmpty()) {
            System.out.println("Digite algo para buscar.");
            return;
        }
        if (tarefas.isEmpty()) {
            System.out.println("Não há tarefas cadastradas para buscar.");
            return;
        }

        System.out.println("🔎 Resultados da busca:");
        boolean encontrou = false;

        for (String tarefa : tarefas) {
            if (tarefa.toLowerCase().contains(palavraChave.toLowerCase())) {
                System.out.println("• " + tarefa);
                encontrou = true;
            }
    }
        if (!encontrou) {
            System.out.println("Nenhuma tarefa encontrada com essa palavra-chave.");
        }
}
}


