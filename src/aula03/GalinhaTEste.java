package aula03;

public class GalinhaTEste {
  
  public static void main(String[] args) {
    
    Galinha galinha1 = new Galinha();
    Galinha galinha2 = new Galinha();
    Galinha galinha3 = new Galinha();
  
    galinha1.nome = "Giselda";
    galinha2.nome = "Giselda";
    galinha3.nome = "Giselda";

    galinha1.botar();
    galinha1.botar();
    galinha3.botar();
    galinha2.botar();
    galinha2.botar();
    galinha1.botar();

    System.out.println(galinha1.nome+": "+galinha1.quantidadeOvos);
    System.out.println(galinha2.nome+": "+galinha2.quantidadeOvos);
    System.out.println(galinha3.nome+": "+galinha3.quantidadeOvos);

    System.out.println("Quantidade total de ovos "+ Galinha.quantidadeOvosGranja);
  }

}
