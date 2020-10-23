package com.devjr.back.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_id_seq")
    @SequenceGenerator(name ="pessoa_id_seq",sequenceName = "pessoa_id_seq",allocationSize = 1)
    @Column(name = "pessoa_id")
    private long id;

    @Column
    private String nome;

    @OneToOne
    @JoinColumn(name = "conjuge_id",referencedColumnName = "pessoa_id")
    private Pessoa conjuge;

    @OneToMany(mappedBy = "pessoa")
    private List<Document> documents;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getConjuge() {
        return conjuge;
    }

    public void setConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
