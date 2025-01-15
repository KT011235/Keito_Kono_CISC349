public class Contractor extends Employee{
  private int wage;

  public Contractor(String name, String jobTitle, String SSN, int wage){
    super(name, jobTitle, SSN);
    this.wage = wage;
  }
  public int getWage(){
    return this.wage;
  }
  public void setWage(int wage){
    this.wage = wage;
  }
}