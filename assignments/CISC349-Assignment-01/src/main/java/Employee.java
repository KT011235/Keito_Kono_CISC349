public class Employee{
  private String name;
  private String jobTitle;
  private String SSN;

  public Employee(String name, String jobTitle, String SSN){
    this.name = name;
    this.jobTitle = jobTitle;
    this.SSN = SSN;
  }
  public String getName(){
    return this.name;
  }
  public String getJobTitle(){
    return this.jobTitle;
  }
  public String getSSN(){
    return this.SSN;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setJobTitle(String jobTitle){
    this.jobTitle = jobTitle;
  }
  public void setSSN(String SSN){
    this.SSN = SSN;
  }
}

