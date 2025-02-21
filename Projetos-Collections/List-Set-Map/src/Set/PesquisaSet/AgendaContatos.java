package Set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    //atributo
    private Set<Contato> contatosSet;

    //construtor
    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    //métodos
    public void adicionarContato(String nome, int numeroTelefone){
        contatosSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContato(){
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for( Contato c : contatosSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    //teste
    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();
        
        agendaContatos.adicionarContato("Nickolas", 1197892789);
        agendaContatos.adicionarContato("Stephany Demarchi", 1167592889);
        agendaContatos.adicionarContato("Stephany Neves", 113578489);
        agendaContatos.adicionarContato("Stephany Almeida", 1128943887);
        agendaContatos.adicionarContato("Jorge", 1167567839);
        agendaContatos.adicionarContato("Renata", 1567843109);
        agendaContatos.adicionarContato("Stephany", 1167592889);
        agendaContatos.adicionarContato("Stephany", 1367582769); //não é exibida por já ter uma Stephany no set

        System.out.println("=============================================");
        agendaContatos.exibirContato();
        System.out.println("=============================================");
        System.out.println(agendaContatos.pesquisarPorNome("Stephany"));
        System.out.println("=============================================");
        System.out.println("Atualizando contato da Stephany Neves");
        System.out.println(agendaContatos.atualizarNumeroContato("Stephany Neves", 1175351982));
        System.out.println("=============================================");


    }
}
