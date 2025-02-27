package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        Usuario userFound = null;
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        for(Usuario u : listAll()){
            //new Usuario("gleyson","password");
            if(u.getId().compareTo(id) == 0){
                userFound = u;
                break;
            }
        
        }
        return new Usuario(userFound.getLogin(), userFound.getPassword());
    }
    public Usuario finByName(String login){
        
        System.out.println(String.format("GET/nome - Recebendo o nome: %s para localizar um usuário", login));
        Usuario userFound = null;
        for(Usuario u : listAll()){
            //new Usuario("gleyson","password");
            if(u.getLogin().equalsIgnoreCase(login)){
                userFound = u;
                break;
            }
        
        }
        return new Usuario(userFound.getLogin(), userFound.getPassword());
    }
}
