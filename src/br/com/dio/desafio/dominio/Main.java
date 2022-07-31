package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){


        Curso curso1 = new Curso();

        curso1.setTitulo("Curso de POO");
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



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

         */

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Spring Framework");
        bootcamp.setDescricao("Bootcamp pela plataforma DIO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devEliab = new Dev();

        devEliab.setNome("Eliab");



        Dev devTayene = new Dev();

        devTayene.setNome("Tayene");
        devEliab.setNome("Eliab");


        devTayene.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos da Tay: " + devTayene.getConteudosInscritos());

        devTayene.progredir();

        System.out.println("Conteúdos Concluídos: " + devTayene.getConteudosConcluidos());
        System.out.println("Conteúdos Incritos da Tay: " + devTayene.getConteudosInscritos());
        System.out.println("XP total: " +devTayene.calcularTotalXp() + " XP");
        System.out.println("----------------------------------------------------");



        devEliab.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos do Eliab: " + devEliab.getConteudosInscritos());
        devEliab.progredir();
        devEliab.progredir();
        devEliab.progredir();


        System.out.println("Conteúdos Concluídos: " + devEliab.getConteudosConcluidos());
        System.out.println("Conteúdos Incritos do Eliab: " + devEliab.getConteudosInscritos());
        System.out.println("XP total: " +devEliab.calcularTotalXp() + " XP");
        System.out.println("----------------------------------------------------");






    }
}
