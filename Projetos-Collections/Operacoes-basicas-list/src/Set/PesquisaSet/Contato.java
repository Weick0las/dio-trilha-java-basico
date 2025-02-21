package Set.PesquisaSet;

import java.util.Objects;


public class Contato {
    //atributos
    private String nome;
    private int numeroTelefone;

    //construtor
    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    //setters
    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }


    //métodos reescritos
    @Override
    public String toString() {
        return "| " + nome + ' ' + numeroTelefone + " | ";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Contato contato)) return false;
        return getNome() == contato.getNome();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

}
