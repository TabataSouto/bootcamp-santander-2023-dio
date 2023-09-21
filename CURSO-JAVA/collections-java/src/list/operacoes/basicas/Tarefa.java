package list.operacoes.basicas;;
/* Cada tarefa é representada por uma classe "Tarefa"
 que possui um atributo de descrição. */

public class Tarefa {
    // atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + "]";
    }

}
