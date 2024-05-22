package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de POO");
        curso1.setDescricao("Aprendendo tudo sobre programacao orientada a objetos");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso de Collections");
        curso1.setDescricao("Aprendendo tudo sobre Collections e programacao Funcional");
        curso1.setCargaHoraria(15);

        Mentorias mentoria1 = new Mentorias();

        mentoria1.setTitulo("Primeira Mentoria sobre Sintaxe Java");
        mentoria1.setDescricao("Apresentando a linguagem java e sua sintaxe");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Java");
        bootcamp.setDescricao("Bootcamp extensivo em Java POO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev dev1 = new Dev();
        dev1.setNome("Victor Felipe");
        dev1.inscreverBootcamp(bootcamp);
        Dev dev2 = new Dev();
        dev2.setNome("Jose Henrique");
        dev2.inscreverBootcamp(bootcamp);


        System.out.println("Conteudos Inscritos: Victor:" + dev1.getConteudosInscritos());
        System.out.println("Conteudos Inscritos: Joao:" + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: Victor:" + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: Joao:" + dev2.getConteudosInscritos());




    }
}
