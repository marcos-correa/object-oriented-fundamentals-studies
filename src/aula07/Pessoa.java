package aula07;

public class Pessoa {
  protected String nome;
  protected Integer idade;
  protected Endereco endereco;
  
  
  public Pessoa(String nome, Integer idade, String rua, Integer numero, String bairro, String cidade) {
    this.nome = nome;
    this.idade = idade;
    this.endereco = new Endereco(rua, numero, bairro, cidade);
    // this.endereco = endereco;
  }

  
}
