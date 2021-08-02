package aula11;

public class Produto {
  private String produto;
  private Double valor;
  private Imposto imposto;
  private Double valorTotal;
  
  public Produto(String produto, Double valor, Imposto imposto) {
    this.produto = produto;
    this.valor = valor;
    this.imposto = imposto;
  }
  public Double calcularValorComImposto(){
    return this.valor + (this.valor * this.imposto.percentualImposto());
    
  }
  public void valorComImposto(){
    System.out.println("Valor normal: "+ this.valor);
    System.out.println("Valor com tributo: " + this.calcularValorComImposto());

  }

}
