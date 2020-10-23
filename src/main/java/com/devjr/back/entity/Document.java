package com.devjr.back.entity;

import javax.persistence.*;

@Entity
@Table(name = "documento")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "documento_id_seq")
    @SequenceGenerator(name ="documento_id_seq",sequenceName = "documento_id_seq",allocationSize = 1)
    @Column(name = "documento_id")
    private long id;

    @Column(name = "tipo")
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
