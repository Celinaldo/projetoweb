package com.devjr.back.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "empresa_id")
    @SequenceGenerator(name = "empresa_id",sequenceName = "empresa_id",allocationSize = 1)
    @Column(name = "empresa_id")
    private long id;



    @Column(name = "nome")
    private String nome;

    @ManyToMany
    @JoinTable(
            name = "pessoa_empresa",
            joinColumns = @JoinColumn(name = "empresa_id"),
            inverseJoinColumns = @JoinColumn(name = "pessoa_id")
    )
    private List<Pessoa> funcionarios;

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

    public List<Pessoa> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Pessoa> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
