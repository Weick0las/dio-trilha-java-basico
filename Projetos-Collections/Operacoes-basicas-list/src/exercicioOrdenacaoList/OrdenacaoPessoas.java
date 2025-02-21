package exercicioOrdenacaoList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList); 
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas(); 

        listaPessoas.adicionarPessoa("Nickolas", 19, 1.85);
        listaPessoas.adicionarPessoa("Stephany", 20, 1.67);
        listaPessoas.adicionarPessoa("Jorge", 21, 1.87);
        listaPessoas.adicionarPessoa("Renata", 39, 1.73);

        
        System.out.println(listaPessoas.ordenarPorIdade());
        System.out.println(listaPessoas.ordenarPorAltura());
    }
}
