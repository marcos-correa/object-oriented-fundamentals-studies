package aula05;

public class ContaTeste {
  public static void main(String[] args) {
    Conta veiculo1 = new Conta("Uno","Fiat","ABC-1234",40.00);

    System.out.println(veiculo1.getMarca());
    System.out.println(veiculo1.getModelo());
    veiculo1.realizarLocacao("João", 2);
    System.out.println(veiculo1.getValorDiaria());
    System.out.println(veiculo1.getDiarias());
    System.out.println(veiculo1.imprimirValorLocacao(veiculo1.getDiarias()));
    // veiculo1.calcularValorLocacao(2);
  }
}
