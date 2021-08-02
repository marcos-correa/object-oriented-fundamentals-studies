package aula09.exemplodois;

import java.util.Scanner;

public class PessoaTeste {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Pessoa pessoa = null;

    System.out.println("Selecione o tipo de pessoa");
    System.out.println("1. Fisica");
    System.out.println("2. juridica");

    Integer opcao = input.nextInt();
    switch (opcao) {
      case 1:
        pessoa = new PessoaFisica("Fulana", 20001.00, 4500.00);
        break;
      case 2:
        pessoa = new PessoaJuridica("Cicrana", 20001.00, 12);
        break;

      default:
        break;
    }
    pessoa.valorDeImpostoPago();
    
    input.close();
  }
}
