package com.hendisantika.springthymeleafsample.controller;

import com.hendisantika.springthymeleafsample.entity.Post;
import com.hendisantika.springthymeleafsample.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-thymeleaf-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/07/18
 * Time: 07.08
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class PostController {
    @Autowired
    private PostService service;

    @GetMapping("/")
    public ModelAndView findAll() {

        ModelAndView mv = new ModelAndView("post");
        mv.addObject("posts", service.findAll());

        return mv;
    }

    @GetMapping("/add")
    public ModelAndView add(Post post) {

        ModelAndView mv = new ModelAndView("postAdd");
        mv.addObject("post", post);

        return mv;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {
        Optional<Post> postOpt = service.findById(id);
        Post post = postOpt.get();
        return add(post);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id) {

        service.delete(id);

        return findAll();
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid Post post, BindingResult result) {

        if(result.hasErrors()) {
            return add(post);
        }

        service.save(post);

        return findAll();
    }
}
