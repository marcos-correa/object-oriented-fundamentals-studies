package aula02;

public class Carro {

  String modelo;
  String marca;
  int ano; 
  String placa;
  String cor;
  boolean ligado;
  int velocidade;

  public Carro(String modelo, String marca, int ano, String placa, String cor){
    this.modelo = modelo;
    this.marca = marca;
    this.ano = ano;
    this.placa = placa;
    this.cor = cor;
    this.ligado = false;
    this.velocidade = 0;
  }

  public void ligar(){
    
  }
  public void desligar(){

  }
  public void acelerar(){

  }
  public void frear(){

  }
  public String toString(){
    return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ "ligado=" + ligado + "velocidade=" + velocidade + "]";
  }

}
