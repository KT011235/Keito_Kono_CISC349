// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Employee> array = new ArrayList<Employee>();
    array.add(new Employee("Frankie Brown", "Developer", "123-45-6789"));
    array.add(new PartTimeEmployee("Frank White", "Janitor", "123-45-6780", 20));
    array.add(new Contractor("Anna Bond", "Manager", "123-45-6781", 20));
    
    Scanner scanner = new Scanner(System.in);

    boolean running = true;
    while (running){
      System.out.println("Choose an option");
      System.out.println("add: Add an employee");
      System.out.println("remove: Remove an employee");
      System.out.println("view: View employee information");
      System.out.println("exit: Exit the program");
      String text = scanner.nextLine();
      
      if (text.equals("add")) {
        System.out.println("Are you adding an employee, part-time employee or a contractor?");
        System.out.println("Type 1 for employee, 2 for part-time employee, 3 for contractor");
        String employeeType = scanner.nextLine();
        
        System.out.println("Enter the employee's name");
        String name = scanner.nextLine();
        System.out.println("Enter the employee's job title");
        String jobTitle = scanner.nextLine();
        System.out.println("Enter the employee's SSN (XXX-XX-XXXX)");
        String SSN = scanner.nextLine();

        if (employeeType.equals("1")){
          array.add(new Employee(name, jobTitle, SSN));
        }

        if (employeeType.equals("2")){
          System.out.println("Enter the employee's hours");
          int hours = scanner.nextInt();
          array.add(new PartTimeEmployee(name, jobTitle, SSN, hours));
        }
        if (employeeType.equals("3")){
          System.out.println("Enter the employee's wage");
          int wage = scanner.nextInt();
          array.add(new Contractor(name, jobTitle, SSN, wage));
        }
        
      } else if (text.equals("remove")) {
        for (Employee employee : array) {
          System.out.println(array.indexOf(employee) + ": " + employee.getName());
        }
        System.out.println("Enter the index of the employee you want to remove");
        int index = Integer.parseInt(scanner.nextLine());
        array.remove(index);
        
        } else if (text.equals("view")) {
        for (Employee employee : array) {
          System.out.println(array.indexOf(employee) + ": " + employee.getName());
        }
      } else if (text.equals("exit")){
          running = false;
      } else {
        System.out.println("Please enter a valid input");
      }
  }
  scanner.close();
}}