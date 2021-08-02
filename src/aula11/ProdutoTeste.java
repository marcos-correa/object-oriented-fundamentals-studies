package aula11;

public class ProdutoTeste {
  public static void main(String[] args) {
    
    Produto produto = new Produto("Tal", 10.00, new IRPF());
    produto.valorComImposto();
  }
}
