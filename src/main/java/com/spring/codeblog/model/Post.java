package com.spring.codeblog.model;

import javax.persistence.*;
import java.time.LocalDate;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="TB_POST")
public class Post{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank
    private String titulo;

    @NotBlank
    private String autor;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy") // passa o formato em que a data sera salva
    private LocalDate data;

    @NotBlank
    @Lob //Faz com que o bd aceite valores grandes e melhora a performace
    private String texto;

    public Long getId(){
        return id;
    }
}
