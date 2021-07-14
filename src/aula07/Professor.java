package aula07;

public class Professor extends Pessoa {
  private Double salario;



  public Professor(String nome, Integer idade, String rua, Integer numero, String bairro, String cidade, Double salario) {
    super(nome, idade, rua, numero, bairro, cidade);

    this.salario = salario;
  }


  public void calcularSalario(){
    System.out.println("Calculando"+ this.salario);
  }
}
