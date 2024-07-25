package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
  
  
  private LocalDate data;

  
  
  
  @Override
  public String toString() {
    return "Mentoria [data=" + data + ", calcularXP()=" + calcularXP() + ", getTitulo()=" + getTitulo()
        + ", getDescricao()=" + getDescricao() + "]";
  }



  @Override
  public double calcularXP() {
    return XP_PADRAO + 20;
  }
  
   

    /**
     * @return LocalDate return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.data = data;
    }


}