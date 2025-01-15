public class PartTimeEmployee extends Employee{
  private int hours;

  public PartTimeEmployee(String name, String jobTitle, String SSN, int hours){
    super(name, jobTitle, SSN);
    this.hours = hours;
  }
  public int getHours(){
    return this.hours;
  }
  public void setHours(int hours){
    this.hours = hours;
  }
}