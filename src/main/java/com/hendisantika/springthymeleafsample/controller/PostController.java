package com.hendisantika.springthymeleafsample.controller;

import com.hendisantika.springthymeleafsample.entity.Post;
import com.hendisantika.springthymeleafsample.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

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
    public String findAll(ModelMap modelMap) {
        modelMap.addAttribute("posts", service.findAll());

        return "post";
    }

    @GetMapping("/add")
    public ModelAndView add(Post post) {

        ModelAndView mv = new ModelAndView("/postAdd");
        mv.addObject("post", post);

        return mv;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {

        return add(service.findOne(id));
    }

}
