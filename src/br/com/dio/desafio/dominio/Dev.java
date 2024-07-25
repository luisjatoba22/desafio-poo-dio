package br.com.dio.desafio.dominio;


import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet();


  public void inscreverBootCamp(BootCamp bootCamp){
    this.conteudosInscritos.addAll(bootCamp.getConteudos());
    bootCamp.getDevsInscritos().add(this);  
  };

  public void progredir(){
    Optional<Conteudo> conteudo =  this.conteudosInscritos.stream().findFirst();
    if(conteudo.isPresent()){
      this.conteudosConcluidos.add(conteudo.get());
      this.conteudosInscritos.remove(conteudo.get());
    } else {
      System.err.println("Voce nao esta matricula em nenhum conteudo");
    }

  };

  public double calcularXP(){
    return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
  };

  

  

    @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
    result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Dev other = (Dev) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (conteudosInscritos == null) {
      if (other.conteudosInscritos != null)
        return false;
    } else if (!conteudosInscritos.equals(other.conteudosInscritos))
      return false;
    if (conteudosConcluidos == null) {
      if (other.conteudosConcluidos != null)
        return false;
    } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
      return false;
    return true;
  }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Set<Conteudo> return the conteudosInscritos
     */
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    /**
     * @param conteudosInscritos the conteudosInscritos to set
     */
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    /**
     * @return Set<Conteudo> return the conteudosConcluidos
     */
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    /**
     * @param conteudosConcluidos the conteudosConcluidos to set
     */
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

}