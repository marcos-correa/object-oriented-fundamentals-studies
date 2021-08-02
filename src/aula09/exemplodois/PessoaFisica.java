package aula09.exemplodois;

public class PessoaFisica extends Pessoa {
  private Double gastoComSaude;
  private Double imposto;

  public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
    super(nome, rendaAnual);
    this.gastoComSaude = gastoComSaude;
  }

  @Override
  public void valorDeImpostoPago(){
    if(super.rendaAnual < 20.000){
      this.imposto = this.rendaAnual*0.15;
      System.out.println("15%");
    }else{
      this.imposto = this.rendaAnual*0.25;
      System.out.println("25%");
    }

    System.out.println("Imposto sem abatimentos: "+ this.imposto);
    System.out.println("Gasto com saude: "+ this.gastoComSaude);
    this.imposto = this.imposto-(this.gastoComSaude/2);
    System.out.println("Imposto Final: "+this.imposto);
  }

  
}
