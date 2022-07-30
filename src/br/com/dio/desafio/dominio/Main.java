package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){


        Curso curso1 = new Curso();

        curso1.setTitulo("POO");
        curso1.setDescricao("Programação Orientada a Objetos");
        curso1.setCargaHoraria(8);
        System.out.println();



        Curso curso2 = new Curso();

        curso2.setTitulo("Curso de Algoritmo");
        curso2.setDescricao("Introdução a Programação parte 1");
        curso2.setCargaHoraria(4);
        System.out.println();



        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria DIO");
        mentoria.setDataDaMentoria(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}
