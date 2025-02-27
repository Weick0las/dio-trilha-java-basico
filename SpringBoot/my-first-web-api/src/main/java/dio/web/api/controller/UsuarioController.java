package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;

@RestController
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository repository;
    
    @GetMapping("/users") //diferencia um mapp de outro através da URI
    public List<Usuario> getUsers(){
        return repository.listAll();
    }
    @GetMapping("/users/{nome}")
    public Usuario getOne(@PathVariable("nome") String nome){
        return repository.finByName(nome);
    }

    
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id")Integer id){
        repository.remove(id);
    }
    
    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
