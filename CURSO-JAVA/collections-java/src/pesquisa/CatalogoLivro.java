package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    // deve possuir uma lista de objetos do tipo Livro como atributo;
    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    // Adicionar um livro ao catalogo;
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Pesquisa livros por autor;
    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    // Pesquisa livros publicados em um determinado intervalo de anos;
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicado() >= anoInicial && l.getAnoPublicado() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    // Pesquisa por titulo e retorna o primeiro livro encontrado;
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
