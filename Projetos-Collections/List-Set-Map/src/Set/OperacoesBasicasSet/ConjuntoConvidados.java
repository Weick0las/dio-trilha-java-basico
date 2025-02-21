package Set.OperacoesBasicasSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    //atributo
    private Set<Convidado> convidadosSet;
    
    //construtor
    public ConjuntoConvidados() {
       this.convidadosSet = new HashSet<>();
    }
    
    //métodos
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite)); //add do set precisa do objeto para adicionar
    }


    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover); //remove do set recebe um objeto, assim como o add.
    }
    

    public int contarConvidados(){
        return convidadosSet.size();
    }


    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    //teste
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Nickolas", 100);
        conjuntoConvidados.adicionarConvidado("Stephany", 101);
        conjuntoConvidados.adicionarConvidado("Jorge", 102);
        conjuntoConvidados.adicionarConvidado("Clonador", 102); // a sobrescrita feita não permitiu que o código de convite repetido fosse exibido
        conjuntoConvidados.adicionarConvidado("Renata", 103);

        conjuntoConvidados.exibirConvidados();
        System.out.println("O número de convidados é " + conjuntoConvidados.contarConvidados());
        
        System.out.println("Estamos removendo um dos convidados da lista");
        conjuntoConvidados.removerConvidado(102);
        System.out.println("O número de convidados é " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
    }

}  


