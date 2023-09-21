
package list.operacoes.basicas;
/* A classe chamada "ListaTarefa" deve ter uma
 uma lista de tarefas como atributo. */

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	// atributo
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}

	// implemente os métodos
	// Adiciona uma noca tarefa à lista com a descrição fornecida
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}

	// Remove uma tarefa da lista com base em sua descrição
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}

	// Retorna o número total de tarefas
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}

	// Retorna uma lista contendo a descição de todas as tarefas na lista;
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
}
