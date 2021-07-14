package aula05;

public class ClockTeste {
  public static void main(String[] args) {
    Clock relogio = new Clock("nike", 12, 56);

    System.out.println(relogio);
    relogio.setHour(14);
    relogio.setMinutes(25);
    System.out.println(relogio);
    System.out.println("O horário atual é "+relogio.getTime());
  }
}
