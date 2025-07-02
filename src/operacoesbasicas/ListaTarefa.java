package operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaLista;

    public ListaTarefa() {
        this.tarefaLista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaLista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaLista){
            if(t.getDescricao().equals(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaLista.removeAll(tarefasParaRemover);
    }

    public int obeterNumeroTotalTarefas() {
        return tarefaLista.size();
    }

    public void  obterDescricoesTarefas() {
        System.out.println(tarefaLista);
    }
    
    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();

        System.out.println(lista.obeterNumeroTotalTarefas());

        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        lista.adicionarTarefa("Tarefa 3");
        System.out.println(lista.obeterNumeroTotalTarefas());
        lista.removerTarefa("Tarefa 2");
        System.out.println(lista.obeterNumeroTotalTarefas());

        lista.obterDescricoesTarefas();
    }

    
}
