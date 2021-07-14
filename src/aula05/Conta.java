package aula05;

public class Conta {
   
  private String modelo;
  private String marca;
  private String placa;
  private double valorDiaria;
  private String nomeDoLocador;
  
  private int diarias;
  private boolean locado;
  
  public Conta(String modelo, String marca, String placa, double valorDiaria) {
    this.setModelo(modelo);
    this.setMarca(marca);
    this.setPlaca(placa);
    this.setValorDiaria(valorDiaria);
  }

  // Optei por informar os dias de locação já no ato de locar o carro.
  public void realizarLocacao(String nomeDoLocador, int diarias){
    if(!this.isLocado()){
      this.setNomeDoLocador(nomeDoLocador);
      this.setDiarias(diarias);
      this.setLocado(true);
      System.out.println("O veiculo"+ this.getModeloMarca() +" foi locado para "+this.getNomeDoLocador());
    }else{
      System.out.println("O carro já está locado.");
    }
  }
  
  public double calcularValorLocacao(int diarias){
    System.out.println("o valor da diária é");
    return this.getValorDiaria() * diarias;
  }

  public String imprimirValorLocacao(int diarias){
    return "Valor total da locação: "+ this.valorDiaria * diarias;
  }
  
  public void realizarDevolucao(int diarias){
    // Caso, na devolução, o número de dias superar o acordado, será considerado o maior.
    if(this.isLocado()){
      if(diarias < getDiarias()){
        this.setDiarias(diarias);
      }
      this.imprimirValorLocacao(getDiarias());
      System.out.println("Carro devolvido.");
      this.setLocado(false);
    }else{
      System.out.println("O carro não pode ser devolvido pois não foi locado.");
    }
  }


  // Getters 
  public String getModelo() {
    return modelo;
  }
  public String getMarca() {
    return marca;
  }
  public String getPlaca() {
    return placa;
  }
  public double getValorDiaria() {
    return valorDiaria;
  }
  public String getNomeDoLocador() {
    return nomeDoLocador;
  }
  public int getDiarias() {
    return diarias;
  }
  public boolean isLocado() {
    return locado;
  }

  // Setters
  // public setters
  public void setPlaca(String placa) {
    this.placa = placa;
  }
  public void setValorDiaria(double valorDiaria) {
    this.valorDiaria = valorDiaria;
  }
  
  // private setters
  private void setModelo(String modelo) {
    this.modelo = modelo;
  }
  private void setMarca(String marca) {
    this.marca = marca;
  }
  private void setNomeDoLocador(String nomeDoLocador) {
    this.nomeDoLocador = nomeDoLocador;
  }
  private void setDiarias(int diarias) {
    this.diarias = diarias;
  }
  private void setLocado(boolean locado) {
    this.locado = locado;
  }
  
  // Getters Personalizados
  public String getModeloMarca(){
    return this.getModelo()+"/"+this.getMarca();
  }
}
