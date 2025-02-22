package Map.PesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos
    Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!(estoqueProdutosMap.isEmpty())){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade()*p.getPreco();
            }
        }
        else{
            System.out.println("Estoque vazio");
        }
        return valorTotalEstoque; 
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!(estoqueProdutosMap.isEmpty())){   
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro; 
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!(estoqueProdutosMap.isEmpty())){   
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        else{
            System.out.println("Estoque vazio");
        }
        return produtoMaisBarato; 
    }


    //testes
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
    
        // Exibe o estoque vazio
        estoque.exibirProdutos();
    
        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1500.0, 1);
        estoque.adicionarProduto(2L, "Mouse", 25.0, 5);
        estoque.adicionarProduto(3L, "Monitor", 400.0, 10);
        estoque.adicionarProduto(4L, "Teclado", 40.0, 2);
    
        // Exibe os produtos no estoque
        estoque.exibirProdutos();
    
        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    
        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
    
      }

}
