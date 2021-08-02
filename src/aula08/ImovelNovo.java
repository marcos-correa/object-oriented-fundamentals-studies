package aula08;

public class ImovelNovo extends Imovel {
  private Double valorAdicional;

  public ImovelNovo(String endereco, Double valorBase, Double valorAdicional) {
    super( endereco, valorBase);
    this.valorAdicional = valorAdicional;
  }
  

}
