package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate dataDaMentoria;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(){


    }

    public Mentoria(String titulo, String descricao, LocalDate dataDaMentoria) {
        super(titulo,descricao);
        this.dataDaMentoria = dataDaMentoria;
    }

    public LocalDate getDataDaMentoria() {
        return dataDaMentoria;
    }

    public void setDataDaMentoria(LocalDate dataDaMentoria) {
        this.dataDaMentoria = dataDaMentoria;
    }

    @Override
    public String toString() {
        return   getTitulo() + ", " +
                "Descrição: " + getDescricao() + ", " +
                "Data da Mentoria: " + getDataDaMentoria() +
                 "\n";
    }
}



