package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      
      Curso curso1 = new Curso("curso Java", "descricao curso java", 8);
      Curso curso2 = new Curso("curso JavaScript", "descricao curso js", 4);

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("mentoria de java");
      mentoria.setDescricao("descricao mentoria de java");
      mentoria.setData(LocalDate.now());

      System.out.println(curso1);
      System.out.println(curso2);
      System.out.println(mentoria);



    }
}