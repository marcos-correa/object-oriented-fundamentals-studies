package aula02;

public class CarroTeste {
  public static void main(String[] args){

    Carro carro1 = new Carro("458 Italia", "Ferrari", 2015,"AAA-1234", "Vermelho");
    Carro carro2 = new Carro("Fox", "Volks", 2014,"PUW-1234", "Prata");
    Carro carro3 = new Carro("Uno", "Fiat", 1995,"FIA-1235", "Azul");

    System.out.println(carro1);
    System.out.println(carro2);
    System.out.println(carro3);
  }
}
