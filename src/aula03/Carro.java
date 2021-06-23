package aula03;

public class Carro {
  
  String modelo;
  String marca;
  Integer ano;
  String placa;
  String cor;

  public void ligar(){
    System.out.println(modelo+" esta ligando");
  }
  public void desligar(){
    System.out.println(modelo+" esta desligando");
  }
  public void acelerar(){
    System.out.println(modelo+" esta acelerando");
  }
  public void frear(){
    System.out.println(modelo+" esta freando");
  }
}
