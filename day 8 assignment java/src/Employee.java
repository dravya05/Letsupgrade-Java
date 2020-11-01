import java.util.Scanner;



public class Employee
{
   Scanner sc=new Scanner(System.in);
    private String name;
    private  int age;
    private double salary;
    private String designation;
  
  
  public void getdetails(){
  System.out.println("Enter your name");
   name=sc.next();
  System.out.println("Enter your age");
  age=sc.nextInt();
  System.out.println("Enter your designation") ;
  designation=sc.next();
  System.out.println("enter salary ");
  salary=sc.nextDouble();
  }

  public void displaydetails(){
  System.out.println(name+" "+age+"  "+salary+" "+designation);
  }
  
}