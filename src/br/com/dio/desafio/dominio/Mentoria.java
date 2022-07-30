package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    private String titulo;
    private String descricao;
    private LocalDate dataDaMentoria;

    public Mentoria(){


    }

    public Mentoria(String titulo, String descricao, LocalDate dataDaMentoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataDaMentoria = dataDaMentoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDaMentoria() {
        return dataDaMentoria;
    }

    public void setDataDaMentoria(LocalDate dataDaMentoria) {
        this.dataDaMentoria = dataDaMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataDaMentoria=" + getDataDaMentoria() +
                '}';
    }
}



