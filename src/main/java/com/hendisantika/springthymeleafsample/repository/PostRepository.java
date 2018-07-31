package com.hendisantika.springthymeleafsample.repository;

import com.hendisantika.springthymeleafsample.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-thymeleaf-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/07/18
 * Time: 07.02
 * To change this template use File | Settings | File Templates.
 */

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
