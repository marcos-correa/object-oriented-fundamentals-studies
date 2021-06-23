package aula03;

public class Pessoa {
  String nome;
  Integer idade;
  Double peso;

  public void andar(){
    System.out.println(nome+" esta andando");
  }
  public void correr(){
    System.out.println(nome+" esta correndo");
    
  }
  public void falar(){
    System.out.println(nome+" esta falando");
  
  }

  public String toString(){
    return "Pessoa: "+nome+" / Idade "+idade+" / Peso"+peso;
  }

}
