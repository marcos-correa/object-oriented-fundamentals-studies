package aula03;

public class CarroTeste {
  public static void main(String[] args){

    Carro carro1 = new Carro();
    Carro carro2 = new Carro();
    Carro carro3 = new Carro();

    carro1.modelo = "458 Italia";
    carro1.marca = "Ferrari";
    carro1.ano = 2015;
    carro1.placa = "AAA-1234";
    carro1.cor = "Vermelho";

    carro2.modelo = "Fox";
    carro2.marca = "Volksvagem";
    carro2.ano = 2014;
    carro2.placa = "PUW-1234";
    carro2.cor = "Prata";
    
    carro3.modelo = "Uno";
    carro3.marca = "Fiat";
    carro3.ano = 1995;
    carro3.placa = "FIA-3421";
    carro3.cor = "Azul";

    System.out.println("Carro 1");
    System.out.println("Modelo "+carro1.modelo);
    System.out.println("Marca "+carro1.marca);
    System.out.println("Ano "+carro1.ano);
    System.out.println("Placa "+carro1.placa);
    System.out.println("Cor "+carro1.cor);
    System.out.println("==============");
    System.out.println("Carro 2");
    System.out.println("Modelo "+carro2.modelo);
    System.out.println("Marca "+carro2.marca);
    System.out.println("Ano "+carro2.ano);
    System.out.println("Placa "+carro2.placa);
    System.out.println("Cor "+carro2.cor);
    System.out.println("==============");
    System.out.println("Carro 3");
    System.out.println("Modelo "+carro3.modelo);
    System.out.println("Marca "+carro3.marca);
    System.out.println("Ano "+carro3.ano);
    System.out.println("Placa "+carro3.placa);
    System.out.println("Cor "+carro3.cor);

    carro1.acelerar();
    carro2.desligar();
    carro3.frear();
    carro1.acelerar();
  }
}
