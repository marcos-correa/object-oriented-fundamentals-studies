package aula07;

public class ProfessorTeste {
  public static void main(String[] args) {


    // Professor p1 = new Professor();
    Professor p2 = new Professor("Vinicius", 23, "Rua tal",123,"Jardim","PG", 43.000);
    // Professor p1 = new Professor("João", 23, {rua: "Rua tal",numero: 123, bairro: "Jardim", cidade: "PG"}, 23.000);
    // Professor p1 = new Professor("João", 23, Endereco("Rua tal",123,"Jardim","PG"), 23.000);
    p2.endereco.setBairro("bairro");

  }
}
