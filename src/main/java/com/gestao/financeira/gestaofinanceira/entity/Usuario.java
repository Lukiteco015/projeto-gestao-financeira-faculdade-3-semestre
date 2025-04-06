package com.gestao.financeira.gestaofinanceira.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_usuario")
    private Long id;

    @Column (name = "nome_usuario")
    private String nome;

    @Column (name = "senha_usuario")
    private String senha;

    @Column (name = "email_usuario")
    private String email;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Orcamento> orcamentos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Meta> metas;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Transacao> transacoes;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String senha, String email, List<Orcamento> orcamentos, List<Meta> metas, List<Transacao> transacoes) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.orcamentos = orcamentos;
        this.metas = metas;
        this.transacoes = transacoes;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public void setOrcamentos(List<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }

    public List<Meta> getMetas() {
        return metas;
    }

    public void setMetas(List<Meta> metas) {
        this.metas = metas;
    }
}
