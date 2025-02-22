package Map.PesquisaMap;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    //construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "[" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    //não vamos sobrescrever o equals() e o hashcode(), pois a chave já irá conter um valor único.
    
}
