package com.hendisantika.springthymeleafsample.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-thymeleaf-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/07/18
 * Time: 06.55
 * To change this template use File | Settings | File Templates.
 */
@Entity(name = "tbl_post")
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "post_seq", sequenceName = "post_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq")
    private Long id;

    @Column(nullable = false, length = 150) //Define propriedades da coluna
    @NotBlank(message = "Author is a required information.")
    //Define qual mensagem será exibida caso a validação da coluna falhar
    private String autor;

    @Column(nullable = false, length = 150)
    @NotBlank(message = "Title is a required information.")
    private String titulo;

    @Column(nullable = false)
    @Lob
    @NotBlank(message = "Text is mandatory information.")
    private String texto;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Data is mandatory information.")
    private Date data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}