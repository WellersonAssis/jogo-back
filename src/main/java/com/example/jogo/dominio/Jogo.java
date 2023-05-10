package com.example.jogo.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "jogo")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;



    private Integer nome;
    private Integer codjogo;
    private Integer anolancamento;
    private Integer genero;
    private Float valor;
    private Integer produtora;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getNome() {
        return nome;
    }

    public void setNome(Integer nome) {
        this.nome = nome;
    }

    public Integer getCodjogo() {
        return codjogo;
    }

    public void setCodjogo(Integer codjogo) {
        this.codjogo = codjogo;
    }

    public Integer getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(Integer anolancamento) {
        this.anolancamento = anolancamento;
    }

    public Integer getGenero() {
        return genero;
    }

    public void setGenero(Integer genero) {
        this.genero = genero;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Integer getProdutora() {
        return produtora;
    }

    public void setProdutora(Integer produtora) {
        this.produtora = produtora;
    }
}
