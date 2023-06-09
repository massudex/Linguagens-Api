package br.com.alura.linguagens.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LinguagemControle {
    @Autowired
    private Repository repositorio;
    
    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagems(){
        List<Linguagem> linguagens = repositorio.findAll();
        return linguagens;
    }

    @PostMapping("/linguagens")
    public Linguagem adicionarLinguagem(@RequestBody Linguagem linguagem){
        Linguagem linguagemSalva=repositorio.save(linguagem);
        return linguagemSalva;
    }
    



}
