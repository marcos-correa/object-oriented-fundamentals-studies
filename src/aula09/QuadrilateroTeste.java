package aula09;

import java.util.Scanner;

public class QuadrilateroTeste {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Quadrilatero quadrilatero = null;

    System.out.println("Selecione o tipo de quadrilátero:");
    System.out.println("1. quadrado");
    System.out.println("2. retangulo");
    System.out.println("3. losango");

    Integer opcao = input.nextInt();

    switch (opcao) {
      case 1:
        quadrilatero = new Quadrado(10.1);  
        break;
      case 2:
        quadrilatero = new Retangulo(21.2,21.1);  
        break;
    
      case 3:
        quadrilatero = new Losango(21.2,21.1);  
        break;
      default:
        System.out.println("None");
        break;
    }

    quadrilatero.calcularArea();
  }
}
