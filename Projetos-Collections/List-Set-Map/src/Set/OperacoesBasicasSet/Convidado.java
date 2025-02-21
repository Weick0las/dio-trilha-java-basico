package Set.OperacoesBasicasSet;

import java.util.Objects;

public class Convidado {
    //atributos 
    private String nome;
    private int codigoConvite;

    //construtor
    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }
    
    //getters
    public String getNome() {
        return nome;
    }
    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" + "nome= " + nome + ' ' + "Código do convite= " + codigoConvite + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }
}
