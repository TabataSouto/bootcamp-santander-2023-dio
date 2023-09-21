package list.pesquisa;

public class Livro {
    // cada livro possui atributos como titulo, autor e ano de publicação
    private String titulo;
    private String autor;
    private int anoPublicado;

    public Livro(
            String titulo,
            String autor,
            int anoPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicado=" + anoPublicado + "]";
    }
}
