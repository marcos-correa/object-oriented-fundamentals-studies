package aula09;

public class Losango extends Quadrilatero {
  private Double diagonalMaior;
  private Double diagonalMenor;
  
  public Losango(Double diagonalMaior, Double diagonalMenor) {
    this.diagonalMaior = diagonalMaior;
    this.diagonalMenor = diagonalMenor;
  }

  public void calcularArea(){
    System.out.println("A área do quadrado é "+ (this.diagonalMaior * this.diagonalMenor)/2);
  }
  
}
