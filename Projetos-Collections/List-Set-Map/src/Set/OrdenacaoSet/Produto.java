package Set.OrdenacaoSet;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    //atributos
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    //construtor
    public Produto(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
 
    //getters
    public String getNome() {
        return nome;
    }
    public long getCodigo() {
        return codigo;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return " |" + nome + " Código: " + codigo + " Qtd: " + quantidade + " preço: " + preco + "| ";
    }

    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }
 
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
