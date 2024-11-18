package com.accenture.desafiojava.model;

import java.util.Date;
import java.util.Set;
import jakarta.persistence.*;

@Entity
public class Aluno {

    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Valor será gerado pelo BD
    private Integer id;
    private String nome;
    private String email;
    private Date dataCadastro;


    //Relacionamento muitos para muitos
    @ManyToMany(mappedBy = "alunos")
    private Set<Curso> cursos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }
}

