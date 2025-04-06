package com.gestao.financeira.gestaofinanceira.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Meta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_meta")
    private Long id;

    @Column(name = "valor_meta")
    private Double valorMeta;

    @Column(name = "valor_atual")
    private Double valorAtual;

    @Column(name = "status_meta")
    private String statusMeta;

    @Column(name = "data_criacao")
    private LocalDate dataCriacao;

    @Column(name = "titulo_meta")
    private String tituloMeta;

    @Column(name = "descricao_meta")
    private String descricaoMeta;

    @Column(name = "data_limite")
    private LocalDate dataLimite;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "meta", cascade = CascadeType.ALL)
    private List<Transacao> transacaos;

    public Meta() {
    }

    public Meta(Long id, Double valorMeta, Double valorAtual, String statusMeta, LocalDate dataCriacao, String tituloMeta, String descricaoMeta, LocalDate dataLimite, Usuario usuario) {
        this.id = id;
        this.valorMeta = valorMeta;
        this.valorAtual = valorAtual;
        this.statusMeta = statusMeta;
        this.dataCriacao = dataCriacao;
        this.tituloMeta = tituloMeta;
        this.descricaoMeta = descricaoMeta;
        this.dataLimite = dataLimite;
        this.usuario = usuario;
    }

    public List<Transacao> getTransacaos() {
        return transacaos;
    }

    public void setTransacaos(List<Transacao> transacaos) {
        this.transacaos = transacaos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(Double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public Double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(Double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public String getStatusMeta() {
        return statusMeta;
    }

    public void setStatusMeta(String statusMeta) {
        this.statusMeta = statusMeta;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getTituloMeta() {
        return tituloMeta;
    }

    public void setTituloMeta(String tituloMeta) {
        this.tituloMeta = tituloMeta;
    }

    public String getDescricaoMeta() {
        return descricaoMeta;
    }

    public void setDescricaoMeta(String descricaoMeta) {
        this.descricaoMeta = descricaoMeta;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
