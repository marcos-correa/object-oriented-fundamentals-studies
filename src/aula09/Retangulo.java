package aula09;

public class Retangulo extends Quadrilatero{
  private Double base;
  
  private Double altura;
  
  public Retangulo(Double base, Double altura) {
    this.base = base;
    this.altura = altura;
  }

  public void calcularArea(){
    System.out.println("A área do retângulo é "+ this.base * this.altura);
  }
}
