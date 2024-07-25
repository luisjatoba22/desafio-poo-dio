package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      
      Curso curso1 = new Curso();
      curso1.setTitulo("curso Java");
      curso1.setDescricao("descricao curso java");
      curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();
      curso2.setTitulo("curso JavaScript");
      curso2.setDescricao("descricao curso js");
      curso2.setCargaHoraria( 4);

      // criando um objeto curso a partir da classe Conteudo

      // Conteudo curso3 = new Curso();



      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("mentoria de java");
      mentoria.setDescricao("descricao mentoria de java");
      mentoria.setData(LocalDate.now());

      // System.out.println(curso1);
      // System.out.println(curso2);
      // System.out.println(mentoria);

      BootCamp bootCamp = new BootCamp();

      bootCamp.setNome("developer");
      bootCamp.setDescricao("descricao");
      bootCamp.getConteudos().add(curso1);
      bootCamp.getConteudos().add(curso2);
      bootCamp.getConteudos().add(mentoria);
      

      Dev dev1 = new Dev();
      dev1.setNome("Luis");
      dev1.inscreverBootCamp(bootCamp);
      System.out.println("Conteudo Inscritos de "+dev1.getNome()+" "+ dev1.getConteudosInscritos());
      
      
      dev1.progredir();
      dev1.progredir();
      dev1.progredir();
      System.out.println("-");
      System.out.println("Conteudo Concluidos de "+dev1.getNome()+" "+ dev1.getConteudosConcluidos());
      System.out.println("Conteudo Inscritos de "+dev1.getNome()+" "+ dev1.getConteudosInscritos());
      System.out.println("-");
      System.out.println("XP atual: "+dev1.calcularXP());
      
      System.out.println("-----------------");
      
      Dev dev2 = new Dev();
      dev2.setNome("Joao");
      dev2.inscreverBootCamp(bootCamp);
      System.out.println("Conteudo Inscritos de "+dev2.getNome()+" "+ dev2.getConteudosInscritos());
      
      dev2.progredir();
      System.out.println("-");
      System.out.println("Conteudo Concluidos de "+dev2.getNome()+" "+ dev2.getConteudosConcluidos());
      System.out.println("Conteudo Inscritos de "+dev2.getNome()+" "+ dev2.getConteudosInscritos());
      
      System.out.println("-");
      System.out.println("XP atual: "+dev1.calcularXP());
      


    }
}