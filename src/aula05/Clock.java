package aula05;

public class Clock {

  private String mark;
  private int hour;
  private int minutes;
  private String time;

  public Clock(String mark, int hour, int minutes) {
    this.mark = mark;
    this.setHour(hour);
    this.setMinutes(minutes);
    this.setTime(hour,minutes);
  }

  //Getters
  public String getMark() {
    return mark;
  }
  public int getHour() {
    return hour;
  }
  public int getMinutes() {
    return minutes;
  }

  //Setters
  public void setHour(int hour) {
    if(hour <= 23 && hour > 0){
      this.hour = hour;
      this.setTime(hour, this.minutes);
    }else{
      System.out.println("Ops, erro nas horas.");
    }
  }
  public void setMinutes(int minutes) {
    if(minutes <= 59 && minutes > 0){
      this.minutes = minutes;
      setTime(this.hour, minutes);
    }else{
      System.out.println("Ops, erro nos minutos.");
    }
  }
  public void setTime(int hour,int minutes) {
    this.time = hour+"h"+minutes+"min";
  }
  public String getTime(){
    return this.time;
  }
  @Override
  public String toString() {
    return "Clock [hour=" + hour + ", mark=" + mark + ", minutes=" + minutes + "]";
  }
  

}
