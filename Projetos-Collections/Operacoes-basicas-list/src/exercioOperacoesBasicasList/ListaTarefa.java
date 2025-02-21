package exercioOperacoesBasicasList;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;
    
    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);    
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        //System.out.println(tarefaList); dessa forma só mostrará o endereço de memória das tarefas
        System.out.println(tarefaList.toString()); //sobrescrever o toString na classe tarefa
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        
        listaTarefa.adicionarTarefa("Aprender Java");
        listaTarefa.adicionarTarefa("Ler");
        listaTarefa.adicionarTarefa("Ler");
        listaTarefa.adicionarTarefa("Se exercitar");
        
        System.out.println("O número de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());
        
        String descricaoExcluida = "Ler";
        System.out.println("Excluindo a descrição: " + descricaoExcluida);
        listaTarefa.removerTarefa(descricaoExcluida);
        System.out.println("O número de elementos agora é " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
