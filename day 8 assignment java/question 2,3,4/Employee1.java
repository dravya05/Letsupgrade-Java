import java.util.Scanner;



public class Employee1
{
   Scanner sc=new Scanner(System.in);
  String name;
  int age;
  double salary;
  
  
  
  public void getdetails(){
  System.out.println("Enter your name");
   name=sc.next();
  System.out.println("Enter your age");
  age=sc.nextInt();
  
  System.out.println("enter salary ");
  salary=sc.nextDouble();
  }

  public void displaydetails(){
  System.out.println("name: "+name+ "   age: " +age+"  salary:  "+salary);
  }
  
}