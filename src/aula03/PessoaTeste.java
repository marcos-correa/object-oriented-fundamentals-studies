package aula03;

public class PessoaTeste {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();
    Pessoa pessoa2 = new Pessoa();
    Pessoa pessoa3 = new Pessoa();

    pessoa1.nome = "Marcos";
    pessoa1.idade = 29;
    pessoa1.peso = 59.9;
    pessoa2.nome = "Juliana";
    pessoa2.idade = 20;
    pessoa2.peso = 54.0;
    pessoa3.nome = "Magna";
    pessoa3.idade = 45;
    pessoa3.peso = 75.0;
    
    pessoa2.falar();
    pessoa3.correr();
    pessoa1.andar();

    pessoa1.toString();
    System.out.println(pessoa1);
  }
}
