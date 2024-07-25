package br.com.dio.desafio.dominio;

public abstract class Conteudo {
  // nao é possível instanciar um abstract
    
  // constante =  final
  // protected = somente as filhas tem acesso
  // static = pode ser acessado fora da classe

  public static final double XP_PADRAO =10d;
  private String titulo;
  private String descricao;

  public abstract double calcularXP();


    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

}