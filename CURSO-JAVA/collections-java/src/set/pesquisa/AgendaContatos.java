package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    // adicionar contato
    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    // exibir contatos
    public void exibirContatos() {
        System.out.println(contatos);
    }

    // pesquisar CONTATOS pelo nome;
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato c : contatos) {
            /*
             * startsWith = método que trás como resultado
             * tudo o que começa com a palavra passada
             */
            if (c.getNome().startsWith(nome)) {
                contatosEncontrados.add(c);
            }
        }
        return contatosEncontrados;
    }

    // atualizar telefone de um contato
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
