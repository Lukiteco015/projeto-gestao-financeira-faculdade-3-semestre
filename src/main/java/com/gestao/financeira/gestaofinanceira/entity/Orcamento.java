package com.gestao.financeira.gestaofinanceira.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orcamento")
    private Long id;

    @Column(name = "ano_orcamento")
    private Integer anoOrcamento;

    @Column(name = "mes_orcamaneto")
    private String mesReferencia;

    @Column(name = "valor_definido_orcamento")
    private BigDecimal valorDefinido;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "orcamento", cascade = CascadeType.ALL)
    private List<CategoriaOrcamento> categorias;

    public Orcamento() {
    }

    public Orcamento(Long id, Integer anoOrcamento, String mesReferencia, BigDecimal valorDefinido, Usuario usuario, List<CategoriaOrcamento> categorias) {
        this.id = id;
        this.anoOrcamento = anoOrcamento;
        this.mesReferencia = mesReferencia;
        this.valorDefinido = valorDefinido;
        this.usuario = usuario;
        this.categorias = categorias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public BigDecimal getValorDefinido() {
        return valorDefinido;
    }

    public void setValorDefinido(BigDecimal valorDefinido) {
        this.valorDefinido = valorDefinido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getAnoOrcamento() {
        return anoOrcamento;
    }

    public void setAnoOrcamento(Integer anoOrcamento) {
        this.anoOrcamento = anoOrcamento;
    }

    public List<CategoriaOrcamento> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<CategoriaOrcamento> categorias) {
        this.categorias = categorias;
    }
}
