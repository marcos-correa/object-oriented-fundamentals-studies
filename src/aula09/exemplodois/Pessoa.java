package aula09.exemplodois;

public class Pessoa {
  protected String nome;
  protected Double rendaAnual;

  public Pessoa(String nome, Double rendaAnual) {
    this.nome = nome;
    this.rendaAnual = rendaAnual;
  }

  public void valorDeImpostoPago(){
    System.out.println("Valor Pai");
  }

}
