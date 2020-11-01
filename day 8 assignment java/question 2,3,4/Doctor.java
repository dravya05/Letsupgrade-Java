import java.util.Scanner;
public class Doctor extends Employee{
   Scanner sc=new Scanner(System.in);
  String hospitalname;
  String speciality;
   
  public void getproperties(){
  System.out.println("Enter hospital name ");
  hospitalname=sc.nextLine();
  System.out.println("Enter speciality");
  speciality=sc.next();
  }
  public void displayproperties(){
  System.out.println(hospitalname+" "+speciality);
  }
}