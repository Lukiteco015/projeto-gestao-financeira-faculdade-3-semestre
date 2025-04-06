package com.gestao.financeira.gestaofinanceira.entity;

import jakarta.persistence.*;

@Entity
public class CategoriaOrcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id;

    @Column(name = "nome_categoria")
    private String nome;

    @Column(name = "valor_planejado_categoria")
    private Double valorPlanejado;

    @ManyToOne
    @JoinColumn(name = "id_orcamento")
    private Orcamento orcamento;

    public CategoriaOrcamento() {
    }

    public CategoriaOrcamento(Long id, String nome, Double valorPlanejado, Orcamento orcamento) {
        this.id = id;
        this.nome = nome;
        this.valorPlanejado = valorPlanejado;
        this.orcamento = orcamento;
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

    public Double getValorPlanejado() {
        return valorPlanejado;
    }

    public void setValorPlanejado(Double valorPlanejado) {
        this.valorPlanejado = valorPlanejado;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
}
