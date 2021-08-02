package aula09;

public class Quadrado extends Quadrilatero{
  private Double lado;

  public Quadrado(Double lado) {
    this.lado = lado;
  }

  public void calcularArea(){
    System.out.println("A área do quadrado é "+ this.lado * this.lado);
  }


}
