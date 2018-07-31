package com.hendisantika.springthymeleafsample.service;

import com.hendisantika.springthymeleafsample.entity.Post;
import com.hendisantika.springthymeleafsample.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-thymeleaf-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/07/18
 * Time: 07.05
 * To change this template use File | Settings | File Templates.
 */
@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public List<Post> findAll() {
        return repository.findAll();
    }

    public Post findOne(Long id) {
        return repository.findOne(id);
    }

    public Post save(Post post) {
        return repository.saveAndFlush(post);
    }

    public void delete(Long id) {
        repository.delete(id);
    }

}