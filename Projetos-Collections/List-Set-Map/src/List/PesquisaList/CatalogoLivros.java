package List.PesquisaList;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    
    private List<Livro> livroList;    

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>(); 
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        
        catalogoLivros.adicionarLivro("Livro 1 ", "Autor 1",   2020);
        catalogoLivros.adicionarLivro("Livro 1 ", "Autor 2",   2021);
        catalogoLivros.adicionarLivro("Livro 3 ", "Autor 2",   2023);
        catalogoLivros.adicionarLivro("Livro 4 ", "Autor 4",   2023);
        catalogoLivros.adicionarLivro("Livro 5 ", "Autor 5",   2024);
        catalogoLivros.adicionarLivro("Livro 6 ", "Autor 6",   2025);

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2023));

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

    }

}