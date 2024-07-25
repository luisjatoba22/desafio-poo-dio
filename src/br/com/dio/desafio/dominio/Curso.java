package br.com.dio.desafio.dominio;

public class Curso {
    private String título;
    private String descricao;
    private  int cargaHoraria;

    

    public Curso(String título, String descricao, int cargaHoraria) {
      this.título = título;
      this.descricao = descricao;
      this.cargaHoraria = cargaHoraria;
    }

    

    @Override
    public String toString() {
      return "Curso [título=" + título + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
    }



    /**
     * @return String return the título
     */
    public String getTítulo() {
        return título;
    }

    /**
     * @param título the título to set
     */
    public void setTítulo(String título) {
        this.título = título;
    }

    /**
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return int return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}