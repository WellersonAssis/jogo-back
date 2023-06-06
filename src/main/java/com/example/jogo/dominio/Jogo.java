package com.example.jogo.dominio;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "jogo")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    @Column(length = 10)
    private String codjogo;

    private String anolancamento;

    private String genero;
    private Float valor;
    private String produtora;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private Date dataHoraCadastro;

    public Jogo() {
        this.setDataHoraCadastro(new Date());

    }



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

    public String getCodjogo() {
        return codjogo;
    }

    public void setCodjogo(String codjogo) {
        this.codjogo = codjogo;
    }

    public String getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(String anolancamento) {
        this.anolancamento = anolancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public Date getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(Date dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}