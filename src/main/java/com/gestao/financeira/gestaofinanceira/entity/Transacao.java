package com.gestao.financeira.gestaofinanceira.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transacao")
    private Long id;

    @Column(name = "valor_transacao")
    private BigDecimal valor;

    @Column(name = "data_transacao")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_meta", nullable = true)
    private Meta meta;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = true)
    private Usuario usuario;

    public Transacao() {
    }

    public Transacao(Long id, BigDecimal valor, Meta meta, LocalDate data, Usuario usuario) {
        this.id = id;
        this.valor = valor;
        this.meta = meta;
        this.data = data;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
