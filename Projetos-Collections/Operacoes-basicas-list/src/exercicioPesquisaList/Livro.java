package exercicioPesquisaList;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    
    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //toString
    @Override
    public String toString() {

        return  "TÍtulo: " + titulo + "Autor: " + autor + " Ano de publicação: " + anoPublicacao;
    }
}
