package set.operacoes.basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidados;

    public ConjuntoConvidado() {
        this.convidados = new HashSet<>();
    }

    // adiciona um convidado
    public void adicionarConvidade(String nome, int codigoConvite) {
        convidados.add(new Convidado(nome, codigoConvite));
    }

    // remover convidado pelo condigo do convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidados) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conv = new ConjuntoConvidado();
        conv.adicionarConvidade("Tabata", 1);
        conv.adicionarConvidade("Marco", 2);
        conv.adicionarConvidade("Maria", 3);
        conv.exibirConvidados();
    }
}
