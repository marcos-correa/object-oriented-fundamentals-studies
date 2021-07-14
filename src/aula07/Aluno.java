package aula07;

public class Aluno extends Pessoa {
  private String curso;

  public Aluno(String nome, Integer idade,  String rua, Integer numero, String bairro, String cidade, String curso) {
    super(nome, idade, rua, numero, bairro, cidade);

    this.curso = curso;
  }

  // public Aluno(String nome, Integer idade, String endereco, String curso) {
  //   super(nome, idade, endereco);
  //   this.curso = curso;
  // }
  public void fazerMatricula(String curso){
    System.out.println("Matricula do curso "+this.curso+"realizada");
  }

  
}
