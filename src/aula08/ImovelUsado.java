package aula08;

public class ImovelUsado extends Imovel {
  private Double valorDesconto;

  public ImovelUsado(String endereco, Double valorBase, Double valorDesconto) {
    super( endereco, valorBase);
    this.valorDesconto = valorDesconto;
  }

  public void imprimirDados(){
    super.imprimirDados();
    System.out.println("Valor desconto: "+ this.valorDesconto);
  }

}
