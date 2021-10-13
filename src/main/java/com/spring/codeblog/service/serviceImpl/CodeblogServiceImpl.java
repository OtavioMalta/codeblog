package com.spring.codeblog.service.serviceImpl;

import java.util.List;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Diz ao spring que é uma classe gerenciada por ele (bean)
public class CodeblogServiceImpl implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogRepository;


    @Override // Como são de uma interface, é necessário implementar seus métodos, Override serve para sobrescreve-los
    public List<Post> findAll() {
        return codeblogRepository.findAll(); //Possui todos esses métodos ja prontos ao extender o JPARepository no repositório 
    }

    @Override
    public Post findById(long id) {
        return codeblogRepository.findById(id).get(); //'.get' pois a função findById retornaum Optional e não um Long
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
}