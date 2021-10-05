package com.spring.codeblog.service;

import com.spring.codeblog.model.Post;
import java.util.List;

public interface CodeblogService {
    
    List<Post> findAll(); // Método que retorna uma lista de posts, sem argumentos
    Post findById(long id); // Metodo que retorna um unico post que preisa e um id como argumento
    Post save(Post post); // metodo que recebe um post para salvar no bd
}
