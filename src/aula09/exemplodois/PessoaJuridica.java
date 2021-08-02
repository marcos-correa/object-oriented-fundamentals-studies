package aula09.exemplodois;

public class PessoaJuridica extends Pessoa{
  private Integer numeroDeFuncionarios;
  private Double imposto;


  public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
    super(nome, rendaAnual);
    this.numeroDeFuncionarios = numeroDeFuncionarios;
  }

  @Override
  public void valorDeImpostoPago(){
    if(this.numeroDeFuncionarios > 15){
      this.imposto = this.rendaAnual*0.13;
      System.out.println("13%");
    }else{
      this.imposto = this.rendaAnual*0.18;
      System.out.println("18%");
    }

    System.out.println("Imposto Final: "+this.imposto);
  }

}
